package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q5 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();

        System.out.print("qual a duração do processo em segundos?: ");
        int segs = s.nextInt();
        
        String tempo = converter(segs);
        limparTela();

        System.out.printf("O processo dura: %s\n\n", tempo);

    } public static String converter(int segs) {
        int horas = segs / 3600;
        int minutos = (segs%3600)/60;
        int segundos = (segs%3600)%60;
        String tempo = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        return(tempo);

    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
