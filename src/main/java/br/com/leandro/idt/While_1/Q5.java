package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q5 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        boolean primeira = true;
        StringBuilder resultado = new StringBuilder();
        double mediaConsumo = 0;
        double consumoResidencial = 0;
        double consumoIndustrial = 0;
        double consumoComercial = 0;
        StringBuilder maiorConsumo = new StringBuilder();
        StringBuilder menorConsumo = new StringBuilder();
        double maior = 0;
        double menor = 0;
        int clientes = 0;
        double valor = 0;

        while (true) {
            clientes++;
            if (primeira == true) {
                System.out.print("Qual o preço do kWh (apenas número, como 0,69)?: ");
                valor = s.nextDouble();
            }
            System.out.print("Qual o número do consumidor?: ");
            String numero = s.nextLine();
            s.nextLine();
            limparTela();

            System.out.print("Qual o nome do consumidor?: ");
            String nome = s.nextLine();
            limparTela();

            System.out.print("Qual o consumo em kWh?: ");
            double consumo = s.nextDouble();
            limparTela();
            mediaConsumo += consumo;

            System.out.print("[1] Residencial\n[2] Comercial\n[3] Industrial\n\nQual o tipo de consumidor?: ");
            byte tipo = s.nextByte();
            limparTela();

            if (primeira == true) {
                maior = consumo;
                maiorConsumo.append(String.format("O maior consumo foi: %s | %.2fkWh", nome, consumo));
                menor = consumo;
                menorConsumo.append(String.format("\nO menor consumo foi: %s | %.2fkWh", nome, consumo));
                primeira = false;
            } else {
                if (consumo < menor) {
                    menor = consumo;
                    menorConsumo.setLength(0);
                    menorConsumo.append(String.format("\nO menor consumo foi: %s | %.2fkWh", nome, consumo));
                }
                if (consumo > maior) {
                    maior = consumo;
                    maiorConsumo.setLength(0);
                    maiorConsumo.append(String.format("O maior consumo foi: %s | %.2fkWh", nome, consumo));
                }
            }

            if (tipo == 1) {
                consumoResidencial += consumo;
            } else if (tipo == 2) {
                consumoComercial += consumo;
            } else {
                consumoIndustrial += consumo;
            }

            resultado.append(String.format("Cliente: %s | %s", numero, nome));
            resultado.append(String.format("\nTotal a pagar: R$%.2f\n\n", (consumo * valor)));
            resultado.append("==============================================\n\n");

            System.out.print("Deseja adicionar outro consumidor(S/N)?: ");
            String continuar = s.next();
            if (continuar.equalsIgnoreCase("N")){
                mediaConsumo = (double) mediaConsumo / clientes;
                resultado.append(maiorConsumo);
                resultado.append(menorConsumo);
                resultado.append(String.format("\nA média de consumo foi: %.2fkWh", mediaConsumo));
                resultado.append(String.format("\nO consumo total para consumidores do tipo Residencial foi: %.2fkWh", consumoResidencial));
                resultado.append(String.format("\nO consumo total para consumidores do tipo Comercial foi: %.2fkWh", consumoComercial));
                resultado.append(String.format("\nO consumo total para consumidores do tipo Industrial foi: %.2fkWh", consumoIndustrial));
                break;
            }
            limparTela();   
        }
        System.out.print(resultado);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}