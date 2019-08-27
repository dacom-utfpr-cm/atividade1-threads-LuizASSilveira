package ex1;

import java.util.Random;
public class TesteThread extends Thread{
    private Integer number;
    public TesteThread() {
        Random number = new Random();
        this.number = number.nextInt(10000);
    }
    @Override
    public void run() {
        try {
            System.out.printf("\nthread: %d, time-> %d", this.getId(), this.number);
            Thread.sleep(this.number);
            System.out.printf("\nMorri: %d", this.getId());
        } catch (InterruptedException ex){
            System.out.println("Thread Interrompida: \t\t" + ex);
        }
    }
}