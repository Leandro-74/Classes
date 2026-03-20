package br.com.leandro.idt.lista1;
import java.util.Scanner;

public class Lista1_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        LimparTela();

        System.out.print("Informe um dia de 1 a 7: ");
        byte dia = s.nextByte(); 
        s.nextLine();

        if (dia == 1) {
            System.out.print("\nO dia que você indicou é Domingo!");
        }
        else if (dia == 2) {
            System.out.print("\nO dia que você indicou é Segunda-Feira!");
        }
        else if (dia == 3) {
            System.out.print("\nO dia que você indicou é Terça-Feira!");
        }
        else if (dia == 4) {
            System.out.print("\nO dia que você indicou é Quarta-Feira!");
        }
        else if (dia == 5) {
            System.out.print("\nO dia que você indicou é Quinta-Feira!");
        }
        else if (dia == 6) {
            System.out.print("\nO dia que você indicou é Sexta-Feira!");
        }
        else if (dia == 7) {
            System.out.print("\nO dia que você indicou é Sábado!");
        }
        else {
            System.out.print("\nO dia indicado não existe");
        }

        System.out.print("\n\nPressione ENTER para encerrar..."); 
        s.nextLine(); 
        s.close(); 
        LimparTela();

    } public static void LimparTela() {System.out.print("\033[H\033[2J");}
}
