package assignment12;
import java.util.Scanner;
public class NOddNUMBERinREVERSEorder {
    public static void main(String[] args){
        System.out.println("enter the n natural number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("first n odd number in reverse order");
        int k=((n*2)-1);
        for(int i=1;i<=n;i++){
            System.out.println(k);
            k=k-2;
        }

    }
}
