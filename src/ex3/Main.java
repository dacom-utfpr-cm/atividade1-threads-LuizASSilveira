package ex3;
import ex1.TesteThread;
import ex2.LeArquivo;

public class Main {
    public static void main(String[] args) {
        TesteThread theadEx1 = new TesteThread();
        Thread threadEx2 = new Thread(new LeArquivo());

        theadEx1.start();
        threadEx2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        theadEx1.interrupt();
        threadEx2.interrupt();
    }
}
