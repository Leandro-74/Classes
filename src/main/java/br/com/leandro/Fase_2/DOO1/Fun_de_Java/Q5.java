package br.com.leandro.Fase_2.DOO1.Fun_de_Java;
import java.util.Scanner;
import java.util.Locale;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Locale ptBr = Locale.forLanguageTag("pt-BR");
        s.useLocale(ptBr);
        s.useDelimiter("[;\\s]+");

        String tipo = s.next();
        double area = 0;

        if (tipo.equalsIgnoreCase("Q")) {
            double lado = s.nextDouble();
            area = areaQuadrado(lado);
        } else if (tipo.equalsIgnoreCase("R")) {
            double base = s.nextDouble();
            double altura = s.nextDouble();
            area = areaRetangulo(base, altura);
        } else if (tipo.equalsIgnoreCase("C")) {
            double raio = s.nextDouble();
            area = areaCirculo(raio);
        } else if (tipo.equalsIgnoreCase("T")) {
            double lado1 = s.nextDouble();
            double lado2 = s.nextDouble();
            double lado3 = s.nextDouble();
            area = areaTriangulo(lado1, lado2, lado3);
        } else {
            System.exit(0);
        }
        System.out.printf(ptBr, "%.2f%n", area);
        s.close();
    }
    public static double areaQuadrado(double lado) {
        double resultado = Math.pow(lado, 2);
        return(resultado);
    }
    public static double areaRetangulo(double base, double altura) {
        double resultado = base*altura;
        return(resultado);
    }
    public static double areaCirculo(double raio) {
        double resultado = Math.PI * Math.pow(raio, 2);
        return(resultado);
    }
    public static double areaTriangulo(double lado1, double lado2, double lado3) {
        double s = (lado1+lado2+lado3)/2;
        double resultado = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return(resultado);
    }
}
