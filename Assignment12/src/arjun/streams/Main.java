package arjun.streams;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Student> students = StudentDetails.getStudentsList();
        StreamCall streamCall = new StreamCall(students);

//        streamCall.printDepartmentNames();
//        streamCall.printNamesOfStudentsEnrolledAfter(2018);
//        streamCall.printMaleStudentDetails("Computer Science");
//        streamCall.printNumberOfMaleAndFemaleStudents();
//        streamCall.printAverageAgeOfMaleAndFemaleStudents();
//        streamCall.printHighestStudentWithHighestPackage();
//        streamCall.printNumberOfStudentsInEachDepartment();
//        streamCall.printAveragePercentageInEachDepartment();
//        streamCall.printYoungestMaleInDepartment("Electronic");
//        streamCall.printNumberOfMaleAndFemaleStudentsInDepartment("Computer Science");
    }
}
