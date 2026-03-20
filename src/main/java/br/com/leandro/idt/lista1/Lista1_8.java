package br.com.leandro.idt.lista1;
import java.util.Scanner;

public class Lista1_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        LimparTela();

        float n1 = 0; 
        float n2 = 0; 
        float n3 = 0; 
        float n4 = 0;

        do {
            System.out.print("Informe sua primeira nota:"); 
            n1 = s.nextFloat(); 
            LimparTela();
            if (n1 < 0 || n1 > 10) {
                System.out.print("Nota fora do intervalo, tente novamente.\n\n");
            }
            else {
                break;
            }
        } while (true);
        do {
            System.out.print("Informe sua segunda nota:"); 
            n2 = s.nextFloat(); 
            LimparTela();
            if (n2 < 0 || n2 > 10) {
                System.out.print("Nota fora do intervalo, tente novamente.\n\n");
            }
            else {
                break;
            }
        } while (true);
        do {
            System.out.print("Informe sua terceira nota:");
            n3 = s.nextFloat(); 
            LimparTela();
            if (n3 < 0 || n3 > 10) {
                System.out.print("Nota fora do intervalo, tente novamente.\n\n");
            }
            else {
                break;
            }
        } while (true);
        do {
            System.out.print("Informe sua quarta nota:"); 
            n4 = s.nextFloat(); 
            LimparTela();
            if (n4 < 0 || n4 > 10) {
                System.out.print("Nota fora do intervalo, tente novamente.\n\n");
            }
            else {
                break;
            }
        } while (true);

        float media = (n1+n2+n3+n4) / 4;

        if (media < 7) {
            System.out.printf("Sua média foi: %.1f\n\nInforme sua nota do exame: ", media);
            float exame = s.nextFloat(); 
            LimparTela();
            media = (media+exame) / 2;
            if (media < 5) {
                System.out.printf("Sua média foi: %.1f\n\n Você foi reprovado.", media);
            }
            else {
                System.out.printf("Sua média foi: %.1f\n\nVocê foi aprovado em exame.", media);
            }
        } else {
            System.out.printf("Sua média foi: %.1f\n\nVocê foi aprovado.\n", media);
        }
        s.close();

    } public static void LimparTela() {System.out.print("\033[H\033[2J");}
}