package br.com.leandro.idt.Repetições_2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        int[] val = new int[10];
        int primos = 0;
        int somaPrimos = 0;
        int somanPrimos = 0;
        int maiorPrimo = 0;
        int menornPrimo = 0;

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
                    somaPrimos += val[i];
                    if (maiorPrimo == 0) {
                        maiorPrimo = val[i];
                    } else {
                        if (val[i] > maiorPrimo) {
                            maiorPrimo = val[i];
                        }
                    }
                } else {
                    somanPrimos += val[i];
                    if (menornPrimo == 0) {
                        menornPrimo = val[i];
                    } else {
                        if (val[i] < menornPrimo) {
                            menornPrimo = val[i];
                        }
                    }
                }
            }
        }
        System.out.printf("A quantidade de primos é: %d\n", primos);
        System.out.printf("A soma dos números primos é: %d\n", somaPrimos);
        System.out.printf("A soma dos números não primos é: %d\n", somanPrimos);
        System.out.printf("O maior número primo é: %d\n", maiorPrimo);
        System.out.printf("O menor número não primo é: %d\n", menornPrimo);


        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
