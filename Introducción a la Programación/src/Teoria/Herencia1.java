package Teoria;

public class Herencia1 {
    public static void main(String[] args) {
        Auto nirvana=new Auto();
        nirvana.setDoors(4);
        nirvana.setMaxSpeed(200);
        nirvana.setTuition("BGT-47");
        
        Motorcycle sanchez = new Motorcycle();
        sanchez.setDoors(0);
        sanchez.setMaxSpeed(400);
        sanchez.setTuition("BAS-97");


        System.out.println(nirvana.getDoors());
        System.out.println("Velocidad maxima: "+nirvana.getMaxSpeed());
        System.out.println("Matricula -> "+nirvana.getTuition());

        System.out.println(sanchez.getDoors());
        System.out.println("Velocidad maxima: "+sanchez.getMaxSpeed());
        System.out.println(sanchez.getTuition());
    }
    
}

abstract class Vehicule{
    float maxSpeed;
    String tuition;
    
    public void setMaxSpeed(float maxSpeed){
         this.maxSpeed=maxSpeed;
    }

    public float getMaxSpeed(){
        return maxSpeed;
    }

    abstract public void setTuition(String tuition);
    abstract public String getTuition();
}

class Auto extends Vehicule{
    private int doors;

    public void setDoors(int doors){
        this.doors=doors;
    }
    public int getDoors(){
        System.out.println("Puertas aseguradas :");
        return this.doors;
    }

    public void setTuition(String tuition){
        this.tuition=tuition;
    }
    public String getTuition(){
        return this.tuition;
    }
}

class Motorcycle extends Auto {

    public void setTuition(String tuition){
        this.tuition=tuition;
    }
    public String getTuition(){
        return "La matricula de la moto -> " + this.tuition;
    }
    
}