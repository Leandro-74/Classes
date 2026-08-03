package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q2 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Qual a primeira nota do aluno?: ");
        float nota1 = s.nextFloat();
        System.out.print("Qual a segunda nota do aluno?: ");
        float nota2 = s.nextFloat();
        System.out.print("Qual a terceira nota do aluno?: ");
        float nota3 = s.nextFloat();
        limparTela();

        System.out.print("[A] Aritmética\n[P] Ponderada\n\nQual opção de média desejas usar?: ");
        String opt = s.next();

        double media = media(nota1, nota2, nota3, opt);
        limparTela();

        if (opt.equalsIgnoreCase("A")) {
            System.out.printf("A média aritmética das notas informadas é: %.1f\n\n", media);
        } else {
            System.out.printf("A média ponderada das notas informadas é: %.1f\n\n", media);
        }
    } public static double media(float nota1, float nota2, float nota3, String opt) {
        double media = 0;

        if (opt.equalsIgnoreCase("P")) {
            int pesos = 5+3+2;
            nota1 = nota1 * 5;
            nota2 = nota2 * 3;
            nota3 = nota3 * 2;
            media = (double) (nota1+nota2+nota3)/pesos;
        } else {
            media = (double) (nota1+nota2+nota3)/3;
        }
        return(media);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}