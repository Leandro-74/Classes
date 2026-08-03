package br.com.leandro.Fase_1.idt.Vetores_1;
import java.util.Scanner;
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        limparTela();

        while (true) {
            int[] numeros = new int[12];
            System.out.print("[1] Manualmente\n[2] Automaticamente\n[0] Sair");
            System.out.print("\n\nDeseja preencher o vetor manualmente ou automaticamente?: ");
            int opt = s.nextInt();
            s.nextLine();

            if (opt == 1) {
                numeros = preencherManual(numeros, s);
            }
            else if (opt == 2) {
                numeros = preencherAutomatico(numeros);
            }
            else if (opt == 0) {
                System.exit(0);
            }
            else {
                limparTela();
                System.out.print("Opção inválida, tente novamente...\n\n");
                continue;
            }

            int X = 0;
            int Y = 0;
            limparTela();
            while (true) {
                System.out.print("Valores definidos: ");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.printf("[%d] ", numeros[i]);
                }
                System.out.print("\n\nAgora você deverá escolher duas posições do vetor (1-12) para somar, qual a 1ª posição?: ");
                X = s.nextInt();
                if (X < 1 || X > 12) {
                    limparTela();
                    System.out.print("A posição informada é inválida, tente novamente...\n");
                }
                else {
                    break;
                }

            }
            while (true) {
                System.out.print("Agora você deverá escolher duas posições do vetor (1-12) para somar, qual a 2ª posição?: ");
                Y = s.nextInt();
                if (Y < 1 || Y > 12) {
                    limparTela();
                    System.out.print("A posição informada é inválida, tente novamente...\n");
                    System.out.print("Valores definidos: ");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.printf("[%d] ", numeros[i]);
                    }
                    System.out.print("\n\n");
                }
                else {
                    break;
                }

            }
            limparTela();
            int soma = numeros[X-1] + numeros[Y-1];
            System.out.print("Valores definidos: ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("[%d] ", numeros[i]);
            }
            System.out.printf("\n\nA soma dos valores %d e %d, referentes as posições %d e %d, é: %d", numeros[X-1], numeros[Y-1], X, Y, soma);
            System.out.print("\n\nDeseja realizar o processo novamente(S/N)?: ");
            String fim = s.next();

            if (fim.equalsIgnoreCase("N")) {
                break;
            }
            else {
                limparTela();
            }

        }

    }
    public static int[] preencherAutomatico(int[] vetor) {
        Random g = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = g.nextInt(500);
        }
        return(vetor);
    }
    public static int[] preencherManual(int[] vetor, Scanner s) {
        for (int i = 1; i <= 12; i++) {
            limparTela();
            System.out.print("Você deverá preencher 12 posições de um vetor!");
            System.out.printf("\n\nQual o valor para a %dª posição do vetor?: ", i);
            vetor[i-1] = s.nextInt();
        }
        return(vetor);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
