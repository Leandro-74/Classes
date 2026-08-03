package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q7 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder();
        limparTela();

        while (true) {
            System.out.print("Observe a propriedade do valor 3025:\n\n3025: 30+25 = 55, e 55^2 = 3025!");
            System.out.print("\n\nEscolha um valor entre 1000 e 9999 para chegar se apresenta a mesma propriedade, valores fora do intervalo encerram o programa");
            System.out.print("\nValor: ");
            int valor = s.nextInt();
            if (valor > 9999 || valor < 1000) {
                resultado.append("\n\n=======================================================\n\n");
                break;
            }
            resultado.append("\n\n=======================================================\n\n");
            int val1 = valor / 100;
            int val2 = valor % 100;

            resultado.append(String.format("%d: %d+%d = %d, e %d^2 = %d.", valor, val1, val2, (val1+val2), (val1+val2), ((val1+val2)*(val1+val2))));
            
            if (((val1+val2)*(val1+val2)) == valor) {
                resultado.append("\nO valor apresenta a mesma propriedade!");
            } else {
                resultado.append("\nO valor não apresenta a mesma propriedade!");
            }
            limparTela();
            System.out.printf("Valor %d calculado com sucesso!\n\n", valor);
        }
        limparTela();
        System.out.print(resultado);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
