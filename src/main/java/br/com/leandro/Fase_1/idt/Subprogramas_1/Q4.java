package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q4 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Para calcular bháskara, segue-se a fórmula ax²+bx+c=0.\n\n");
        System.out.print("Informe o valor de a: ");
        int a = s.nextInt();
        System.out.print("Informe o valor de b: ");
        int b = s.nextInt();
        System.out.print("Informe o valor de c: ");
        int c = s.nextInt();

        double delta = Math.pow(b, 2) - (4*a*c);
        limparTela();

        if (delta < 0) {
            System.out.print("A equação dada não possui raízes reais!\n\n");
        } else {
            int soma = bhaskara(a, b);
            System.out.printf("A soma das raizes da equação dada é %d!\n\n", soma);
        }
        
    } public static int bhaskara(int a, int b) {
        int soma = -(b/a);
        return(soma);
        
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
