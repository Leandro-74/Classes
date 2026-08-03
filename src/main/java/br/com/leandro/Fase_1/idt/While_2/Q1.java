package br.com.leandro.idt.While_2;
import java.util.Scanner;

public class Q1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder sequenciaNum = new StringBuilder();
        StringBuilder sequenciaRes = new StringBuilder();
        int sequencia = 0;
        int primos = 0;
        boolean primeira = true;
        int maiorPrimo = 0;

        while (true) {
            limparTela();
            boolean primo = true;
            int i = 2;

            if (sequencia == 3) {
                sequenciaRes.append(String.format("%s\n", sequenciaNum));
                sequencia = 0;
                sequenciaNum.setLength(0);
            }

            System.out.print("Escolha um número para ser convertido para binário (entre 0 e 128): ");
            String binario = "";
            int val = s.nextInt();

            if (val <= 1) {
                primo = false;
            } else if (val == 2) {
                primo = true;
            } else {
                while (i <= Math.sqrt(val)) {
                    if (val % i == 0) {
                        primo = false;
                        break;
                    }
                    i++;
                }
            }

            if (primo == true) {
                primos++;
                sequencia++;
                sequenciaNum.append(String.format("%d ", val));
                if (primeira == true) {
                    maiorPrimo = val;
                    primeira = false;
                } else {
                    if (val > maiorPrimo) {
                        maiorPrimo = val;
                    }
                }
            } else if (sequencia > 0) {
                sequencia = 0;
                sequenciaNum.setLength(0);
            }

            while (true) {
                if (val > 1) {
                    binario = val % 2 + binario;
                    val /= 2;
                } else {
                    binario = val + binario;
                    break;
                }
            }
            while (binario.length() < 8) {
                binario = "0"+binario;
            }

            limparTela();
            System.out.printf("O número em binário fica: %s\n\n", binario);

            System.out.print("Deseja converter outro número (S/N)?: ");
            String continuar = s.next();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }
        limparTela();
        if (primos == 0) {
            System.out.print("Não houve nenhum número primo registrado!");
        } else {
            System.out.printf("O maior número primo registrado foi: %d", maiorPrimo);
            System.out.printf("\nQuantidade de números primos registrados: %d", primos);
            if (sequenciaRes.length() > 0) {
                System.out.print("\n\n=================================================\nSequências de primos registradas:\n\n");
                System.out.print(sequenciaRes);
            }
        }
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
