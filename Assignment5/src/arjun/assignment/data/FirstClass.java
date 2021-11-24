package arjun.assignment.data;

public class FirstClass {
    int intMember;
    char charMember;

    public static void printLocalVariables() {
        int localIntVariable;
        char localCharVariable;
//        System.out.println("int: " + localIntVariable);
//        System.out.println("char: " + localCharVariable);
        //WE CANNOT PRINT LOCAL VARIABLES WITHOUT INITIALIZATION AS THEY DON'T GET A DEFAULT VALUE
    }

    public void printMembers(){
        System.out.println("int: " + intMember);
        System.out.println("char: " + charMember);
    }
}
