package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q12 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        
        System.out.print("Qual o tamanho do primeiro lado do triângulo?: ");
        float x = s.nextFloat();
        System.out.print("E qual o tamanho do segundo lado?: ");
        float y = s.nextFloat();
        System.out.print("E o terceiro lado?: ");
        float z = s.nextFloat();
        limparTela();

        if (x > (z+y) || y > (x+z) || z > (x+y)) {
            System.out.print("Os parâmetros informados não satisfazem as condições de um triângulo, tente novamente!\n\n");
        } else {
            String triangulo = tipo(x, y, z);
            System.out.printf("O tipo de triângulo é: %s\n\n", triangulo);
        }
    } public static String tipo(float x, float y, float z) {
        if (x == y && y == z) {
            return("Equilátero");
        } else if (x != y && x != z && z != y) {
            return("Escaleno");
        } else {
            return("Isósceles");
        }
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}