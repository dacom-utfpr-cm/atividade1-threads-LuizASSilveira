// Faça uma thread Java que fica aguardando uma sequência numérica de tamanho arbitrário digitado por usuário para
// realizar uma soma. Use o join().
package ex5;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> vals = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new RecebeValorNumerico(vals));
        t1.start();
        t1.join();

        Integer soma = 0;
        for (Integer var: vals) {
            soma = soma + var;
        }
        System.out.println(soma);

    }
}
