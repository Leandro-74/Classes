package br.com.leandro.idt.While_2;
import java.util.Scanner;

public class Q2 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder lucro1 = new StringBuilder();
        StringBuilder lucro2 = new StringBuilder();
        StringBuilder lucro3 = new StringBuilder();
        boolean primeira1 = true;
        boolean primeira2 = true;
        boolean primeira3 = true;
        int lucros1 = 0;
        int lucros2 = 0;
        int lucros3 = 0;
        double compraTotal1 = 0;
        double compraTotal2 = 0;
        double compraTotal3 = 0;
        double vendaTotal1 = 0;
        double vendaTotal2 = 0;
        double vendaTotal3 = 0;
        double lucroTotal1 = 0;
        double lucroTotal2 = 0;
        double lucroTotal3 = 0;
        double mediaCompra = 0;
        double mediaLucro = 0;
        int divisor1 = 0;
        int divisor2 = 0;
        int divisor3 = 0;

        while (true) {
            LimparTela();

            System.out.print("Digite um produto a ser adicionado: ");
            String produto = s.next();
            System.out.print("Qual o custo de produção/compra do mesmo?: ");
            double custo = s.nextDouble();
            System.out.print("Qual o valor de venda do produto?: ");
            double venda = s.nextDouble();

            double lucro = ((venda-custo)*100) / venda;

            if (lucro < 10) {
                lucros1++;
                divisor1++;
                compraTotal1 += custo;
                lucroTotal1 += (venda-custo);
                vendaTotal1 += venda;
                if (primeira1) {
                    lucro1.append("\n\n-------------------------------------\n");
                    lucro1.append("Lucro abaixo de 10%:\n");
                    primeira1 = false;
                }
                lucro1.append(String.format("\n%s (R$ %.2f | R$ %.2f) : %.1f%%", produto, custo, venda, lucro));
            }
            if (lucro >= 10 && lucro <= 20) {
                lucros2++;
                divisor2++;
                compraTotal2 += custo;
                lucroTotal2 += (venda-custo);
                vendaTotal2 += venda;
                if (primeira2) {
                    lucro2.append("\n\n-------------------------------------\n");
                    lucro2.append("Lucro entre 10% e 20%:\n");
                    primeira2 = false;
                }
                lucro2.append(String.format("\n%s (R$ %.2f | R$ %.2f) : %.1f%%", produto, custo, venda, lucro));
            }
            if (lucro > 20) {
                lucros3++;
                divisor3++;
                compraTotal3 += custo;
                lucroTotal3 += (venda-custo);
                vendaTotal3 += venda;
                if (primeira3) {
                    lucro3.append("\n\n-------------------------------------\n");
                    lucro3.append("Lucro acima de 20%:\n");
                    primeira3 = false;
                }
                lucro3.append(String.format("\n%s (R$ %.2f | R$ %.2f) : %.1f%%", produto, custo, venda, lucro));
            }
            System.out.print("\n\nDesejas adicionar outro produto (S/N)?: ");
            String opt = s.next();
            
            if (opt.equalsIgnoreCase("N")) {
                break;
            } 
        }
        LimparTela();

        String faixa1 = "menos de 10%";
        String faixa2 = "entre 10% e 20%";
        String faixa3 = "mais de 20%";

        byte maisApareceu = 0;
        byte menosApareceu = 0;
        if (lucros1 > lucros2 && lucros1 > lucros3) {
            maisApareceu = 1; 
        } else if (lucros2 > lucros1 && lucros2 > lucros3) {
            maisApareceu = 2;
        } else {
            maisApareceu = 3;
        }

        if (lucros1 < lucros2 && lucros1 < lucros3) {
            menosApareceu = 1;
            mediaLucro = (lucroTotal1*100)/vendaTotal1;
        } else if (lucros2 < lucros1 && lucros2 < lucros3) {
            menosApareceu = 2;
            mediaLucro = (lucroTotal2*100)/vendaTotal2;
        } else {
            menosApareceu = 3;
            mediaLucro = (lucroTotal3*100)/vendaTotal3;
        }

        if (maisApareceu == 1) {
            System.out.printf("A faixa de lucro que mais apareceu foi a de %s.\n", faixa1);
        } else if (maisApareceu == 2) {
            System.out.printf("A faixa de lucro que mais apareceu foi a de %s.\n", faixa2);
        } else {
            System.out.printf("A faixa de lucro que mais apareceu foi a de %s.\n", faixa3);
        }

        if (menosApareceu == 1) {
            mediaCompra = compraTotal1/divisor1;
            System.out.printf("A faixa de lucro que menos apareceu foi a de %s, com uma média de R$%.2f de compra e %.2f%% de lucro.", faixa1, mediaCompra, mediaLucro);
        } else if (menosApareceu == 2) {
            mediaCompra = compraTotal2/divisor2;
            System.out.printf("A faixa de lucro que menos apareceu foi a de %s, com uma média de R$%.2f de compra e %.2f%% de lucro.", faixa2, mediaCompra, mediaLucro);
        } else {
            mediaCompra = compraTotal3/divisor3;
            System.out.printf("A faixa de lucro que menos apareceu foi a de %s, com uma média de R$%.2f de compra e %.2f%% de lucro.", faixa3, mediaCompra, mediaLucro);
        }

        System.out.print("Segue o resultado de lucro dos produtos informados: ");
        System.out.print("\nProduto (Compra | Venda) : Lucro");
        System.out.print(lucro1);
        System.out.print(lucro2);
        System.out.print(lucro3);
        System.out.print("\n\n");

    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}