package assignment14;

public class Box {
    private int length,breadth,height;
    protected float volume;
    protected float surfaceArea;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    protected void calculateVolume(){
        int vol;
        vol=length*breadth*height;
        System.out.println("box volume is = " +vol);
    }
    protected void calculateSurfaceArea(){
        int area;
        area=2*(length*breadth+breadth*height+height*length);
        System.out.println("box surface area is " +area);
    }
}
class AccessBox{
    public static void main(String[] args){
        Box b=new Box();
        b.setLength(5);
        b.setBreadth(6);
        b.setHeight(7);
        System.out.println("box length is= " +b.getLength());
        System.out.println("box breadth is "+b.getBreadth());
        System.out.println("box height is ="+b.getHeight());
       b.calculateVolume();
       b.calculateSurfaceArea();

    }
}
