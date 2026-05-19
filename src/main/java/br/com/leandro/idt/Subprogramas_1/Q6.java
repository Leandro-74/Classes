package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q6 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("Quantos anos você tem?: ");
        int ano = s.nextInt();
        limparTela();
        System.out.print("E quantos meses você tem?: ");
        int mes = s.nextInt();
        limparTela();
        System.out.print("E quantos dias?: ");
        int dia = s.nextInt();
        limparTela();
        
        int resultado = idadeDias(ano, mes, dia);
        limparTela();

        System.out.printf("Você tem %d dias de vida!\n\n", resultado);
        
    } public static int idadeDias(int ano, int mes, int dia) {

        int dias = (ano*365)+(mes*30)+dia;
        return(dias);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
