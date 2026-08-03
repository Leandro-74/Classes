package br.com.leandro.idt.Subprogramas_2;
import java.util.Scanner;

public class Q4 {
    static Scanner s = new Scanner(System.in);

    static int esferaA = 0;
    static int esferaB = 0;
    static int esferaC = 0;
    static int esferaD = 0;
    static int maiores = 0;

    public static void main(String[] args) {
        int contador = 1;
        while(true) {
            limparTela();
            System.out.printf("Qual a altura da %dª caixa? (0 para encerrar): ", contador);
            double alt = s.nextDouble();
            limparTela();

            if (alt == 0) {
                break;
            }

            System.out.printf("Qual a largura da %dª caixa?: ", contador);
            double larg = s.nextDouble();
            limparTela();

            System.out.printf("E qual o comprimento da %dª caixa?: ", contador);
            double compr = s.nextDouble();
            limparTela();

            calcEsfera(alt, larg, compr);
            contador++;
        }
        int total = esferaA + esferaB + esferaC + esferaD + maiores;
        System.out.printf("para um total de %d brinquedos, serão necessárias %d esferas, tendo em vista que %d brinquedos são maiores que a maior esfera!", total, (total-maiores), maiores);
        System.out.printf("\n\nDas %d esferas necessárias, são elas:\n", (total-maiores));
        System.out.printf("\nEsferas com diâmetro de 10cm: %d", esferaA);
        System.out.printf("\nEsferas com diâmetro de 15cm: %d", esferaB);
        System.out.printf("\nEsferas com diâmetro de 20cm: %d", esferaC);
        System.out.printf("\nEsferas com diâmetro de 25cm: %d", esferaD);
    }
    public static void calcEsfera (double alt, double larg, double compr) {
        double diagonal = Math.sqrt((alt*alt)+(larg*larg)+(compr*compr));

        if (diagonal < 10) {
            esferaA++;
        }
        else if (diagonal < 15) {
            esferaB++;
        }
        else if (diagonal < 20) {
            esferaC++;
        }
        else if (diagonal < 25) {
            esferaD++;
        }
        else {
            maiores++;
        }
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
