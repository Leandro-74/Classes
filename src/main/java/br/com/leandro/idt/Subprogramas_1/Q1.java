package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Para calcular o volume de uma esfera, forneça seu raio: ");
        double raio = s.nextDouble();

        double volume = calcvolume(raio);

        limparTela();
        System.out.printf("O volume de uma esfera de raio %.1f é %.2f.\n\n", raio, volume);

    } public static double calcvolume(double raio) {
        double resultado = (4.0/3.0)*Math.PI*Math.pow(raio, 3);
        return resultado;

    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}