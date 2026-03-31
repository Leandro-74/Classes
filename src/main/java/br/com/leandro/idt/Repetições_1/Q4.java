package br.com.leandro.idt.Repetições_1;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] valores = new int[10];
        int val_max = 0;
        int val_min = 0;
        float med_soma = 0;
        float med_div = 0;
        float med = 0;
        LimparTela();

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Escolha o valor %d: ", (i+1));
            valores[i] = s.nextInt();
            if (valores[i] > val_max) {
                val_max = valores[i];
            } if (i == 0) {
                val_min = valores[i];
            } else if (valores[i] < val_min) {
                val_min = valores[i];
            }
            med_soma += valores[i];
            med_div += 1;
            LimparTela();
        }
        System.out.printf("O maior valor digitado é: %d", val_max);
        System.out.printf("\nO menor valor digitado é: %d", val_min);
        med = med_soma / med_div;
        System.out.printf("\nA média dos valores digitados é: %.2f", med);

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
