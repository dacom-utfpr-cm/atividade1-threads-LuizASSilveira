package ex4;

public class ThreadMataTempo extends Thread {
    @Override
    public void run() {
        try {
            while (true){
                if(this.isInterrupted()){
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e){


        }
    }

}

