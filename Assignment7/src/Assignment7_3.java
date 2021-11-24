class Concrete{

}

interface InterfaceOne{
    void method1_1();
    void method1_2();
}

interface InterfaceTwo{
    void method2_1();
    void method2_2();
}


interface InterfaceThree {
    void method3_1();
    void method3_2();
}

interface InterfaceFinal extends InterfaceOne, InterfaceTwo, InterfaceThree {
    void newMethod();
}

public class Assignment7_3 extends Concrete implements InterfaceFinal{
    @Override
    public void method1_1() {
        System.out.println("In method1_1");
    }

    @Override
    public void method1_2() {
        System.out.println("In method1_2");
    }

    @Override
    public void method2_1() {
        System.out.println("In method2_1");
    }

    @Override
    public void method2_2() {
        System.out.println("In method2_2");
    }

    @Override
    public void method3_1() {
        System.out.println("In method3_1");
    }

    @Override
    public void method3_2() {
        System.out.println("In method3_2");
    }

    @Override
    public void newMethod() {
        System.out.println("In new method");
    }

    public static void one(InterfaceOne one){
        one.method1_1();
        one.method1_2();
    }
    public static void two(InterfaceTwo two){
        two.method2_1();
        two.method2_2();
    }
    public static void three(InterfaceThree three){
        three.method3_1();
        three.method3_2();
    }
    public static void four(InterfaceFinal newInterface){
        newInterface.newMethod();
    }
    public static void main(String[] args){
        Assignment7_3 combined = new Assignment7_3();
        one(combined);
        two(combined);
        three(combined);
        four(combined);
    }
}
