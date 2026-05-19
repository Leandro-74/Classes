package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q9 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Digite um valor inteiro qualquer: ");
        int val = s.nextInt();

        boolean par = paridade(val);
        limparTela();

        if (par == true) {
            System.out.print("O valor fornecido é par!\n\n");
        } else {
            System.out.print("O valor fornecido é ímpar!\n\n");
        }
        
    } public static boolean paridade(int val) {
        if (val % 2 == 0) {
            return(true);
        } else {
            return(false);
        }

    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}