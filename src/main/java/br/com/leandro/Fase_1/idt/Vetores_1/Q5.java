package br.com.leandro.idt.Vetores_1;
import java.util.Scanner;
import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        limparTela();
        int[] vetor = new int[10];
        int[] pares = new int[10];

        int opt;
        do {
        System.out.print("Este programa cria um vetor de 10 posições e informa a quantidade de valores pares do vetor.");
        System.out.print("\nComo deseja preencher o vetor?");
        System.out.print("\n\n[1] Preencher manualmente\n[2] Preencher Automaticamente");
        System.out.print("\n\nOpção escolhida: ");
        opt = s.nextInt();
        s.nextLine();
        if (opt < 1 || opt > 2) {
            System.out.print("\nOpção inválida, pressione ENTER para tentar novamente...");
            s.nextLine();
            limparTela();
        }
        } while (opt < 1 || opt > 2);
        
        switch (opt) {
            case 1:
                preencherManual(vetor, s);
                break;
            case 2:
                preencherAutomatico(vetor);
                break;
        }
        limparTela();
        System.out.print("O vetor ficou preenchido da seguinte forma:\n\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] ", vetor[i]);
        }
        int qntPares = contarPares(vetor, pares);
        switch (qntPares) {
            case 1:
                System.out.printf("\n\nDesses valores, apenas 1 é par, sendo ele: %d", pares[0]);
                break;
            default:
                System.out.printf("\n\nDesses valores, %d são pares, sendo eles: ", qntPares);
                for (int i = 0; i < qntPares; i++) {
                    if (i < qntPares-1) {
                        System.out.printf("%d, ", pares[i]);
                    }
                    else {
                        System.out.printf("%d.", pares[i]);
                    }
                }
        }
    }
    public static void preencherManual(int[] vetor, Scanner s) {
        limparTela();
        for (int i = 0; i < vetor.length; i++) {
            while (true) {
                System.out.printf("Qual o valor para a %dª posição do vetor?: ", i+1);
                try {
                    vetor[i] = s.nextInt();
                }
                catch (Exception e) {
                    s.next();
                    continue;
                }
                break;
            }
        }
        limparTela();
    }
    public static void preencherAutomatico(int[] vetor) {
        Random r = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(100);
        }
    }
    public static int contarPares(int[] vetor, int[] pares) {
        int qntPares = 0;
        for (int i = 0, x = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                qntPares++;
                pares[x] = vetor[i];
                x++;
            }
        }
        return(qntPares);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
