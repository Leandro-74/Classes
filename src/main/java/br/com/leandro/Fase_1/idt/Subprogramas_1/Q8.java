package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q8 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Digite um valor inteiro qualquer: ");
        int val = s.nextInt();
        limparTela();

        if (val == 0) {
            System.out.print("O valor informado é zero, por tanto não possui sinal!\n\n");
        } else {
            boolean pos = sinal(val);
            if (pos == true) {
                System.out.print("O valor fornecido é positivo!\n\n");
            } else {
                System.out.print("O valor fornecido é negativo!\n\n");
            }
        }    
    } public static boolean sinal(int val) {
        if (val > 0) {
            return(true);
        } else {
            return(false);
        }
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}