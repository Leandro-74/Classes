package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q9 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        StringBuilder resultado = new StringBuilder();
        int fetuccineResultado = 0;
        int i = 3;

        System.out.print("Qual o primeiro número que você deseja para a sequência?: ");
        int a1 = s.nextInt();
        limparTela();
        System.out.print("E qual o segundo número que você deseja para a sequência?: ");
        int a2 = s.nextInt();
        resultado.append(String.format(" %d %d", a1, a2));

        while (i < 21) {
            if (i % 2 == 0) {
                fetuccineResultado = a2 - a1;
            } else {
                fetuccineResultado = a2 + a1;
            }
            resultado.append(String.format(" %d", fetuccineResultado));
            a1 = a2;
            a2 = fetuccineResultado;
            i++;
        }
        limparTela();
        System.out.print(resultado+"\n\n");
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
