package assignment18;

import java.security.PublicKey;

public class SuperClassPerson {
     String name;
     int age;
    public SuperClassPerson(){

        this("tina",22);
    }
    public SuperClassPerson(String n,int a){
       // super();
        name=n;
        age=a;
    }
}
class Employee extends SuperClassPerson {
    private double salary;

    public Employee() {
        this(450000.0f);
    }

    public Employee(double s) {
        super();
        salary = s;
    }

    public void showEmployeeData() {
        System.out.println("Employee data is " + name + " " + age + " " + salary);
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.showEmployeeData();
    }
}