public class EjerciciosTema4 {
    public static void main(String args[]){
        //CONDICIONAL IF
        System.out.println("Condicional if");
        int numero=0;

        if(numero>0){
            System.out.println("El número es positivo");
        }else if(numero<0){
            System.out.println("El número es negativo");
        }else {
            System.out.println("El número es 0");
        }
        
        //WHILE
        System.out.println("ciclo while");
        int numeroWhile=0;
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        //DO WHILE
        System.out.println("ciclo do While");
        int numeroDoWhile=0;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile<3);

        //FOR
        System.out.println("ciclo for");
        int numeroFor=0;
        for(int i=0;i<3;i++){
            numeroFor++;
            System.out.println(numeroFor);
        }


        //SWITCH CASE
        System.out.println("SWITCH CASE");
        String estacion="otoño";
        switch (estacion) {
            case "primavera":
                System.out.println("Hola!! Es primavera :D");
                break;
            case "verano":
                System.out.println("Hola, hace calor!! Es verano :D");
                break;
            case "otoño":
                System.out.println("Hola, las hojas son amarillas!! Es otoño :D");
                break;
            case "invierno":
                System.out.println("Hola, hace frio!! Es invierno :D");
            default:
                System.out.println("No es una estación del año");
                break;
        }
    }
}
