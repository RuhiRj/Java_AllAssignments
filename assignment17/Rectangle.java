package assignment17;

public class Rectangle {
    private double length,breadth;
    public String borderColour;
    public void setLength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }
    public void setBorderColour(String borderColour){
        this.borderColour=borderColour;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public String getBorderColour() {
        return borderColour;
    }
    public void printRetangleColour(){
        System.out.println("rectangle colour is "+borderColour);
    }
}
class FilledRectangle extends Rectangle{
    private String fillColour;

    public String getFillColour() {
        return fillColour;
    }

    public void setFillColour(String fillColour) {
        this.fillColour = fillColour;
    }
    public void printRetangleColour(){
        System.out.println("rectangle filled colour is "+fillColour);
        super.printRetangleColour();
    }
    public static void main(String[] args){
        FilledRectangle obj=new FilledRectangle();
        obj.setFillColour("Blue");
        obj.getFillColour();
        obj.printRetangleColour();
        obj.setBorderColour("Black");
        obj.getBorderColour();
        obj.printRetangleColour();
    }
}
