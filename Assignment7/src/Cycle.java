public class Cycle {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] cycles = new Cycle[3];
        cycles[0] = (Cycle) unicycle;
        cycles[1] = (Cycle) bicycle;
        cycles[2] = (Cycle) tricycle;

        //cycles[0].balance();
        //cycles[0].balance();
        //We can only call parent class methods

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();

    }
}

class Bicycle extends  Cycle{
    public void balance(){
        System.out.println("Bicycle balance");
    }
}

class Tricycle extends Cycle{

}

class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Unicycle  balance");
    }
}
