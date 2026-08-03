package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q12 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        int i = 25;
        int soma = 0;

        while (i <= 200) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }
        System.out.printf("A soma de todos os pares entre 25 e 200 é: %d", soma);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
