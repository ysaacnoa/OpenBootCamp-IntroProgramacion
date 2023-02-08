package Teoria;
public class Condicionales {
    public static void main(String args[]){
        String estacion="primavera";

        if (estacion=="primavera") {
            System.out.println("Hola buen dia es primavera, las hojas son verdes");
        }else if(estacion=="invierno"){
            System.out.println("Ay que calor ya es verano, el sol brilla con intensidad");
        }else if(estacion=="otoño"){
            System.out.println("Hola buen dia es otoño, las hojas son amarillas");
        }else if(estacion=="invierno"){
            System.out.println("Buenas noches es invierno, una taza de cafe no vendria mal");
        }else{
            System.out.println("Nos encontramos en un limbo temporal");
        }
    }
}
