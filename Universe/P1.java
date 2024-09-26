package Universe;

import javax.swing.*;
import java.awt.*;

public class P1 {
    public void driver(){
        Complex c1=new Complex();
        c1.setComplex(34,56);
        c1.printComplex();
        Time t1=new Time();
        t1.setTime(23,56,45);
        t1.printTime();
        Cuboid cu1=new Cuboid();
        cu1.setLength(4.5f);
        cu1.setBreadth(3.5f);
        cu1.setHight(2.5f);
       System.out.println("Cubiod length is = "+ cu1.getLength() );
       System.out.println("Cubiod breadth is = " +cu1.getBreadth());
        System.out.println("Cubiod height is = "+cu1.getHight());
        System.out.println("cuboid volume is = "+cu1.calculateVolume());
        System.out.println("cuboid surface area is = " +cu1.calculateSurfaceArea());
        Employee e1=new Employee();
        e1.setName("ruhi");
        e1.setEmpId("5346htgfe");
        e1.setSalary(563753465f);
        System.out.println("employee id is = "+e1.getEmpId());
        System.out.println("employee name is = " +e1.getName());
        System.out.println("employy salary is = " +e1.getSalary());
        Contact C=new Contact();
        C.setId("5676het8");
        C.setFirstName("Ruhi");
        C.setLastName("Raj");
        C.setEmailId("56348tyei@456gmail.com");
        C.setMobileNumber("5456345846");
        System.out.println("id ia = " +C.getId());
        System.out.println("first name is = " +C.getFirstName());
        System.out.println("last name is = " +C.getLastName());
        System.out.println("email id is = "+C.getEmailId());
        System.out.println("mobile number is = " +C.getMobileNumber());
        Question q1=new Question();
        q1.setQuestion(1,"India's lal Qila","Mumbai","Patna","Delhi","bhopal","c");
        q1.displayQuestion();
        Course course=new Course();
        course.setCourseId(101);
        course.setCourseName("MCA");
        course.setDuration("2 years");
        course.setFee(600000f);
        System.out.println("course id = " +course.getCourseId());
        System.out.println("course name " +course.getCourseName());
        System.out.println("course duration " +course.getDuration());
        System.out.println("course fee" +course.getFee());
        Distance d1=new Distance();
        Distance d2=new Distance();
        Distance d3;// It doesn't depends that d3 is to make object
        d1.setDistance(200f,5600f,670f);
        d2.setDistance(500f,700f,800f);
        d1.showDistance();
        d2.showDistance();
        d3=d1.addTwoDistance(d2);//because add fun assign the obj ref in the d3 that;s why
        d3.showDistance();
        Circle c=new Circle();
        c.setRadius(5.5f);
        c.calculateArea();
        c.calculateCircumstances();
        Book b=new Book();
        b.setAuthor("Saurabh Shukla");
        b.setTitle("Learn Programming Easily");
        b.setPrice(10000f);
        b.setBookId("yte65");
        System.out.println(b.getAuthor());
        System.out.println(b.getBookId());
        System.out.println(b.getPrice());
        System.out.println(b.getTitle());
    }
}
class Complex{
    private int real,imag;
    public void setComplex(int r,int i){
        real=r;
        imag=i;
    }
    public void printComplex(){
        System.out.println("real = " +real+ "  imag = " +imag);
    }
}
class Time{
    private int hour,minute,sec;
    public void setTime(int r,int m, int s){
        hour=r;
        minute=m;
        sec=s;
    }
    public void printTime(){
        System.out.println( +hour + ":" +minute + ":" +sec);
    }
}
class Cuboid{
    private float length,breadth,hight;
    public void setLength(float l ){length=l;}
    public void setBreadth(float b){breadth=b;}
    public void setHight(float h){hight=h;}
    public float getLength(){return length;}
    public float getBreadth(){return breadth;}
    public float getHight(){return hight;}
    public float calculateVolume(){return (length*breadth*hight);}
    public float calculateSurfaceArea(){return 2*(length*breadth+breadth*hight+hight*length);}
}
class Employee{
    private String empId,name;
    private float salary;
    public void setEmpId(String empId){this.empId=empId;}
    public void setName(String name){this.name=name;}
    public void setSalary(float s){salary=s;}
    public String getEmpId(){return empId;}
    public String getName(){return name;}
    public float getSalary(){return salary;}
}
class Contact{
    private String id,firstName,lastName,emailId,mobileNumber;
    public void setId(String id){this.id=id;}
    public void setFirstName(String firstName){this.firstName=firstName;}
    public  void setLastName(String lastName){this.lastName=lastName;}
    public void setEmailId(String emailId){this.emailId=emailId;}
    public  void setMobileNumber(String mobileNumber){this.mobileNumber=mobileNumber;}
    public String getId(){return id;}
    public  String getFirstName(){return firstName;}
    public String getLastName(){return  lastName;}
    public String getEmailId(){return emailId;}
    public String getMobileNumber(){return mobileNumber;}
}
class Question{
    private int queNo;
    private String question,optionA,optionB,optionC,optionD,answer;
    public void setQuestion(int qno,String q,String a,String b,String c, String d,String ans){
        queNo=qno;
        question=q;
        optionA=a;
        optionB=b;
        optionC=c;
        optionD=d;
        answer=ans;
    }
    public void displayQuestion(){
        System.out.println("Question no" +queNo);
        System.out.println("Question :"+question);
        System.out.println("(a)" +optionA);
        System.out.println("(b)" +optionB);
        System.out.println("(c)" +optionC);
        System.out.println("(d)" +optionD);
        System.out.println("Answer :" +answer);
    }
}
class Course{
    private int courseId;
    private String courseName;
    private String duration;
    private double fee;
    public void setCourseId(int id){courseId=id;}
    public void setCourseName(String courseName){this.courseName=courseName;}
    public void setDuration(String duration){this.duration=duration;}
    public void setFee(double fee){this.fee=fee;}
    public int getCourseId(){return courseId;}
    public String getCourseName(){return courseName;}
    public  String getDuration(){return duration;}
    public double getFee(){return fee;}
}
class Distance{
    private double km,m,cm;
    public void setDistance(double m,double cm,double km){
        this.m=m;
        this.cm=cm;
        this.km=km;
    }
    public void showDistance(){
        System.out.println("distance in m is" +m);
        System.out.println("distance in cm is" +cm);
        System.out.println("distance in km is" +km);
    }
    public Distance addTwoDistance(Distance d){
        Distance temp=new Distance();
        temp.cm=cm+d.cm;
        temp.m=temp.cm/100+m+d.m;
        temp.cm= temp.cm/100;
        temp.km=temp.m/1000+km+d.km;
        temp.m= temp.m/1000;
        return  temp;
    }
}
class Circle{
    private float radius;
    public void setRadius(float r){radius=r;}
    public void calculateArea(){
        System.out.println("area of the circle is = "+3.14*radius*radius);
    }
    public void calculateCircumstances(){
        System.out.println("circle circumstances is = "+2*3.14*radius);
    }
}
class Book{
    private String book_id,title,author;
    private float price;
    public void setBookId(String id){book_id=id;}
    public void setTitle(String title){this.title=title;}
    public void setPrice(float price){this.price=price;}
    public void setAuthor(String author){this.author=author;}
    public String getBookId(){return book_id;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public float getPrice(){return price;}
}