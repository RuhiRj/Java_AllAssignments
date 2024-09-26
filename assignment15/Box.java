package assignment15;

public class Box {
    private int length,breadth,height;
    Box(){

    }
    Box(int l){
        length=l;
    }
    Box(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    public static void main(String [] args){
        Box b1=new Box();
        Box b2=new Box(3);
        Box b3=new Box(5,6,7);
    }
}
