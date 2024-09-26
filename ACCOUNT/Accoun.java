package ACCOUNT;

public class Accoun {
        private String accountNumber;
        private double balance;
        protected void accessBalance(double balance){
            this.balance=balance;
        }
        protected void showBalance(){
            System.out.println(balance);
        }
    }

