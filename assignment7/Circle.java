package assignment7;

public class Circle {
    float radius;
    void setRadiusValue(float radius){
        this.radius=radius;
        System.out.println("radius is = " +this.radius);
    }
    float areaOfCircle(){
         return ((3.14f)*radius*radius);
    }
    float circumferences(){
        return 2*3.14f*radius;
    }
}
class ShowCircleAreaAndCircumferences{
    public static void main(String[] args){
        Circle c1=new Circle();
        c1.setRadiusValue(2.5f);
        float area=c1.areaOfCircle();
        System.out.println("area of the circle is = " +area);
        float circumference=c1.circumferences();
        System.out.println("circumferences of the circle is = " +circumference);
    }
}
