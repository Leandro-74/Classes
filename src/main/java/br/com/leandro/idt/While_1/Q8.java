package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q8 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        StringBuilder resultado = new StringBuilder();
        int fibonacci = 1;
        int fibonacciAnterior = 0;
        int fibonacciResultado = 0;

        System.out.print("Até que número da série de Fibonacci você deseja?: ");
        int num = s.nextInt();
        resultado.append(" 1");

        while (true) {
            fibonacciResultado = fibonacci + fibonacciAnterior;
            if (fibonacciResultado < num) {
                resultado.append(String.format(" %d", fibonacciResultado));
                fibonacciAnterior = fibonacci;
                fibonacci = fibonacciResultado;
            } else {
                break;
            }
        }
        limparTela();
        System.out.printf("A sequência até o número %d fica:\n", num);
        System.out.print(resultado+"\n\n");
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
