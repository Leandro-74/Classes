package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q13 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        int paisA = 5000000;
        int paisB = 7000000;
        int anos = 0;

        while (true) {
            if (paisB > paisA) {
                paisA += paisA*0.03;
                paisB += paisB*0.02;
                anos++;
            } else {
                break;
            }
        }
        System.out.print("Dada as seguintes informações:\n\n");
        System.out.print("País A: 5 milhões de habitantes, taxa de natalidade de 3% ao ano\n");
        System.out.print("País B: 7 milhões de habitantes, taxa de natalidade de 2% ao ano\n\n");
        System.out.printf("Levará %d anos para que o país A supere o país B!", anos);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
