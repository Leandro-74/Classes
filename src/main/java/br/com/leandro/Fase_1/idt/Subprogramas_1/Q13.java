package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q13 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Escolha um valor natural para calcular seu fatorial: ");
        int val = s.nextInt();
        limparTela();

        if (val < 0) {
            System.out.print("O valor informado é inválido (menor que 0), tente novamente!\n\n");
        } else {
            int fatorial = calcFatorial(val);
            System.out.printf("O fatorial de %d é %d\n\n", val, fatorial);
        }
        
    } public static int calcFatorial(int val) {
        for (int i = val-1; i > 1; i--) {
            val *= i;
        }
        return(val);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}