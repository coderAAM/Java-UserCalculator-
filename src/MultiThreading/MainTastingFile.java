package MultiThreading;

public class MainTastingFile extends Thread {
    @Override
    public void run() {
        for (; ;){
            System.out.println("hello");
        }
    }
}
