package assignment14;

public class Employee {
    int empId;
    String name;
    float salary;
    void setName(String name){this.name=name;}
    void setSalary(float salary){this.salary=salary;}
    void setEmpId(int id){empId=id;}
    int getEmpId(){return empId;}
    String getName(){return name;}
    float getSalary(){return salary;}
}
class AccessEmployeeClass{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.setName("rohan");
        e1.setEmpId(543);
        e1.setSalary(544700f);
        System.out.println("employee name is " +e1.getName());
        System.out.println("employee id is =" +e1.getEmpId());
        System.out.println("employee salary is= "+e1.getSalary());
    }
}
