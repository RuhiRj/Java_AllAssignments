package assignment17;
import java.math.*;
public class Coordinate {
    public static void main(String[] args) {
        Coordinate p=new Coordinate(2,3);
        System.out.println("distance from origin " +String.format("%.3f" ,p.getDistance()));
        Coordinate p1=new Coordinate(4,-3);
        System.out.println("distance " +String.format("%.3f",p1.getDistance(p)));
    }
        private int x, y;
    public Coordinate( int x, int y){
            this.x = x;
            this.y = y;
        }
        public double getDistance () {

        return Math.sqrt((0-x)*(0-x)+(0-y)*(0-y));
        }
        public double getDistance (Coordinate p){
            return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));

        }
    }
