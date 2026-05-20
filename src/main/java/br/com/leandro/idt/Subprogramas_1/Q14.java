package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q14 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Escolha um valor para que seja exibida sua tabuada até ele mesmo: ");
        int val = s.nextInt();
        limparTela();

        if (val < 0) {
            System.out.print("O valor informado é inválido, tente novamente!\n\n");
        } else {
            String tabuada = calcTabuada(val);
            System.out.printf("A tabuada de %d até ele mesmo é:\n\n%s\n", val, tabuada);
        }

    } public static String calcTabuada(int val) {
        String tabuada = "";

        for (int i = 1; i <= val; i++) {
            tabuada += String.format("%d x %d = %d\n", i, val, (i*val));
        }
        return(tabuada);

    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}