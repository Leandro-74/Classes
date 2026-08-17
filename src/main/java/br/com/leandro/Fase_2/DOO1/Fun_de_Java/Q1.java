package br.com.leandro.Fase_2.DOO1.Fun_de_Java;
import java.util.Scanner;
import java.util.Locale;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Locale ptBr = Locale.forLanguageTag("pt-BR");
        s .useLocale(ptBr);

        Double raio = s.nextDouble();
        Double altura = s.nextDouble();

        Double resultado = Math.PI * Math.pow(raio, 2) * altura;
        System.out.printf("%.2f", resultado);
        s.close();
    }
}
