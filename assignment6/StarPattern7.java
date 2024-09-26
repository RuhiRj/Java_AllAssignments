package assignment6;

public class StarPattern7{
    public static void main(String[] args) {
        char k;
        for (int i = 1; i <= 5; i++) {
            k='A';
            for (int j = 1; j <= 5; j++) {
                if (j >= i)
                    System.out.print(k++);
                else
                    System.out.print(" ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}

