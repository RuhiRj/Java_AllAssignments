package assignment16;

public class Circle {
    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class ThickCircle extends Circle{
    public double thickNess;

    public double getThickNess() {
        return thickNess;
    }

    public void setThickNess(double thickNess) {
        this.thickNess = thickNess;
    }
    public double getthicknessArea(){
        return (3.14*(getRadius()+thickNess)*(getRadius()+thickNess))-getArea();
    }

    public double HolloCircleArea(){
      return getArea();
    }
}
class exam{
    public static void main(String [] args){
        ThickCircle ta=new ThickCircle();
        ta.setRadius(4);
        ta.getArea();
        System.out.println(ta.getRadius());
        ta.setThickNess(4.5f);
        System.out.println(ta.getThickNess());
       System.out.println(ta.getthicknessArea());
        System.out.println(ta.HolloCircleArea());
    }
}