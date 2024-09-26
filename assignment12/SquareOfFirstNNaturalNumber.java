package assignment12;
import java.util.Scanner;
public class SquareOfFirstNNaturalNumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the n natural number is ");
        int n=sc.nextInt();
        System.out.println("square of first n natural number is = ");
        for(int i =1;i<=n;i++){
            System.out.println(+i*i);
        }
    }
}
