package assignment4;

public class GivenCharacterIsAlphabetDigitOrOtherSymbol {
    public static void main(String[] args){
        int x='D';
        if(x>=0 && x<=9){
            System.out.println("given character is digit");
        } else if (x>='A' && x<='Z' ) {
            System.out.println("given character is alphabet");
        }else {
            System.out.println("given character is other symbol");
        }
    }
}
