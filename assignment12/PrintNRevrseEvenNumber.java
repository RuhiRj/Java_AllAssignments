package assignment12;
import java.util.Scanner;
public class PrintNRevrseEvenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n natural number");
        int n=sc.nextInt();
        int k=n*2;
        System.out.println("first n reverse number is ");
        for(int i=1;i<=n;i++){
            System.out.println(k);
            k-=2;

        }
    }
}
