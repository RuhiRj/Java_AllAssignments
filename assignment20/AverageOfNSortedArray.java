package assignment20;
import java.util.Scanner;
public class AverageOfNSortedArray {
    public static void main(String [] args){
        System.out.println("enter the natural number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter " +n+ " natural number");
        int arr[];
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0,sum=0,avg=0;
        for(int i=0;i<n;i++){
            count+=1;
            sum=sum+arr[i];
        }
        avg=sum/count;
        System.out.println("average number of the sorted array is "+ avg );

    }
}
