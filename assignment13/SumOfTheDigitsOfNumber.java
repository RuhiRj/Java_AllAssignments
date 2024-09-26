package assignment13;
import java.util.Scanner;
public class SumOfTheDigitsOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit of the number");
        int n=sc.nextInt();
        int sum_of_digit=0,rem=0;
        while (n!=0){
            rem=n%10;
            sum_of_digit=sum_of_digit+rem;
            n=n/10;
        }
        System.out.println("sum of the digits is " +sum_of_digit);
    }
}
