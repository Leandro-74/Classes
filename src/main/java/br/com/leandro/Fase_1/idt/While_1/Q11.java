package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q11 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        int i = 1;
        String resultado = "";

        while (i <= 500) {
            if (i == 500) {
                if (i % 5 == 0 || i % 3 == 0) {
                    resultado += i + ". ";
                }
            } else {
                if (i % 5 == 0 || i % 3 == 0){
                    resultado += i + ", ";
                }
            }
            i++;
        }
        System.out.printf("Os números de 1 a 500 divisíveis por 5 e por 3 são:\n%s\n\n", resultado);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
