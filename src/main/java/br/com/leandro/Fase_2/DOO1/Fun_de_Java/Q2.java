package br.com.leandro.Fase_2.DOO1.Fun_de_Java;
import java.util.Scanner;
import java.util.Locale;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Locale ptBr = Locale.forLanguageTag("pt-BR");
        s.useLocale(ptBr);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double delta = Math.pow(b, 2) - (4*a*c);

        if (delta < 0) {
            System.out.print("Sem raiz real");
        } else if (delta == 0) {
            double X = -b / 2*a;
            System.out.printf("%.2f", X);
        } else {
            double X1 = (-b + Math.sqrt(delta)) / (2*a);
            double X2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("%.2f;%.2f", X1, X2);
        }
        s.close();
    }
}
