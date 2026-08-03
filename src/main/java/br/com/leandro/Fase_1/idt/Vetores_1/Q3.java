package br.com.leandro.idt.Vetores_1;
import java.util.Scanner;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        limparTela();
        int[] vetor = new int[16];

        while (true) {
            System.out.print("[1] Preencher automaticamente\n[2] Preencher sequencialmente\n[3] Preencher manualmente");
            System.out.print("\n\nDe que forma deseja preencher o vetor?: ");
            int opt = s.nextInt();

            if (opt == 1) {
                preencherRandom(vetor);
            }
            else if (opt == 2) {
                preencherSequencial(vetor);
            }
            else if (opt == 3) {
                preencherManual(vetor, s);
            }
            else {
                limparTela();
                System.out.print("Opção inválida, tente novamente...\n\n");
                continue;
            }
            break;
        }
        limparTela();

        System.out.print("Vetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] ", vetor[i]);
        }

        inverterVetor(vetor);
        System.out.print("\n\nVetor invertido: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] ", vetor[i]);
        }
        s.close();

    }
    public static void preencherRandom(int[] vetor) {
        Random r = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(100);
        }
    }
    public static void preencherSequencial(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i+1;
        }
    }
    public static void preencherManual(int [] vetor, Scanner s) {
        limparTela();
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Qual o valor para a %dª posição do vetor?: ", i+1);
            vetor[i] = s.nextInt();
        }
    }
    public static void inverterVetor(int[] vetor) {
        for (int i = 0; i < vetor.length/2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[i+(vetor.length/2)];
            vetor[i+(vetor.length/2)] = aux;
        }
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}