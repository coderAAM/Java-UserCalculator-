package MultiThreading;

public class Testing {


    static void main() {

        MainTastingFile mainTastingFile = new MainTastingFile();
        Thread t1 = new Thread(mainTastingFile);
        t1.start();


        for (; ;){
            System.out.println("world");
        }
    }
}
