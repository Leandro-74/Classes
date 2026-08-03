package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q3 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Escolha um valor para saber se o mesmo é primo: ");
        int val = s.nextInt();

        boolean primo = primo(val);

        if (primo == false) {
            System.out.print("O valor dado não é primo!\n\n");
        } else {
            System.out.print("O valor dado é primo!\n\n");
        }
        
    } public static boolean primo (int val) {
        boolean primo = true;
        int i = 2;
        if (val <= 1) {
            primo = false;
        } else if (val == 2) {
            primo = true;
        } else {
            while (i <= Math.sqrt(val)) {
                if (val % i == 0) {
                    primo = false;
                    break;
                }
                i++;
            }
        }
        return(primo);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}