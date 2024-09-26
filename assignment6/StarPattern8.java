package assignment6;

public class StarPattern8{
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= 'E'; j++) {
                if (j >= i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}


