package MultiThreading;

public class Bank_Account_Managment {

    private  int accountNumber;
    private  String holdName;
    private  double balance;

    public Bank_Account_Managment(int i, String name, double balance) {

    }


    public void Account(int accountNumber, String holdName, double balance){
        this.accountNumber = accountNumber;
        this.holdName = holdName;
        this.balance = balance;
    }
    // Deposit Amount
    public  void  deposit(double amount){
       if (amount > 0){
           amount += balance;
           System.out.println("Amount is deposit successfully");
       }else {
           System.out.println("invalid amount. ");
       }
    }

    // withdraw
    public void withDraw(double amount) {
       if (amount > 0 && amount <= balance){
           System.out.println("Successfully withdraw");
       }else {
           System.out.println("Insufficient balance or invalid amount.");
       }
    }

    public int getAccountNumber(){
       return accountNumber;
    }
    public double getBalance(){
       return balance;
    }

    //Account Details
    public void  showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Hold Name: " + holdName);
        System.out.println("Account Balance: " + balance);
    }
}
