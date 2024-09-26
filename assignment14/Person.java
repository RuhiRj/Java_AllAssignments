package assignment14;

public class Person {
        private String name;
        private int age;
        public void setName(String name){
            this.name=name;
        }
        public void setAge(int age){
            this.age=age;
        }
        public String getName(){return name;}
        public int getAge(){return age;}
}
class showPersonAgeAndName{
    public static void main(String[] args){
        Person p1=new Person();
        p1.setAge(21);
        p1.setName("Mohan");
        System.out.println("person age is = "+p1.getAge());
        System.out.println("person name is = "+p1.getName());
    }
}
