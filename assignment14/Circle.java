package assignment14;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println("circle area " +3.14*radius*radius);
    }
    public void calculateCircumferences(){
        System.out.println("circle circumferences" +2*3.14*radius);
    }

}
