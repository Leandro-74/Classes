package br.com.leandro.idt.Condicionais_2;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("Qual o tamanho do primeiro cateto (em cm, números inteiros): ");
        int c1 = s.nextInt();
        System.out.print("Qual o tamanho do segundo cateto (em cm, números inteiros): ");
        int c2 = s.nextInt();
        System.out.print("Qual o tamanho da hipotenusa (em cm, números inteiros): ");
        int h = s.nextInt();

        if ((c1*c1)+(c2*c2) == (h*h)) {
            System.out.print("\nO triângulo informado é um triângulo retângulo!\n\n");
        } else {
            System.out.print("\nO triângulo informado não é um triângulo retângulo!\n\n");
        }
        
        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}