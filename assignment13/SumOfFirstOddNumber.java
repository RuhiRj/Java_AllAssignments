package assignment13;
import java.util.Scanner;
public class SumOfFirstOddNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the natural number");
        int n=sc.nextInt();
        int sum=0,num=(n*2)-1;
        for(int i=num;i>=1;){
            sum=sum+i;
            i-=2;
        }
        System.out.println("sum of odd number is " +sum);
    }
}
