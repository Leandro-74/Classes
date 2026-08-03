package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q7 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Qual sua idade?: ");
        int idade = s.nextInt();
        limparTela();

        if (idade < 5) {
            System.out.print("Não se classifica!\n\n");
        } else {
            String resultado = categoria(idade);
            System.out.printf("A categoria de natação adequada a sua idade é: %s\n\n", resultado);
        }

    } public static String categoria(int idade) {
        if (idade >= 5 && idade <= 7) {
            return("Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            return("Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            return("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            return("Juvenil B");
        } else {
            return("Adulto");
        }

    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}