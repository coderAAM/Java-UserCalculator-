package MultiThreading;

import MultiThreading.Bank_Account_Managment;

import java.util.ArrayList;

public class Bank_App_Managment {

    private ArrayList<Bank_Account_Managment> accounts = new ArrayList<>();
    private int accountCounter = 1001;

    // Create new account
    public void createAccount(String name, double balance) {
        Bank_Account_Managment acc = new Bank_Account_Managment(accountCounter++, name, balance);
        accounts.add(acc);
        System.out.println("Account created successfully!");
        System.out.println("Your Account Number is: " + acc.getAccountNumber());
    }

    // Find account
    private Bank_Account_Managment findAccount(int accNo) {
        for (Bank_Account_Managment acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    // Deposit money
    public void deposit(int accNo, double amount) {
        Bank_Account_Managment acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw money
    public void withdraw(int accNo, double amount) {
        Bank_Account_Managment acc = findAccount(accNo);
        if (acc != null) {
            acc.withDraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Show account details
    public void showAccount(int accNo) {
        Bank_Account_Managment acc = findAccount(accNo);
        if (acc != null) {
            acc.showDetails();
        } else {
            System.out.println("Account not found.");
        }
    }
}
