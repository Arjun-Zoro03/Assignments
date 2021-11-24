package arjun.assignment.data;

public class AnotherClass {
    String nonStaticMember;

    public static AnotherClass staticMethod(String nonStaticMember){
        //this.nonStaticMember = nonStaticMember; //WE CANNOT ACCESS NON-STATIC VARIABLE IN A STATIC METHOD
        AnotherClass anotherClass = new AnotherClass();
        return anotherClass;
    }

    public void nonStaticMethod(){
        System.out.println(nonStaticMember);
    }
}
