import java.util.Scanner;

public class ATM {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 25000;

        System.out.println("Enter Your Withdrawal amount: RS");
        double amount = sc.nextDouble();
        if (amount < 0){
            System.out.println("invailde enter amount: ");
        } else if (amount < 100) {
            System.out.println("Minimum withdrawal amount is: 100RS");
        } else if (amount < 50000) {
            System.out.println("Maximum withdrawal amount is: 50000RS");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Your current balance is RS" + balance);
        }else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: RS" + balance);
        }
        sc.close();
    }
}
