package assignment20;
import java.util.Scanner;
public class SortedSmallestNumberOfTheArray {
    public static void main(String[]args){
        System.out.println("enter the natural number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter " + n + " natural number");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("smallest number of the sorted array is "+ min);
    }
}
