package assignment18;

public class Circle {
    private double radius;
   static  double PI;
   static {
       PI=3.14;
   }
    {
        radius=5;
    }
   public void setRadius(double r){
       radius=r;
   }
   public double getRadius(){
       return radius;
   }
   public void getArea(){
       System.out.println("circle area is = " +PI*radius*radius);
   }
   public static void main(String[] args){
       Circle c=new Circle();
     // c.setRadius(6);
       c.getRadius();
       c.getArea();
   }
}
