// Faça um programa em Java que inicie três threads e, cada thread, espere um tempo aleatório para terminar.
package ex1;

import java.util.Random;
public class Main {
    public static void main(String[] args) {

        new TesteThread().start();
        new TesteThread().start();
        new TesteThread().start();
    }
}