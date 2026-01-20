import java.util.Scanner;

public class userCalculator {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choices;

        do {
            System.out.println("\n calculator Menu");
            System.out.println("1. Add");
            System.out.println("2. subtract");
            System.out.println("3. Multiple");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.println("Apna Choices Number Enter karo");

            choices = sc.nextInt();

            if (choices >= 1 && choices <= 4 ){
                System.out.println("First Number Enter karo");
                double num1 = sc.nextDouble();

                System.out.println("Second Number Enter Karo");
                double num2 = sc.nextDouble();

                switch (choices){
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0){
                            System.out.println("Result: " + (num1 / num2));
                        }else {
                            System.out.println("Error: 0 se divide nahi hota");
                        }
                        break;
                }
            } else if (choices != 0) {
                System.out.println("Invalid choice! Sirf 0 se 4 tak number dalo");
            }
        } while (choices != 0);
            System.out.println("Calculator  band ho gaye: ");
            sc.close();

    }
}
