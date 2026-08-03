package br.com.leandro.idt.While_2;
import java.util.Scanner;

public class Q6 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        StringBuilder crescimentoA = new StringBuilder();
        int paisA = 5000000;
        int paisB = 7000000;
        int anos = 0;
        int diferenca1 = 0;
        int diferencaSuperado = 0;

        while (true) {
            if (paisB > paisA) {
                crescimentoA.append(String.format("Ano %d: %d pessoas\n", anos, paisA));
                paisA += paisA*0.03;
                paisB += paisB*0.02;
                if (diferenca1 == 0) {
                    diferenca1 = paisB - paisA;
                }
                anos++;
            } else {
                diferencaSuperado = paisA - paisB;
                break;
            }
        }
        System.out.print("Dada as seguintes informações:\n\n");
        System.out.print("País A: 5 milhões de habitantes, taxa de natalidade de 3% ao ano\n");
        System.out.print("País B: 7 milhões de habitantes, taxa de natalidade de 2% ao ano\n\n");
        System.out.printf("Levará %d anos para que o país A supere o país B!\n\n", anos);
        System.out.printf("No primeiro ano, o país B tinha %d pessoas a mais que o país A.\n", diferenca1);
        System.out.printf("No momento da superação, o país A ficará com %d pessoas a mais que o país B.\n\n", diferencaSuperado);
        System.out.print("Crescimento populacional do País A ao longo dos anos:\n\n");
        System.out.print(crescimentoA+"\n");
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}