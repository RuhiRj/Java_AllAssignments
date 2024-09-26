package assignment19;

 abstract public class Account {
    public String accountNo;
    public double balance;
    public static double rateOfInterest;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }
     public abstract double calculateInterest(int time);
}
class SavingAccount{
     private String customerName;

    public void TestDriver(){
        SavingAccount sv=new SavingAccount();
        sv.setCustomerName("rima");
        sv.getCustomerName();
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
