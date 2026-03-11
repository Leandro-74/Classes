package br.com.leandro.idt;
import java.util.Scanner;

public class Aula2 {
    public static void main (String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);

            System.out.print("Digite um número de 0 a 100: ");
            int v1 = s.nextInt();

            System.out.print("Digite outro valor de 0 a 100: ");
            int v2 = s.nextInt();

            s.nextLine();

            int res = 0;

            if (v1 >= 0 && v1 <= 100) {
                if (v2 >= 0 && v2 <= 100) {
                    res = v1 + v2;
                    System.out.print("O resultado é: " + res);
                    s.nextLine();
                } else {
                    System.out.println("Número v2 inválido, tente outro");
                }
            } else {
                System.out.println("Número v1 inválido, tente outro");
            } s.close();
        }
    }
}