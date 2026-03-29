package br.com.leandro.idt.lista1_repeticao;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        int[] val = new int[5];
        float pos = 0;
        float neg = 0;
        int posCount = 0;
        int negCount = 0;

        for (int i = 0; i < val.length; i++) {
            System.out.printf("Escolha o valor %d: ", i + 1);
            val[i] = s.nextInt();
            if (val[i] >= 0) {
                posCount++;
            } else {
                negCount++;
            }
            LimparTela();
        }
        pos = (posCount * 100.00f) / val.length;
        neg = (negCount * 100.00f) / val.length;

        System.out.printf("A porcentagem de valores positivos é: %.1f%%\n", pos);
        System.out.printf("A porcentagem de valores negativos é: %.1f%%\n\n", neg);

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}