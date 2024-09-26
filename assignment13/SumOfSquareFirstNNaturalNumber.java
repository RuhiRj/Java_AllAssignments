package assignment13;
import java.util.Scanner;
public class SumOfSquareFirstNNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number ");
        int square_sum=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            square_sum=square_sum+(i*i);
        System.out.println("square of first n natural number is = " +square_sum);
    }
}
