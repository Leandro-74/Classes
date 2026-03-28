package br.com.leandro.idt.lista1_repeticao;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("Escolha um valor inteiro positivo para ser fatorado: ");
        int val = s.nextInt();
        int fatorado = 1;

        for (int i = val; i > 0; i--) {
            fatorado *= i;
        }
        LimparTela();
        System.out.printf("Valor faturado ficou: %d\n\n", fatorado);

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
