package br.com.leandro.idt.lista1_repeticao;
import java.util.Scanner;

public class Q3 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        int[] val = new int[10];
        int pos = 0;
        int med_div = 0;
        float med_res = 0;
        StringBuilder neg = new StringBuilder();
        StringBuilder inter = new StringBuilder();

        for (int i = 0; i < val.length; i++) {
            System.out.printf("Escolha o valor %d: ", (i+1));
            val[i] = s.nextInt();
            LimparTela();
        }
        for (int i = 0; i < val.length; i++) {
            if (val[i] > 0) {
                pos = pos + val[i];
                med_div++;
            }
            else if (val[i] < 0) {
                neg.append(String.format(" [%d]", val[i]));
            }
            if (val[i] >= 5 && val[i] <= 50) {
                inter.append(String.format(" [%d]", val[i]));
            }
        }
        med_res = (float) pos / med_div;
        System.out.printf("Esta é a média dos valores positivos: %.2f", med_res);
        System.out.printf("\n\nEstes são os valores negativos:%s", neg);
        System.out.printf("\n\nEstes são os valores no intervalo 5-50:%s", inter);

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
