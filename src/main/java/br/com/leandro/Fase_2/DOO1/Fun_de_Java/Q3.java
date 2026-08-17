package br.com.leandro.Fase_2.DOO1.Fun_de_Java;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int N = s.nextInt();
    long result = 1;

    if (N >= 1) {
        for (int i = N; i > 0; i--) {
            result *= i;
        }
    }
    System.out.print(result);
    s.close();
}   
}
