package assignment20;
import java.util.Scanner;
public class ArrayOfSizeNAndDisplay {
    public static void main(String[] args){
        System.out.println("enter the n natural number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter" + n + "natural number");
        int a[] ;
        a = new int[n];
        for(int i=1;i<=n;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=1;i<=n;i++)
             System.out.println(a[i]);
        sc.close();
    }
}
