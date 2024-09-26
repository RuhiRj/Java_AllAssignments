package assignment12;
import java.util.Scanner;
public class PrintATable {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number for table is ");
        int n = sc.nextInt();
        System.out.println("Table of the number is ");
        for(int i=1;i<=10;i++)
            System.out.println(n*i);


    }
}
