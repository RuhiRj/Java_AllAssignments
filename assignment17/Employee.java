package assignment17;

public class Employee {
    private String name;
    private String title1;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showName(){
        System.out.println("Employee name is" +name);
    }
    public void showName(String title){
        System.out.println("employee name is "+title +" " +name);
    }
    public static void main(String [] args){
        Employee obj=new Employee();
        obj.setName("mohan");
        obj.getName();
        obj.showName();
        obj.showName("mr");
    }
}
