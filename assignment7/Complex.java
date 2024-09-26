package assignment7;

public class Complex {
    int real;
    int imaginary;
    void setDimension(int r,int i){
        real=r;
        imaginary=i;
    }
    void showDimension(){
        System.out.println("real=" +real);
        System.out.println("imaginary=" +imaginary);
    }
}
class Example{
    public static void main(String[] args){
        Complex c1= new Complex();
        c1.setDimension(23,45);
        c1.showDimension();
    }
}
