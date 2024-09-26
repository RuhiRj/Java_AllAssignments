package assignment2;

public class TicketPriceForPassenger {
    public static void main(String[] args) {
        int age=20;
        char gender='f';

        if(gender=='f') {
            if (age > 50)
                System.out.println("ticket price is 10 for the male passenger");
            else
                System.out.println("ticket price is 20 for rest male passenger");
        }
        else{
                if (age < 30)
                    System.out.println("ticket price is 50 for the female passenger");
                else
                    System.out.println("ticket price is 40 for the rest female passenger");
            }
        }
    }
