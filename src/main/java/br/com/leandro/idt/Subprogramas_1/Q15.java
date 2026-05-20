package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q15 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Para calcular o valor de S, sendo S:\n\nS=1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/N\n\nEscolha um valor natural positivo para N: ");
        int val = s.nextInt();
        limparTela();

        if (val < 1) {
            System.out.print("O valor informado é inválido, tente novamente!\n\n");
        } else {
            double valorS = calcular(val);
            System.out.printf("O valor de S para N = %d é: %.1f", val, valorS);
        }
        
    } public static double calcular(int val) {
        double resultado = 1.0 + (1.0/2.0) + (1.0/3.0) + (1.0/4.0) + (1.0/5.0) + (1.0/val);
        return(resultado);

    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
