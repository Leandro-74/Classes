package br.com.leandro.idt.lista1_repeticao;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        LimparTela();
        Scanner s = new Scanner(System.in);

        System.out.print("Escolha um número para ver sua tabuada: ");
        int val = s.nextInt();

        for (int i = 1; i <= 10; i++  ) {
            int res = val*i;
            System.out.printf("\n%d x %d = %d", val, i, res );
        }

    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
