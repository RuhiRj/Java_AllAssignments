package assignment4;

public class GivenNumberDivisibleBy5Or7 {
    public static void main(String[] args){
        int x=55;
        if(x%5==0 || x%7==0)
            System.out.println("number is divisible by 5 or 7");
        else
            System.out.println("number is not divisible by 5 or 7");
    }
}
