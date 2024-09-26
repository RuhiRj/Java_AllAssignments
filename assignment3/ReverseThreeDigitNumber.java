package assignment3;

public class ReverseThreeDigitNumber {
    public static void main(String[] args){
        int x=354;
        int rev=0;
        rev=x%10*100+x/10%10*10+x/100;
        System.out.println(rev);

    }
}
