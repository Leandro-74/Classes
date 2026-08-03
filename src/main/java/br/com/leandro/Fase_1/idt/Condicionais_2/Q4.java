package br.com.leandro.idt.Condicionais_2;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("Quantos dias de vida você tem?: ");
        int dias = s.nextInt();

        int anos = dias / 365;
        int resto = dias % 365;
        int meses = resto / 30;
        dias = resto % 30;

        System.out.printf("Você viveu %d anos, %d meses e %d dias!\n\n", anos, meses, dias);

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
