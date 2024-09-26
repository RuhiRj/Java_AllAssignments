package assignment20;
import java.util.Scanner;
public class SortedAnArray {
    public static void main(String[]args){
        System.out.println("enter the natural number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[];
        a=new int [n];
        System.out.println("enter " +n+ " natural number");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            }
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("the greatest number of the array is "+max);
        sc.close();
    }

}
