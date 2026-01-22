package MultiThreading;
// extent Thread
public class MainTastingFile implements Runnable {
    @Override
    public void run() {
        for (; ;){
            System.out.println("hello");
        }
    }
}
