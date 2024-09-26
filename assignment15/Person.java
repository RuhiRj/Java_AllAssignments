package assignment15;

public class Person {
    private int age;
    private String name;
    Person(){
        System.out.println("Hello nature");
    }
    Person (String name){
        this.name=name;
    }
    Person(int age){
        this.age=age;
    }
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public static void main(String[]args){
        Person p1=new Person();
        Person p2=new Person("tina");
        Person p3=new Person(21,"ritu");
        Person p4=new Person(34);
    }
}
