package br.com.leandro.idt.lista1;
import java.util.Scanner;

public class Lista1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); LimparTela();
        
        System.out.print("Qual seu peso (kg)?: ");
        int peso = s.nextInt();
        System.out.print("Qual sua altura (cm)?: "); 
        float altura = s.nextInt(); altura = altura / 100;
        System.out.print(altura);

        float imc = peso / (altura*altura); LimparTela(); s.nextLine();

        System.out.printf("Informações Coletadas:\n\nPeso: %d Kg\nAltura: %.2fm\n\nResultado do cálculo: ", peso, altura);
        if (imc < 20) { System.out.printf("Você está abaixo do peso ideal. Seu imc é: %.2f", imc); }
        else if (imc >= 20 && imc < 25) { System.out.printf("Você está no peso ideal. Seu imc é: %.2f", imc); }
        else if (imc >= 25 && imc < 30) { System.out.printf("Você está em sobrepeso. Seu imc é: %.2f", imc); }
        else if (imc >= 30 && imc < 40) { System.out.printf("Você tem obesidade. Seu imc é: %.2f", imc); }
        else if (imc >= 40) { System.out.printf("Você tem obesidade mórbida. Seu imc é: %.2f", imc); }
        else { System.out.print("Ocorreu um erro, tente novamente!"); }

        System.out.print("\nPressione ENTER para encerrar...");
        s.nextLine();

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
