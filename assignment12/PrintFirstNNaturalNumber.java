package assignment12;
import java.util.Scanner;
public class PrintFirstNNaturalNumber {
    public static void main(String[] args){
        System.out.println("enter the natural number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("first n natural number is = ");
        for(int i=1;i<=n;i++)
            System.out.println(i);
    }
}
