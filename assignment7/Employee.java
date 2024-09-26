package assignment7;

public class Employee {
    int empId;
    String name;
    float salary;
    void setEmployeeInformation(int id ,String name,float sal){
        empId=id;
        this.name=name;
        salary=sal;
    }
    void getEmployeeData(){
        System.out.println("employee id is = " +empId);
        System.out.println("employee name is = " +name);
        System.out.println("employee salary is = " +salary);
    }
}
class Example3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeInformation(23, "ruhi", 14000);
        emp.getEmployeeData();
    }
}
