package assignment13;
import java.util.Scanner;
public class CalculateFactorialOfANumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=(fac*i);
        }
        System.out.println("factorial is = " +fac);
    }
}
