package assignment2;

public class SwapTwoNumberWithoutThirdVariable {
    public static void main(String[] args){
        int a=30;
        int b=50;
        System.out.println("without swaping value is="+a);
        System.out.println("without swaping value is="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swaping value is="+a);
        System.out.println("swaping value is="+b);
    }
}
