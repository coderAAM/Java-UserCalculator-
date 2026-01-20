import java.util.Scanner;

public class counter_App {
    static void main(String[] args) {

        int counterValue = 0;
      Scanner sc  = new Scanner(System.in);
        System.out.println("Counter App Started");
        System.out.println("1 enter karo counter increase karne ke liye");
        System.out.println("0 enter karo program band karne ke liye");

        while (true){
            int num = sc.nextInt();

            if (num == 1){
                counterValue ++;
                System.out.println("CounterValue is: " + counterValue);
            } else if (num == 0) {
                System.out.println("Program End");
                break;
            }else {
                System.out.println("Only Enter the value 0 and 1: ");
            }
        }
        sc.close();
    }
}
