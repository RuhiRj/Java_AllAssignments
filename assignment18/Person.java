package assignment18;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("person name and age is " +name +" "+age);
    }
    public static void main(String[] args){
        Person p=new Person("tina" ,22);

    }
}
