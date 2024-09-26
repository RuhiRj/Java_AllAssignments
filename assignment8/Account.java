package assignment8;

public class Account {
    String accountNumber;
    String customerName;
    float balance;
    static float rateOfInterest;
    void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    void setBalance(float balance){
        this.balance=balance;
    }
    static void setRateOfInterest(float rate){
        Account.rateOfInterest=rate;
    }
    static float calculateSimpleInterest(int time,float principal ){
        return (principal * rateOfInterest * time)/100;
    }
    String getAccountNumber(){
        return accountNumber;
    }
    String getCustomerName(){
        return customerName;
    }
    float getBalance(){
        return balance;
    }
    float getRateOfInterest(){
        return rateOfInterest;
    }
}
class ShowAccountBalance{
    public static void main(String[] args){
        Account a1=new Account();
        a1.setAccountNumber("6534985423750");
        String accno=a1.getAccountNumber();
        System.out.println("account number is  = " +accno);
        a1.setCustomerName("Ruhi Raj, Parth Prakash");
        String cusname=a1.getCustomerName();
        System.out.println("customer name is = " +cusname);
        a1.setBalance(2034440f);
        float bal=a1.getBalance();
        System.out.println("net balance is = " +bal);
        Account.setRateOfInterest(5.5f);
        float rate=a1.getRateOfInterest();
        System.out.println("rate of interest is = " +rate +"%");
        float si=Account.calculateSimpleInterest(5,25000f);
        System.out.println("Simple interest for 5 years on ₹25,000 principal = ₹"  +si);
    }
}
