package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q10 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Qual a média do aluno?: ");
        double media = s.nextInt();
        limparTela();

        if (media < 0 || media > 10) {
            System.out.print("Nota inválida!\n\n");
        } else {
            String resultado = conceito(media);
            System.out.printf("O conceito para o aluno é: %s\n\n", resultado);
        }

    } public static String conceito(double media) {
        if (media >= 0 && media < 5) {
            return("D");
        } else if (media >= 5 && media < 7) {
            return("C");
        } else if (media >= 7 && media < 9) {
            return("B");
        } else {
            return("A");
        } 
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}