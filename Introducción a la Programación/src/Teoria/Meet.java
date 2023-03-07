package Teoria;


public class Meet {
    public static void main(String [] args){
        Car car = new Car();
        //Motorcycle motorcycle = new Motorcycle();
        //executeSpeed(motorcycle);
        executeSpeed(car);

    }
    public static void executeSpeed(Car car){
        car.speedUp(10);
        car.speedDown(5);
    }

}


interface Vehicule {
    void speedUp(int howSpeed);
    void speedDown(int howSpeed);
}
class Car implements Vehicule{
    public void speedUp(int howSpeed){
        System.out.println("Acelerando Coche... "+howSpeed+" km/h");
    }
    public void speedDown(int howSpeed){
        System.out.println("Frenando Coche... "+howSpeed+" km/h");
    }
}

class Motorcycle implements Vehicule{
    public void speedUp(int howSpeed){
        System.out.println("Acelerando Moto... "+howSpeed+" km/h");
    }
    public void speedDown(int howSpeed){
        System.out.println("Frenando Moto... "+howSpeed+" km/h");
    }
}