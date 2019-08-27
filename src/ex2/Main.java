//Faça uma thread Java que realize a leitura de um arquivo texto com frases e exiba as frases a cada 10 segundos.
package ex2;

public class Main {
    public static void main(String[] args) {
       Thread arq = new Thread(new LeArquivo());
       arq.start();
    }
}