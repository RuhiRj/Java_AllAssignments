package assignment16;

public class Person {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.inputEmployee();
        e1.displayEmployee();
    }
    private int age;
    private String name;
    protected void setAge(int age){this.age=age;}
    protected void setName(String s){name=s;}
    protected int getAge(){return age;}
    protected String getName(){return name;}
}

class Employee extends Person {
    private double salary;
    public void inputEmployee() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter the name ,age , and salary");
        setName(sc.nextLine());
        setAge(sc.nextInt());
        salary = sc.nextDouble();
    }
    public void displayEmployee(){
        System.out.println("Employee name "+getName());
        System.out.println("Employee age" +getAge());
        System.out.println("Employee salary" +salary);
    }

}
