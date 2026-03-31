package br.com.leandro.idt.lista1_repeticao;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Escolha o valor (%d): ", (i+1));
            num[i] = s.nextInt();
            LimparTela();
        }

        System.out.println("Estes são os valores negativos:\n");
        
        for (int i = 1; i < num.length; i++) {
            if (num[i] < 0) {
                System.out.println(num[i]);        
            }
        }
        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
