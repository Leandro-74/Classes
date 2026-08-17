package br.com.leandro.Fase_2.DOO1.Fun_de_Java;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("[;\\s]+");
        int[][] matriz = new int[5][5];

        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                matriz[lin][col] = s.nextInt();
            }
        }

        int somaQuartaLinha = 0;
        for (int col = 0; col < matriz[0].length; col++) {
            somaQuartaLinha += matriz[3][col];
        }
        int somaSegundaColuna = 0;
        for (int lin = 0; lin < matriz.length; lin++) {
            somaSegundaColuna += matriz[lin][1];
        }
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        int somaDiagonalSecundaria = 0;
        for (int lin = 0, col = matriz[0].length-1; lin < matriz.length; lin++, col--) {
            somaDiagonalSecundaria += matriz[lin][col];
        }
        int somaMatriz = 0;
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                somaMatriz +=  matriz[lin][col];
            }
        }

        System.out.println(somaQuartaLinha);
        System.out.println(somaSegundaColuna);
        System.out.println(somaDiagonalPrincipal);
        System.out.println(somaDiagonalSecundaria);
        System.out.println(somaMatriz);
        s.close();
    }
}

