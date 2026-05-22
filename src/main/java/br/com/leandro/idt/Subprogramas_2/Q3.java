package br.com.leandro.idt.Subprogramas_2;
import java.util.Scanner;

public class Q3 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            limparTela();

            System.out.print("Qual a massa, em gramas, do material a ser calculado seu decaimento até menos que 0,5 gramas?: ");
            float massaInicial = s.nextFloat();
            limparTela();

            if (massaInicial < 0.5) {
                System.out.print("A massa do material já é menor que 0,5 gramas ou apresenta um valor inválido! Tente novamente.\n\n");
                System.exit(0);
            }
            String resultado = decaimento(massaInicial);
            System.out.print(resultado);

            System.out.print("Deseja calcular o decaimento de outro material(S/N)?: ");
            String continuar = s.next();

            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }
        s.close();
    }
    public static String decaimento(float massaInicial) {
        float massaFinal = massaInicial;
        int segundos = 0;
        while (massaFinal >= 0.5) {
            massaFinal /= 2;
            segundos += 50;
        }
        int horas = segundos/3600;
        int minutos = (segundos%3600)/60;
        segundos = (segundos%3600)%60;
        String resultado = String.format("Para um material de %.1f gramas, levará %02d:%02d:%02d para que ele fique com uma massa de %.2f gramas, sendo menor que 0,5 gramas\n\n", massaInicial, horas, minutos, segundos, massaFinal);
        return(resultado);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}