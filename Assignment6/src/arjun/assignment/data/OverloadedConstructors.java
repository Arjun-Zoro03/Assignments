package arjun.assignment.data;

public class OverloadedConstructors {
    int a,b;
    public OverloadedConstructors(){
        this(2,4);
    }

    public OverloadedConstructors(int a, int b){
       this.a = a;
       this.b = b;
    }
}
