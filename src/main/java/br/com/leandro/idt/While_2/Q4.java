package br.com.leandro.idt.While_2;
import java.util.Scanner;

public class Q4 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        int primeiraMaior = 0;
        int segundaMaior = 0;
        int primeiraMenor = 0;
        int segundaMenor = 0;
        int terceiraMenor = 0;
        
        while (true) {
            System.out.print("Escolha um valor para calcular a raiz, ou digite 0 para parar: ");
            int valor = s.nextInt();
            int subtrator = 1;
            int raiz = 0;
            
            if (valor == 0) {
                break;
            }

            while (true) {
                if (valor > 0) {
                    valor -= subtrator;
                    raiz++;
                    subtrator += 2;
                } else {
                    break;
                }
            }

            if (primeiraMaior == 0) {
                primeiraMaior = raiz;
            } else {
                if (raiz > primeiraMaior) {
                    segundaMaior = primeiraMaior;
                    primeiraMaior = raiz;
                } else if (raiz > segundaMaior) {
                    segundaMaior = raiz;
                }
            }

            if (primeiraMenor == 0) {
                primeiraMenor = raiz;
            } else {
                if (raiz < primeiraMenor) {
                    terceiraMenor = segundaMenor;
                    segundaMenor = primeiraMenor;
                    primeiraMenor = raiz;
                } else if (raiz < segundaMenor) {
                    terceiraMenor = segundaMenor;
                    segundaMenor = raiz;
                } else if (raiz < terceiraMenor) {
                    terceiraMenor = raiz;
                }
            }

            limparTela();
            if (valor == 0) {
                System.out.printf("A raiz do valor informado é: %d\n\n", raiz);
            } else if (valor < 0) {
                System.out.printf("A raiz aproximada do valor informado é: %d\n\n", raiz);
            } else {
                System.out.print("O cálculo da raiz falhou, tente novamente!\n\n");
            }
        }
        limparTela();
        System.out.printf("As duas maiores raízes calculadas, em ordem crescente, foram: %d, %d", segundaMaior, primeiraMaior);
        System.out.printf("\nAs três menores raízes, em ordem decrescente, foram: %d, %d, %d\n\n", terceiraMenor, segundaMenor, primeiraMenor);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}