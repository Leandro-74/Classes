package br.com.leandro.Fase_1.idt.Vetores_1;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int[] vetorC = new int[20];

        for (int i = 1; i <= 2; i++) {
            limparTela();
            if (i == 1) {
                preencherVetor(vetorA, s);
                limparTela();
                System.out.print("Primeiro vetor preenchido com sucesso, presissione ENTER para continuar...");
                s.nextLine();
            } else {
                preencherVetor(vetorB, s);
                limparTela();
                System.out.print("Segundo vetor preenchido com sucesso, presissione ENTER para continuar...");
                s.nextLine();
            }
        }
        vetorC = preencherAlternado(vetorA, vetorB, s);
        limparTela();
        System.out.print("O resultado da mesclagem dos vetores A e B é:\n\n");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("[%d] ", vetorC[i]);
        }
    }
    public static void preencherVetor(int[] vetor, Scanner s) {
        limparTela();
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Qual o valor para a %dª posição do vetor?: ", i+1);
            vetor[i] = s.nextInt();
        }
        s.nextLine();
    }
    public static int[] preencherAlternado (int[] vetorA, int[] vetorB, Scanner s) {
        int[] vetorResultado = new int[20];
        for (int i = 0; i < vetorResultado.length; i++) {
            if (i % 2 == 0) {
                vetorResultado[i] = vetorA[i];
            } else {
                vetorResultado[i] = vetorB[i];
            }
        }
        return(vetorResultado);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
