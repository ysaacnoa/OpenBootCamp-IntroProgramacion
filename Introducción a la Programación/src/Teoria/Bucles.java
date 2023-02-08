package Teoria;

public class Bucles {
    public static void main(String args[]){
        //FOR
        System.out.println("FOR");
        for(int i=10;i>0;i--){
            System.out.println(i);
        }
        //FOR CON ARRAYS
        System.out.println("FOR CON ARRAYS");
        int array[]=new int[7];

        for(int i=0;i<array.length;i++){
            array[i]=i+2;
            System.out.println(array[i]);
        }

        //WHILE
        System.out.println("WHILE");
        int contador=10;
        while(contador>0){
            System.out.println(contador);
            contador-=3;
        }

        //DO WHILE
        System.out.println("DO WHILE");
        int iterador=10;
        do{
            iterador-=3;
            System.out.println(iterador);
        }while(iterador>0);
    }
}
