package assignment3;

public class SumOfGivenDigit {
    public static void main(String[] args){
        int x=2345,sum=0;
            sum = x % 10+x/10%10+x/100%10+x/1000%10;
        System.out.println("sum of the given digit is" +sum);
    }
}
