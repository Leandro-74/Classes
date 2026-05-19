package br.com.leandro.idt.Subprogramas_1;
import java.util.Scanner;

public class Q11 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        
        System.out.print("[M] Masculino\n[F] Feminino\n\nQual o seu sexo?: ");
        String sexo = s.next();
        limparTela();
        System.out.print("Qual sua altura?: ");
        float altura = s.nextFloat();
        if (altura > 10) {
            altura /= 100;
        }

        float peso = calcPeso(altura, sexo); 
        limparTela();
        System.out.printf("O seu peso ideal é: %.1f", peso);

    } public static float calcPeso(float altura, String sexo) {
        if (sexo.equalsIgnoreCase("M")) {
            return((72.7f*altura) - 58);
        } else {
            return((62.1f*altura) - 44.7f);
        }
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}