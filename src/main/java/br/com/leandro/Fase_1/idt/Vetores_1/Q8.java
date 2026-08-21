package br.com.leandro.Fase_1.idt.Vetores_1;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        limparTela();

        int[] vetor = new int[40];
        int[] vetorResultado = new int[vetor.length];

        preencherVetor(vetor, s);
        vetorResultado = acumularValores(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] ", vetorResultado[i]);
        }
        s.close();
    }
    public static void preencherVetor(int[] vetor, Scanner s) {
        limparTela();
        System.out.print("Deseja preencher o vetor de que forma?");
        System.out.print("\n\n[1] Sequencialmente\n[2] Manualmente");
        System.out.print("\n\nOpção desejada: ");
        int opt = s.nextInt();

        limparTela();
        if (opt == 1) {
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = i+1;
            }
        } else if (opt == 2) {
            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Qual o valor para a %dª posição do vetor?: ", i+1);
                vetor[i] = s.nextInt();
            }
        }
    }
    public static int[] acumularValores(int[] vetor) {
        int[] vetorResultado = new int[vetor.length];
        vetorResultado = vetor;
        
        for (int i = 1; i < vetor.length; i++) {
            vetorResultado[i] += vetorResultado[i-1];
        }
        return(vetorResultado);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
