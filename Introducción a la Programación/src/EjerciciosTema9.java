public class EjerciciosTema9 {
    public static void main(String[] args){
        Client client =new Client();
        client.setCredit(1000.74f);
        client.getCredit();
        
        Worker worker = new Worker();
        worker.setSalay(5000.99f);
        worker.getSalary();
    }
}

class People {
    int year;
    String name;
    double phone;
}

class Client extends People{
    float credit;
    public void setCredit(float credit){
        this.credit=credit;
    }
    public void getCredit(){
        System.out.println("El credito del cliente es de: " + credit);
    }
}

class Worker extends People{
    float salary;
    public void setSalay(float salary){
        this.salary=salary;
    }
    public void getSalary(){
        System.out.println("El salario del trabajador es de: " + salary);
    }
}
