package ex4;

import java.util.ArrayList;

public class ThreadControlaThreds implements Runnable {
    private ArrayList<Thread> listThred;
    public ThreadControlaThreds(ArrayList<Thread> listThred) {
        this.listThred = listThred;
    }

    @Override
    public void run() {
        while(true){
            for (Thread t : this.listThred) {
                if(t.isInterrupted()){
                    System.out.println("Esta foi interrompida Thread:" + t.getId());
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){

            }

        }
    }
}
