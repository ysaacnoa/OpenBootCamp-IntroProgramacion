public class EjerciciosTema8 {
    
    public static void main(String args[]) {
        Persona empleado = new Persona();
        empleado.setAge(21);
        empleado.setName("Ysaac");
        empleado.setPhone("991197158");

        System.out.println("Nombre: "+empleado.getAge());
        System.out.println("Edad: "+empleado.getName());
        System.out.println("Telefono: "+empleado.getPhone());
    }
    
}
class Persona{
    private int age;
    private String name;
    private String phone;

    //GETSET AGE
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    //GETSET NAME
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    //GETSET PHONE
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return this.phone;
    }
}