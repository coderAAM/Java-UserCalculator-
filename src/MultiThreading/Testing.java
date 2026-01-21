package MultiThreading;

public class Testing {


    static void main() {
        MainTastingFile mainTastingFile = new MainTastingFile();
        mainTastingFile.start();
        for (; ;){
            System.out.println("world");
        }
    }
}
