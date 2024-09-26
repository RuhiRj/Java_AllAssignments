package assignment11;
import java.math.*;
public class RootsOfQuadraticEquation {
     void CalculateSquareRoot(int a,int b,int c){
         double x1,x2;
         x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
         x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
         System.out.println("square root of quadratic equation is" +x1);
         System.out.println("square root of quadratic equation is" +x2);
        }
    }
    class showResult {
        public static void main(String[] args) {
            RootsOfQuadraticEquation s = new RootsOfQuadraticEquation();
            s.CalculateSquareRoot(1, -5, 6);
        }
    }
