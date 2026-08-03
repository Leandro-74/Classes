package br.com.leandro.idt.Condicionais_2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("Quantos anos você tem?: ");
        int anos = s.nextInt();
        System.out.print("E quantos meses você tem?: ");
        int meses = s.nextInt();
        System.out.print("E quantos dias?: ");
        int dias = s.nextInt();
        int diasTotais = 0;

        diasTotais += anos * 365;
        diasTotais += meses * 30;
        diasTotais += dias;

        System.out.printf("\nVocê viveu %d dias!\n\n", diasTotais);

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
