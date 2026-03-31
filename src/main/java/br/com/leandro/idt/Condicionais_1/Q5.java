package br.com.leandro.idt.Condicionais_1;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        LimparTela();

        System.out.print("[1] Vegetariano\n[2] Peixe\n[3] Frango\n[4] Carne\n\n Qual prato você escolheu?: ");
        int prato = s.nextInt(); 
        LimparTela();
        System.out.print("[1] Abaxaci\n[2] Sorvete diet\n[3] Mousse diet\n[4] Mousse chocolate\n\nQual sobremesa você escolheu?: ");
        int sobremesa = s.nextInt(); 
        LimparTela();
        System.out.print("[1] Chá\n[2] Suco de laranja\n[3] Suco de melão\n[4] Refrigerante diet\n\nQual bebida você escolheu?: ");
        int bebida = s.nextInt(); 
        LimparTela(); 
        s.nextLine();

        int cal = 0;

        if (prato == 1) {
            cal += 180;
        }
        else if (prato == 2) {
            cal += 230;
        }
        else if (prato == 3) {
            cal += 250;
        }
        else if (prato == 4) {
            cal += 350;
        }

        if (sobremesa == 1) {
            cal += 75;
        }
        else if (sobremesa == 2) {
            cal += 110;
        }
        else if (sobremesa == 3) {
            cal += 170;
        }
        else if (sobremesa == 4) {
            cal += 200;
        }

        if (bebida == 1) {
            cal += 20;
        }
        else if (bebida == 2) {
            cal += 70;
        }
        else if (bebida == 3) {
            cal += 100;
        }
        else if (bebida == 4) {
            cal += 65;
        }

        System.out.printf("O seu consumo calórico foi de: %dkcal", cal);
        System.out.print("\n\nPressione ENTER para encerrar..."); 
        s.nextLine(); 
        s.close(); 
        LimparTela();

    } public static void LimparTela() { System.out.print("\033[H\033[2J"); }
}
