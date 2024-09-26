package assignment12;
import java.util.Scanner;
public class PrintFirstNNaturalNumberInReverseOrder {
    public static void main(String[] args){
        System.out.println("enter the n natural number");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("first n natural reverse number is = " );
        for(int i=n;i>=1;i--)
            System.out.println(i);


    }
}
