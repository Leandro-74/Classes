package br.com.leandro.idt.Condicionais_2;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("Diga a posição do primeiro ponto (X;Y): ");
        String p1 = s.next();
        System.out.print("Diga a posição do primeiro ponto (X;Y): ");
        String p2 = s.next();

        String[] partes1 = p1.split(";");
        String[] partes2 = p2.split(";");

        int x1 = Integer.parseInt(partes1[0]);
        int y1 = Integer.parseInt(partes1[1]);
        int x2 = Integer.parseInt(partes2[0]);
        int y2 = Integer.parseInt(partes2[1]);

        if (x1 > x2) {
            System.out.print("\nOs valores informados são inválidos, tente novamente...\n\n");
        } else {
            double distancia = (((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
            distancia = Math.sqrt(distancia);
            System.out.printf("\nA distância entre os pontos é %.2f\n\n", distancia);
        }

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}