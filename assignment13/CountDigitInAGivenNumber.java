package assignment13;
import java.util.Scanner;
public class CountDigitInAGivenNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0;
                while(n!=0){
                    int rem=n%10;
                    count=count+1;
                    n=n/10;
                }
                System.out.println("total number is = " +count);
    }
}
