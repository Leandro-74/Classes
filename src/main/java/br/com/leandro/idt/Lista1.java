package br.com.leandro.idt;
import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escolha um valor: ");
        int val = s.nextInt();
        s.close();

        StringBuilder res = new StringBuilder();
        if ((val % 10) == 0) res.append("[10] ");
        if ((val % 5) == 0) res.append("[5] ");
        if ((val % 2) == 0) res.append("[2] ");

        if (res.length() == 0) {System.out.print("O valor não é divisível por 2, 5 ou 10!");}
        else {System.out.print("O valor escolhido é divisível por: "+res);}
    }
}