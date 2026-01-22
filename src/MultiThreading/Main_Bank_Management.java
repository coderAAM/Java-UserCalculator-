package MultiThreading;

import java.util.Scanner;

public class Main_Bank_Management {

    public static void main(String[] args) {

        Main_Bank_Management bank = new Main_Bank_Management();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Bank Management System -----");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Account Details");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double bal = sc.nextDouble();
                    bank.createAccount(name, bal);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accNo1 = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double amt1 = sc.nextDouble();
                    bank.deposit(accNo1, amt1);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int accNo2 = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double amt2 = sc.nextDouble();
                    bank.withdraw(accNo2, amt2);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int accNo3 = sc.nextInt();
                    bank.showAccount(accNo3);
                    break;

                case 0:
                    System.out.println("Thank you for using Bank System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }

    private void deposit(int accNo1, double amt1) {
    }

    private void showAccount(int accNo3) {
    }

    private void withdraw(int accNo2, double amt2) {
    }

    private void createAccount(String name, double bal) {
    }


}
