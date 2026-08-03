package br.com.leandro.idt.Condicionais_1;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        LimparTela();
        
        System.out.print("Informe sua idade: ");
        int idade = s.nextInt(); 
        s.nextLine();

        if (idade < 16 && idade >= 0) { 
            System.out.printf("\nCom %d anos, você não possui idade para votar.", idade); 
        }
        else if (idade >= 16 && idade < 18 || idade >= 65) { 
            System.out.printf("\nCom %d anos, você é um eleitor facultativo.", idade); 
        }
        else if (idade >= 18 && idade < 65) { 
            System.out.printf("\nCom %d anos, você é um eleitor obrigatório.", idade); 
        }
        else { 
            System.out.println("\nIdade inválida, tente novamente."); 
        }

        System.out.print("\n\nPressione ENTER para encerrar...");
        s.nextLine(); 
        s.close(); 
        LimparTela();

    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
