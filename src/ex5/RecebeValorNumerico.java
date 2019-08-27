package ex5;
import java.util.ArrayList;
import java.util.Scanner;

public class RecebeValorNumerico extends Thread{
    ArrayList<Integer> vals ;
    public RecebeValorNumerico(ArrayList<Integer> vals) {
        this.vals = vals;
    }

    @Override
    public void run() {
        Scanner val = new Scanner(System.in);
        //Scanner val = new Scanner("21 55 66 190");

        while (val.hasNext()){
            try {
                this.vals.add(Integer.parseInt(val.next()));
            } catch (Exception e){break;}
        }

        System.out.println(val);
    }
}
