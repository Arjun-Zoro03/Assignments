public class Assignment7_5 {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass2 innerClass2 = outerClass2.new InnerClass2("HI");
    }
}

class OuterClass1 {
    OuterClass1(){
        System.out.println("OuterClass1");
    }

    class InnerClass1{
        InnerClass1(String message){
            System.out.println("In Inner class1");
            System.out.println(message);
        }
    }
}


//We cannot inherit inner class without inheriting the outer class
class OuterClass2 extends OuterClass1 {
    OuterClass2(){
        System.out.println("OuterClass2");
    }

    class InnerClass2 extends InnerClass1{
        InnerClass2(String message) {
            super(message);
            System.out.println("In Inner class2 ");
        }
    }
}