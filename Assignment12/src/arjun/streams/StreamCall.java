package arjun.streams;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamCall {
    private final Stream<Student> studentStream;
    StreamCall(Stream<Student> studentStream){
        this.studentStream = studentStream;
    }

    public void printDepartmentNames(){
        studentStream.map(Student::getEngDepartment).distinct().forEach(System.out::println);
    }

    public void printNamesOfStudentsEnrolledAfter(int year){
        studentStream
                .filter(student -> student.getYearOfEnrollment() > year)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public void printMaleStudentDetails(String department){
        studentStream
                .filter(student -> student.getGender().equals("Male"))
                .filter(student -> student.getEngDepartment().equals(department))
                .forEach(System.out::println);
    }

    public void printNumberOfMaleAndFemaleStudents(){
        Map<String,Long> genderCount= studentStream
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        System.out.println(genderCount);
    }

    public void printAverageAgeOfMaleAndFemaleStudents(){
        System.out.println(studentStream
                .collect(Collectors.groupingBy(Student::getGender,averagingInt(Student::getAge)))
        );
    }

    public void printHighestStudentWithHighestPackage(){
        System.out.println(studentStream
                .max(Comparator.comparing(Student::getPerTillDate))
        );
    }

    public void printNumberOfStudentsInEachDepartment(){
        System.out.println(studentStream
                .collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting())));
    }

    public void printAveragePercentageInEachDepartment(){
        System.out.println(studentStream
                .collect(Collectors.groupingBy
                        (Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate)))
        );
    }

    public void printYoungestMaleInDepartment(String departmentName){
        System.out.println(studentStream
                .filter(student -> student.getGender().equals("Male"))
                .filter(student -> student.getEngDepartment().equals(departmentName))
                .min(Comparator.comparing(Student::getAge))
        );
    }

    public void printNumberOfMaleAndFemaleStudentsInDepartment(String departmentName){
        System.out.println(studentStream
                .filter(student -> student.getEngDepartment().equals(departmentName))
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()))
        );
    }
}
