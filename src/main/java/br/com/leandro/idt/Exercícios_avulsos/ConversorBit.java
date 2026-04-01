package br.com.leandro.idt.Exercícios_avulsos;
import java.util.Scanner;

public class ConversorBit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("Escolha um número para ser convertido para binário (entre 0 e 128): ");
        int val = s.nextInt();
        String binario = "";

        boolean continuar = true;

        while (continuar == true) {
            if (val > 1) {
                binario = val % 2 + binario;
                val /= 2;
            } else {
                binario = "1" + binario;
                continuar = false;
            }
        }
        while (binario.length() < 8) {
            binario = "0"+binario;
        }
        LimparTela();
        System.out.printf("O número em binário fica: %s\n\n", binario);
        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}