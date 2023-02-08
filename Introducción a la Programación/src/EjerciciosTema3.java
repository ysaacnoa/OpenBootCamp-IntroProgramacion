
public class EjerciciosTema3 {
    public static void main(String[] args) {
        
        //PRIMERA PARTE
        int a=5;
        int b=10;
        int c=15;
        int res=suma(a,b,c);
        System.out.println(res);

        //SEGUNDA PARTE
        Coche myCoche=new Coche();
        myCoche.Puertas();
        myCoche.Puertas();
        System.out.println(myCoche.numeroPuertas);
    }
    //FUNCION PARA LA PRIMERA PARTE
    public static int suma(int a, int b, int c){
        int res=a+b+c;
        return res;
    }
}
//CLASE PARA LA SEGUNDA PARTE
class Coche{
    int numeroPuertas=0;

    public void Puertas(){
        this.numeroPuertas++;
    }
}