package br.com.leandro.idt.Exercícios_avulsos;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            
            System.out.print("Informe a sua opção, (1)Soma ou (2)Mult. : ");
            int opt2 = s.nextInt();

            System.out.println("[1] Modo limitado.");
            System.out.println("[2] Modo ilimitado.\n");
            System.out.print("Que modo desejas usar?: ");
            int opt1 = s.nextInt();

            int res = 0;

            if (opt1 == 1) {
                System.out.print("Informe um número de 0 a 100: ");
                int v1 = s.nextInt();
                System.out.print("Informe outro número de 0 a 100: ");
                int v2 = s.nextInt();

                s.nextLine();

                if (v1 >= 0 && v1 <= 100) {
                    if (v2 >= 0 && v2 <= 100) {
                        if (opt2 == 1) {
                            res = v1 + v2;
                        } else if (opt2 == 2) {
                            res = v1 * v2;
                        } else {
                            System.out.println("Opção inválida o cabeçudo.");
                        } System.out.print("O resultado é: " + res + "\n");
                    } else {
                        System.out.print("O segundo valor é inválido");
                    }
                } else {
                    System.out.print("O primeiro valor é inválido.");
                }
            } else if (opt1 == 2) {
                System.out.print("Informe o primeiro valor: ");
                int v1 = s.nextInt();
                System.out.print("Informe o segundo valor: ");
                int v2 = s.nextInt();

                s.nextLine();

                if (opt2 == 1) {
                    res = v1 + v2;
                } else if (opt2 == 2) {
                    res = v1 * v2;
                } else {
                    System.out.println("Opção inválida o cabeçudo.");
                } System.out.print("O resultado é: " + res + "\n");
            }

            System.out.println("\nPressione ENTER para continuar...");
            s.nextLine();
            
            limparTela();
            s.close();
        }
    }
    public static void limparTela() {
        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {}
    }
}