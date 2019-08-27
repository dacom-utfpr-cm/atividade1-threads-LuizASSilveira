//Faça uma Thread que monitora um conjunto de threads e exiba quais threads receberam sinais de interrupção.
package ex4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadMataTempo());
        Thread t2 = new Thread(new ThreadMataTempo());
        Thread t3 = new Thread(new ThreadMataTempo());

        t1.start();
        t2.start();
        t3.start();

        ArrayList<Thread> threads = new ArrayList<>();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);

        Thread monitor = new Thread(new ThreadControlaThreds(threads));
        monitor.start();

        Thread.sleep(1000);
        t1.interrupt();
        Thread.sleep(1000);
        t2.interrupt();
        Thread.sleep(3000);
        t3.interrupt();

    }
}




