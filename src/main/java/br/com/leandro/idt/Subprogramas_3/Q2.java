package br.com.leandro.idt.Subprogramas_3;
import java.util.Scanner;

public class Q2 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String listaPerfeitos = "";
        String listaImperfeitos = "";
        while (true) {
            limparTela();

            System.out.print("Escolha um valor pra checar se o mesmo é um número perfeito: ");
            int val = s.nextInt();
            limparTela();

            if (val <= 1) {
                System.out.print("O valor dado é inválido, tente novamente!\n\n");
                System.exit(0);
            }
            String resultado = checarPerfeito(val);
            if (resultado.length() == 0) {
                System.out.print("O valor dado não é perfeito, pois a soma de seus divisores, exceto ele mesmo, não é igual a ele!\n\n");
                listaImperfeitos = lista(val, listaImperfeitos);
                int menorImperfeito = calcMenor(val);
            }
            else {
                System.out.printf("O valor informado é perfeito, pois a soma de seus divisores (exceto ele) resulta nele mesmo! Os seus divisores são:\n\n%s\n", resultado);
                listaPerfeitos = lista(val, listaPerfeitos);
                int maiorPerfeito = calcMenor(val);
            }

            System.out.print("Deseja checar outro valor(S/N)?: ");
            String continuar = s.next();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }
        limparTela();
        if (listaPerfeitos.length() > 0) {
            System.out.printf("Os números perfeitos dados foram:\n%s\n\n", listaPerfeitos);
        }
        else {
            System.out.print("Não houve nenhum número perfeito listado!\n\n");
        }
    }
    public static String checarPerfeito(int val) {
        int somaDivisores = 0;
        String divisores = "";
        for (int i = 1; i < val; i++) {
            if (val % i == 0) {
                somaDivisores += i;
                divisores += String.format("%d\n", i);
            }
        }
        if (somaDivisores != val) {
            divisores = "";
        }
        return(divisores);
    }
    public static String lista(int valor, String lista) {
        lista += String.format("\n%d", valor);
        return(lista);
    }
    public static int calcMaior(int valor) {
        if (valor = 0)
    }
    public static int calcMenor(int valor) {

    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}