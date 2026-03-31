package br.com.leandro.idt.Repetições_1;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        int[] val = new int[5];
        int primos = 0;

        for (int i = 0; i < val.length; i++) {
            System.out.printf("Escolha o valor %d: ", (i+1));
            val[i] = s.nextInt();
            LimparTela();
        }
        for (int i = 0; i < val.length; i++) {
            int n = val[i];
            if (val[i] > 1) {
                int divisores = 0;
                for (int y = 1; y <= n; y++) {
                    if (n % y == 0) {
                        divisores++;
                    }
                }
                if (divisores == 2) {
                    primos++;
                }
            }
        }
        System.out.printf("A quantidade de primos nos valores citados é: %d", primos);
        System.out.println("\n");

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
