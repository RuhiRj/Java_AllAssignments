package assignment13;
import java.util.Scanner;
public class SumOfFirstNEvenNaturalNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the natural number ");
        int n=sc.nextInt();
        int even_sum=0,num=n*2;
        for(int i=num;i>=1;){
            even_sum=even_sum+i;
            i-=2;
        }
        System.out.println("even sum is =" +even_sum);
    }
}
