package assignment6;

public class StarPattern9 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4;j++) {
                if(i>=j) {
                    System.out.print(a);
                    a = a + 1;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }
}
