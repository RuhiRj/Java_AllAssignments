package assignment12;
import java.util.Scanner;
public class PrintFirstNEvenNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n natural number");
        int n=sc.nextInt();
        int k=2;
        for(int i=1;i<=n;i++){
            System.out.println(k);
            k=k+2;
        }

    }
}
