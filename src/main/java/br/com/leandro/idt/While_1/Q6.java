package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q6 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        int subtrator = 1;
        int raiz = 0;

        System.out.print("Escolha um valor para calcular a raiz: ");
        int valor = s.nextInt();
        
        while (true) {
            if (valor > 0) {
                valor -= subtrator;
                raiz++;
                subtrator += 2;
            } else {
                break;
            }
        }
        limparTela();
        if (valor == 0) {
            System.out.printf("A raiz do valor informado é: %d", raiz);
        } else if (valor < 0) {
            System.out.printf("A raiz aproximada do valor informado é: %d", raiz);
        } else {
            System.out.print("O cálculo da raiz falhou, tente novamente!");
        }
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}