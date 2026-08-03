package br.com.leandro.idt.Condicionais_2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("[1] Aritmética\n[2] Ponderada\n\nQual será o tipo de média usado?: ");
        byte opt = s.nextByte();
        float p1 = 0;
        float p2 = 0;
        float p3 = 0;
        float media = 0;
        float mediaPonderada = 0;

        LimparTela();
        System.out.print("Qual sua primeira nota: ");
        float n1 = s.nextFloat();
        if (opt == 2) {
            System.out.print("Qual será o peso utilizado para a primeira nota?: ");
            p1 = s.nextByte();
        } LimparTela();
        System.out.print("Qual sua segunda nota: ");
        float n2 = s.nextFloat();
        if (opt == 2) {
            System.out.print("Qual será o peso utilizado para a segunda nota?: ");
            p2 = s.nextByte();
        } LimparTela();
        System.out.print("Qual sua terceira nota: ");
        float n3 = s.nextFloat();
        if (opt == 2) {
            System.out.print("Qual será o peso utilizado para a terceira nota?: ");
            p3 = s.nextByte();
        }
        LimparTela();
        if (opt == 2) {
            mediaPonderada = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
            System.out.printf("A média ponderada resultante é: %.1f\n\n", mediaPonderada);
        } else {
            media = (n1+n2+n3)/3;
            System.out.printf("A média aritmética resultante é: %.1f\n\n", media);
        }

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
