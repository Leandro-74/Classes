package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        boolean repetir1 = true;

        while (repetir1 == true) {
            LimparTela();
            boolean repetir2 = true;
            System.out.print("Escolha um número para ser convertido para binário (entre 0 e 128): ");
            String binario = "";
            int val = s.nextInt();
            do {
                if (val > 1) {
                    binario = val % 2 + binario;
                    val /= 2;
                } else {
                    binario = val + binario;
                    repetir2 = false;
                }
            } while (repetir2 == true);
            while (binario.length() < 8) {
                binario = "0"+binario;
            } 
            LimparTela();
            System.out.printf("O número em binário fica: %s\n\n", binario);
            System.out.print("Deseja converter outro número (S/N)?: ");
            String continuar = s.next();
            if (continuar.equalsIgnoreCase("N")) {
                repetir1 = false;
            }
        }
        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}