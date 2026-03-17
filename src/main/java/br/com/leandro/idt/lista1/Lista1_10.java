package br.com.leandro.idt.lista1;
import java.util.Scanner;

public class Lista1_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); LimparTela();

        System.out.print("Quantos kilos foram trazidos?: ");
        int peso = s.nextInt(); LimparTela();

        int excesso = 0;
        int multa = 0;
        if (peso > 500) {excesso = peso - 500; multa = excesso * 4;}

        if (excesso > 0) {System.out.printf("Você ultrapassou o limite de 500Kg em %dKg, deverá pagar uma multa de R$ %d,00.\n\n", excesso, multa);}
        else {System.out.print("Você não ultrapassou o limite de 500Kg, não pagará multa.\n\n");}
        s.close();

    } public static void LimparTela() {System.out.print("\033[H\033[2J");}
}
