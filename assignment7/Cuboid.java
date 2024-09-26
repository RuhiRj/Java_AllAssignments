package assignment7;

public class Cuboid {
    float length;
    float breadth;
    float heigth;
    void setData(float l, float b, float h){
        length=l;
        breadth=b;
        heigth=h;
    }
    void getData(){
        System.out.println("length=" +length);
        System.out.println("breadth=" +breadth);
        System.out.println("heigth=" +heigth);
    }
    float volumeOfCuboid(){
        return length*breadth*heigth;
    }
    float surfaceAreaOfCuboid(){
        return 2*(length*breadth + breadth*heigth + heigth*length);
    }
}
class Example2{
    public static void main(String[] args){
        Cuboid cub=new Cuboid();
        cub.setData(3,4,5);
        cub.getData();
        float volume=cub.volumeOfCuboid();
        System.out.println("cuboid volume is = " +volume);
        float surface_area=cub.surfaceAreaOfCuboid();
        System.out.println("cuboid surface area is = " +surface_area);
    }
}
