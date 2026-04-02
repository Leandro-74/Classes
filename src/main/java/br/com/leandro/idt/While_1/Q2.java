package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("Que intervalo de temperatura em Fahrenheit deseja converter para Celsius (Ex.: 20-30)?: ");
        String intervalo = s.next();

        String[] partes = intervalo.split("-");
        int f1 = Integer.parseInt(partes[0]);
        int f2 = Integer.parseInt(partes[1]);
        int f = f1;
        LimparTela();

        while (f <= f2) {
            double c = (5.0 / 9.0) * (f - 32);
            System.out.printf("Convertendo %dºF para Celsius, se obtém %.1fºC.\n", f, c);
            f++;
        }

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}