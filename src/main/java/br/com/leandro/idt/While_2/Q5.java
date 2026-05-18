package br.com.leandro.idt.While_2;
import java.util.Scanner;

public class Q5 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        StringBuilder sequencia = new StringBuilder();
        StringBuilder raizes = new StringBuilder();
        int fibonacci = 1;
        int fiboAnterior = 0;
        int fiboResultado = 0;

        System.out.print("Até que número da série de Fibonacci você deseja?: ");
        int num = s.nextInt();
        sequencia.append(" 1");
        raizes.append(" 1");

        while (true) {
            fiboResultado = fibonacci + fiboAnterior;
            int valor = fiboResultado;
            int subtrator = 1;
            int raiz = 0;
            while (true) {
                if (valor > 0) {
                    valor -= subtrator;
                    raiz++;
                    subtrator += 2;
                } else {
                    break;
                }
            }
            if (fiboResultado < num) {
                sequencia.append(String.format(", %d", fiboResultado));
                raizes.append(String.format(", %d", raiz));
                fiboAnterior = fibonacci;
                fibonacci = fiboResultado;
            } else {
                break;
            }
        }
        limparTela();
        System.out.printf("As raízes de cada valor da sequência são:%s\n", raizes);
        System.out.printf("A sequência até o número %d fica:%s\n\n", num, sequencia);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}