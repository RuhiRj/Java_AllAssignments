package assignment12;
import java.util.Scanner;
public class PrintNOddNaturalNumber {
    public static void main(String[] args){
        System.out.println("enter the n natural number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        System.out.println("first n odd natural number is ");
        for(int i=1;i<=n;i++) {
            System.out.println(k);
            k += 2;
        }
    }
}
