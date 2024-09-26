package Account1;

import assignment16.Account;

 class assignment {
    public static void main(String[] args) {
            Customer c = new Customer("mina", "100", 5000);
            c.deposit(2000);
            c.checkBalance();
            c.withdraw(4000);
            c.checkBalance();
            c.withdraw(5000);
            c.checkBalance();

        }
    }
        public class Customer {
        public String customerName;
        public Account account;
        public Customer(String cusname,String acc,double bal){
            account=new Account();
            account.setAccountNumber(acc);
            account.setBalance(bal);
            customerName=cusname;
        }
        public void deposit(double amt){
            account.setBalance(account.getBalance()+amt);
        }

        public void withdraw(double amt){
            if(account.getBalance()-amt>0)
           account.setBalance(account.getBalance()-amt);
            else
                System.out.println("Insufficient balance");
        }
        public void checkBalance(){
            System.out.println("customer account number "+account.getAccountNumber());
            System.out.println("name " +customerName);
            System.out.println("total balance is " +account.getBalance());
        }
}
