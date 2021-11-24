interface Cycle1{
    void numberOfWheels();
}

class Tricycle1 implements Cycle1{
    @Override
    public void numberOfWheels() {
        System.out.println("I have 3 wheel");
    }
}

class Bicycle1 implements Cycle1 {
    @Override
    public void numberOfWheels() {
        System.out.println("I have 2 wheel");
    }
}

class Unicycle1 implements Cycle1 {
    @Override
    public void numberOfWheels() {
        System.out.println("I have 1 wheel");
    }
}

class FactoryUnicycle1 {
    public Unicycle1 getCycleUnicycle(){
        return new Unicycle1();
    }
}

class FactoryBicycle1 {
    public  Bicycle1 getCycleBiCycle(){
        return new Bicycle1();
    }
}

class FactoryTricycle1 {
    public Tricycle1 getCycleTricycle() {
        return new Tricycle1();
    }
}

public class Assignment7_4 {
    public static void main(String[] args) {
        FactoryUnicycle1 unicycle1 = new FactoryUnicycle1();
        unicycle1.getCycleUnicycle().numberOfWheels();

        FactoryBicycle1 bicycle = new FactoryBicycle1();
        bicycle.getCycleBiCycle().numberOfWheels();

        FactoryTricycle1 tricycle = new FactoryTricycle1();
        tricycle.getCycleTricycle().numberOfWheels();
    }
}
