package br.com.leandro.idt.Condicionais_2;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("Escolha um valor: ");
        int v1 = s.nextInt();
        System.out.print("Escolha outro valor: ");
        int v2 = s.nextInt();
        System.out.print("Escolha mais um valor: ");
        int v3 = s.nextInt();
        LimparTela();

        System.out.print("[1] Ordem Crescente\n[2] Ordem Decrescente\n\nEm que ordem desejas que os valores sejam posicionados?: ");
        byte opt = s.nextByte();

        StringBuilder ordenado = new StringBuilder();
        if (opt == 1) {
            if (v1 < v2 && v1 < v3) {
                ordenado.append(String.format(" [%d]", v1));
                if (v2 < v3) {
                    ordenado.append(String.format(" [%d]", v2));
                    ordenado.append(String.format(" [%d]", v3));
                } else {
                    ordenado.append(String.format(" [%d]", v3));
                    ordenado.append(String.format(" [%d]", v2));
                }
            } if (v2 < v1 && v2 < v3) {
                ordenado.append(String.format(" [%d]", v2));
                if (v1 < v3) {
                    ordenado.append(String.format(" [%d]", v1));
                    ordenado.append(String.format(" [%d]", v3));
                } else {
                    ordenado.append(String.format(" [%d]", v3));
                    ordenado.append(String.format(" [%d]", v1));
                }
            } if (v3 < v1 && v3 < v2) {
                ordenado.append(String.format(" [%d]", v3));
                if (v1 < v2) {
                    ordenado.append(String.format(" [%d]", v1));
                    ordenado.append(String.format(" [%d]", v2));
                } else {
                    ordenado.append(String.format(" [%d]", v2));
                    ordenado.append(String.format(" [%d]", v1));
                }
            } LimparTela();
            System.out.printf("A ordem dos números de forma crescente fica:%s\n\n", ordenado);
        }
        if (opt == 2) {
            if (v1 > v2 && v1 > v3) {
                ordenado.append(String.format(" [%d]", v1));
                if (v2 > v3) {
                    ordenado.append(String.format(" [%d]", v2));
                    ordenado.append(String.format(" [%d]", v3));
                } else {
                    ordenado.append(String.format(" [%d]", v3));
                    ordenado.append(String.format(" [%d]", v2));
                }
            } if (v2 > v1 && v2 > v3) {
                ordenado.append(String.format(" [%d]", v2));
                if (v1 > v3) {
                    ordenado.append(String.format(" [%d]", v1));
                    ordenado.append(String.format(" [%d]", v3));
                } else {
                    ordenado.append(String.format(" [%d]", v3));
                    ordenado.append(String.format(" [%d]", v1));
                }
            } if (v3 > v1 && v3 > v2) {
                ordenado.append(String.format(" [%d]", v3));
                if (v1 > v2) {
                    ordenado.append(String.format(" [%d]", v1));
                    ordenado.append(String.format(" [%d]", v2));
                } else {
                    ordenado.append(String.format(" [%d]", v2));
                    ordenado.append(String.format(" [%d]", v1));
                }
            } LimparTela();
            System.out.printf("A ordem dos números de forma decrescente fica:%s\n\n", ordenado);
        }

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
