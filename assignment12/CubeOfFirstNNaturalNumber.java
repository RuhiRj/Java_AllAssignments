package assignment12;
import java.util.Scanner;
public class CubeOfFirstNNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the natural  number");
        int n=sc.nextInt();
        System.out.println("print the first n cube root is");
        for(int i=1;i<=n;i++)
            System.out.println(i*i*i);
    }

}
