package br.com.leandro.idt.lista1;
import java.util.Scanner;

public class Lista1_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        LimparTela();

        System.out.print("Escolha um número: "); 
        int num = s.nextInt(); 
        s.nextLine();

        if (num %2 == 0) {
            System.out.print("\nSeu número é par");
        }
        else if (num %2 > 0) {
            System.out.print("\nSeu número é impar");
        }

        System.out.print("\n\nPressione ENTER para encerrar..."); 
        s.nextLine(); 
        s.close(); 
        LimparTela();

    } public static void LimparTela() {System.out.print("\033[H\033[2J");}
}
