package br.com.leandro.idt.Vetores_1;
import java.util.Scanner;
import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        limparTela();
        int[] vetor = new int[20];
        boolean optInvalida = false;
        
        while (true){
            System.out.print("Este programa cria um vetor de 20 posições e depois mostra o número contido numa posição especificada, para começar escolha a forma de preenchimento:");
            System.out.print("\n\n[1] Preencher manualmente\n[2] Preencher aleatoriamente\n[3] Preencher sequencialmente");
            if (optInvalida == true) {
                System.out.print("\n\nA opção digitada é inválida, tente novamente.");
                optInvalida = false;
            }
            System.out.print("\n\n:: ");
            int opt = s.nextInt();

            if (opt == 1) {
                preencherManual(vetor, s);
                break;
            }
            else if (opt == 2) {
                preencherAuto(vetor);
                break;
            }
            else if (opt == 3) {
                preencherSequencial(vetor);
                break;
            }
            else {
                optInvalida = true;
                limparTela();
                continue;
            }
        }
        limparTela();

        System.out.printf("Agora, escolha uma posição do vetor (0-%d) para mostrar o valor da posição: ", vetor.length-1);
        int pos = s.nextInt();
        System.out.printf("\nO valor contido na posição %d é %d!\n\n", pos, vetor[pos]);
    }
    public static void preencherAuto(int[] vetor) {
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
    public static void preencherManual(int[] vetor, Scanner s) {
        limparTela();
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Qual o valor para a %dª posição do vetor?: ", i+1);
            vetor[i] = s.nextInt();
        }
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
