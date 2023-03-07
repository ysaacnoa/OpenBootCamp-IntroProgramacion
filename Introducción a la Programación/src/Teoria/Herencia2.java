package Teoria;

public class Herencia2 {
    public static void main(String[] args){
        
    }
}

class Vehicule{
    int Speed=140;
    public void Speed(){
        System.out.println("La velocidad es de: " + Speed);
    }
}

class Motor{
    String typeMotor="Motor V12";
    public void typeMotor(){
        System.out.println("El tipo de combustible es: " + typeMotor);
    }
}


