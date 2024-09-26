package assignment13;
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  natural number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("sum of first n natural number is = " +sum);
    }
}
