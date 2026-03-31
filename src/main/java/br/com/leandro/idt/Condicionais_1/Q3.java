package br.com.leandro.idt.Condicionais_1;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor = 0;
        int quantidade = 0;
        while (true) {
            LimparTela();
            System.out.print("Digite um valor a ser calculado: ");
            int nValor = s.nextInt(); 
            valor += nValor; 
            quantidade += 1;

            System.out.print("\n\n[1] Adicionar outro valor\n[2] Encerrar somatória\n\nQue opção deseja executar?: ");
            int opt = s.nextInt();

            if (opt == 1) { 
                continue; 
            }
            else if (opt == 2) { 
                break; 
            }
        }
        float media = valor / quantidade;
        LimparTela(); 
        s.nextLine();

        if (media < 501) { 
            System.out.printf("Seu saldo médio foi de %.2f, não foi possível liberar crédito.\n\nPressione ENTER para encerrar...", media); 
        }
        else if(media >= 501 && media < 1001) { 
            System.out.printf("Seu saldo médio foi de %.2f, o crédito liberado será de 30%% do saldo médio.\n\nPressione ENTER para encerrar...", media); 
        }
        else if(media >= 1001 && media < 3001) { 
            System.out.printf("Seu saldo médio foi de %.2f, o crédito liberado será de 40%% do saldo médio.\n\nPressione ENTER para encerrar...", media); 
        }
        else if(media >= 3001) { 
            System.out.printf("Seu saldo médio foi de %.2f, o crédito liberado será de 50%% do saldo médio.\n\nPressione ENTER para encerrar...", media); 
        }
        s.nextLine(); 
        LimparTela(); 
        s.close();

    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
