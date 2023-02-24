package Teoria;

public class POOO {
    public static void main(String[] args) {
        Movil carro=new Movil();
        carro.setSpeed(100);
        carro.setState(false);
        System.out.println(carro.getSpeed());
        System.out.println("¿Se encuentra en buen estado? -> "+carro.getState());
    }
}


class Movil{
    private int speed;
    private boolean state;

    public void setState(boolean state){
        this.state=state;
    }
    public boolean getState(){
        return this.state;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }   
    public int getSpeed(){
        return this.speed;
    }
}

