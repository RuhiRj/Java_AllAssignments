package assignment20;
import java.util.Scanner;
public class SumOfSortedArray {
    public static void main(String[]args){
        System.out.println("enter the natural number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter " +n + " natural number");
        int arr[];
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of the sorted array is " +sum);
        sc.close();
    }
}
