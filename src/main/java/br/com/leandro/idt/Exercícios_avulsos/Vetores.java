package br.com.leandro.idt.Exercícios_avulsos;
import java.util.Scanner;

public class Vetores {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Quantos valores você deseja informar?: ");
        int tamanho = s.nextInt();
        limparTela();

        if (tamanho == 0) {
            System.out.print("Encerrando programa...\n\n");
            System.exit(0);
        }
        int[] valores = new int[tamanho];

        for (int i = 0; i < valores.length; i++) {
            limparTela();
            System.out.printf("Insira o %dº valor: ", i+1);
            valores[i] = s.nextInt();
        }

        int maior = maior(valores);
        limparTela();

        System.out.printf("O maior valor dado é: %d\n\n", maior);
        s.close();
    }
    public static int maior(int[] valores) {
        int maior = 0;
        for (int i = 0; i < valores.length; i++) {
            if (i == 0) {
                maior = valores[i];
            } else {
                if (valores[i] > maior) {
                    maior = valores[i];
                }
            }
        }
        return(maior);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}