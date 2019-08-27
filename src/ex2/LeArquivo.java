package ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo implements Runnable {
    @Override
    public void run() {
        FileReader arq = null;
        try {
            while (true) {
                arq = new FileReader("/home/luiz/IdeaProjects/atividade1-threads-LuizASSilveira/src/ex2/frases.txt");
                BufferedReader lerArq = new BufferedReader(arq);

                String linha = lerArq.readLine();
                while (linha != null) {
                    System.out.printf("%s\n", linha);
                    linha = lerArq.readLine();
                }
                System.out.println("\n\n\n");
                arq.close();

                Thread.sleep(10000);
            }
        } catch(IOException e){
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        } catch(InterruptedException e){
            System.out.println("Fui Interronpido:\t\t" + e);
        }
    }
}

