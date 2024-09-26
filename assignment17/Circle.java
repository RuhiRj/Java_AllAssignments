package assignment17;

public class Circle {
    private int radius;

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
       // double area;
        return 3.14*radius*radius;
        // System.out.println("area of the circle is " +area);
    }
}
class ThickCircle extends Circle{
    public int thickness;
    public void setThickNess(int r){
        thickness=r;
    }
    public double getThickNess(){
        return thickness;
    }
    public double getArea(){
        //double thicknessArea;
        return 3.14*(getRadius()+thickness)*(getRadius()+thickness)-super.getArea();
        //System.out.println("area of the thickness circle is " +thicknessArea);
    }
    public static void main(String[] args){
        ThickCircle obj=new ThickCircle();
        obj.setRadius(5);
        obj.setThickNess(2);
        System.out.println("radius of the circle is"+obj.getRadius());
        System.out.println("radius of the thickness circle is"+obj.getThickNess());
      System.out.println("overrid area is "+ obj.getArea());
        obj.getArea();

    }
}