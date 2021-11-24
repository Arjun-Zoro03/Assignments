package arjun.assignment.data;

public class NegativeNumberException extends Exception{
    public NegativeNumberException(){
        System.out.println("You have entered a negative number, age can only be a positive number!");
    }
}
