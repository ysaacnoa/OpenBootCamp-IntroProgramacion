package Teoria;

public class POO {
    public static void main(String[] args) {
        Car car = new Car();
        car.acelerate();
        car.acelerate();
        car.brake();
        car.getDoors(4, 0);
    }

}

class Car {
    int doors;
    int wheels=100;
    int velocidad=0;

    public void acelerate() {
        velocidad+=5;
        wheels--;
        System.out.println("Velocidad aumenta a: "+velocidad);
        System.out.println("Durabilidad de ruedas: "+wheels+"%");
    }
    public void brake() {
        velocidad-=2;
        System.out.println("Velocidad disminuye a: "+velocidad);
        System.out.println("Durabilidad de ruedas: "+wheels+"%");
    }

    public void getDoors(int doors, int velocidad){
        this.doors=doors;
        this.velocidad=velocidad;

        System.out.println("Puertas: "+doors);
    }
}
