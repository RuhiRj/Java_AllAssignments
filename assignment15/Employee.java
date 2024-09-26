package assignment15;
import java.util.Scanner;
public class Employee {
    private int empId;
    private float salary;
    private String name;
    private static int objectCount;
    private static int generateEmpId(){
        return objectCount+=1;
    }
    Employee(float salary,String name){
        objectCount++;
        empId=generateEmpId();
        this.salary=salary;
        this.name=name;
    }
    Employee(){
        objectCount++;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the employee");
        name=sc.nextLine();
        System.out.println("enter the salary");
        salary=sc.nextFloat();
        empId=generateEmpId();
    }
    public static void main(String[] args){
        Employee e=new Employee();
        Employee e1=new Employee(60000f,"ritu");
    }
}
