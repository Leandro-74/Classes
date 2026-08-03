package br.com.leandro.idt.Exercícios_avulsos;
import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            limparTela();
            System.out.print("[1] Limitado (valores de 0 a 100).\n[2] Ilimitado.\n\nQual modo deseja usar?: ");
            int opt1 = s.nextInt(); limparTela(); s.nextLine();
            if (opt1 != 1 && opt1 != 2) {
                System.out.println("O modo indicado é inválido. Tente novamente."); s.nextLine(); continue;
            }

            System.out.print("[1] Adição.\n[2] Subtração.\n[3] Multiplicação.\n[4] Divisão.\n\nQue operação deseja executar?: ");
            int opt2 = s.nextInt(); limparTela();  s.nextLine();
            if (opt2 != 1 && opt2 != 2 && opt2 != 3 && opt2 != 4) {
                System.out.println("A operação indicada é inválida. Tente novamente."); s.nextLine(); continue;
            }
            int v1;
            do {
                System.out.print("Escolha um valor (v1): "); v1 = s.nextInt(); s.nextLine();
                if (opt1 == 1 && v1 > 100 || v1 < 0){
                    System.out.println("O primeiro valor escolhido (v1) está fora do intervalo definido. Tente novamente."); s.nextLine(); limparTela();
                } else {
                    break;
                }
            } while (true);
            int v2;
            do {
                System.out.print("Escolha outro valor (v2): "); v2 = s.nextInt();
                if (opt1 == 1 && v2 > 100 || v2 < 0) {
                    System.out.println("O segundo valor escolhido (v2) está fora do intervalo definido. Tente novamente."); s.nextLine(); limparTela();
                } else {
                    break;
                }
            } while (true);

            int res;
            if (opt2 == 1) {
                res = v1 + v2;
            } else if (opt2 == 2) {
                res = v1 - v2;
            } else if (opt2 == 3) {
                res = v1 * v2;
            } else {
                res = v1 / v2;
            }
            s.nextLine();
            System.out.println("\nO resultado da operação é: " + res + "\n\nPressione ENTER para continuar..."); s.nextLine();
            s.close();
        }
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}