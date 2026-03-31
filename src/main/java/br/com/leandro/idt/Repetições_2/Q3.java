package br.com.leandro.idt.Repetições_2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        LimparTela();
        Scanner s = new Scanner(System.in);

        System.out.print("Escolha um número para ver sua tabuada: ");
        int val = s.nextInt();
        System.out.print("A tabuada deverá ir até que número: ");
        int linhas = s.nextInt();

        for (int i = 1; i <= linhas; i++  ) {
            int res = val*i;
            System.out.printf("\n%d x %d = %d", val, i, res );
        }
        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}