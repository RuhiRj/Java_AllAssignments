package assignment15;

public class Customer {
    private int id;
    private String name,email,mobile;
    Customer(int id,String name,String mob,String email){
        this.id=id;
        this.name=name;
        this.email=email;
        mobile=mob;
    }
    Customer(int id,String name,String mob){
        this.id=id;
        this.name=name;
        mobile=mob;
    }
}
