abstract class Rodent {
    abstract public void typeOfRodent();

    abstract  public void habitatOfRodent();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[2];
        rodents[0] = new HoppingMice();
        rodents[0].typeOfRodent();
        rodents[0].habitatOfRodent();

        rodents[1] = new pocketGophers();
        rodents[1].typeOfRodent();
        rodents[1].habitatOfRodent();

    }
}

class HoppingMice extends Rodent{

    HoppingMice(){
        System.out.println("Hopping Mice:-");
    }

    @Override
    public void typeOfRodent() {
        System.out.println("They are Desert Rodents.");
    }

    @Override
    public void habitatOfRodent() {
        System.out.println("Habit: Sandy Deserts");
    }
}

class pocketGophers extends Rodent{

    pocketGophers(){
        System.out.println("Pocket Gopher:- ");
    }

    @Override
    public void typeOfRodent() {
        System.out.println("They are Gopher Rodents.");
    }

    @Override
    public void habitatOfRodent() {
        System.out.println("Habit: Udderground Tunnels");
    }
}



