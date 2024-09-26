package SavingAccount;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {
    public static void testDriver1() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c;
            c = a / b;
            System.out.println("result =" + c);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
       // finally {
         //   System.out.println("program is run successful");
        //}
        System.out.println("enter a number");
        sc.next();
        int d=sc.nextInt();
        int e=d*d;
        System.out.println("Square of the number is " +e);
    }
}