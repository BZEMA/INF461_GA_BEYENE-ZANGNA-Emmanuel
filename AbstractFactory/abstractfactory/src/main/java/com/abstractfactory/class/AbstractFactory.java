public abstract class AbstractFactory {

    public Automobile ConstruireAutomobile(){
        return null;
    }
    
    public Scooter ConstruireScooter(){
        return null;
    }
}


// definition class generique
class Automobile {
    public void methodAutomobile(){};
}

class Scooter {
    public void methodScooter(){};
}
