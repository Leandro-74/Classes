package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder lucro1 = new StringBuilder();
        StringBuilder lucro2 = new StringBuilder();
        StringBuilder lucro3 = new StringBuilder();
        boolean primeira1 = true;
        boolean primeira2 = true;
        boolean primeira3 = true;

        while (true) {
            LimparTela();
            System.out.print("Digite um produto a ser adicionado: ");
            String produto = s.next();
            System.out.print("Qual o custo de produção do mesmo(somente número)?: ");
            double custo = s.nextDouble();
            System.out.print("Qual o valor de venda do produto?: ");
            double venda = s.nextDouble();
            double lucro = ((venda-custo)*100) / venda;

            if (lucro < 10) {
                if (primeira1) {
                    lucro1.append("\n\n-------------------------------------\n");
                    lucro1.append("Lucro abaixo de 10%:\n");
                    primeira1 = false;
                }
                lucro1.append(String.format("\n%s : %.1f%%", produto, lucro));
            }
            if (lucro >= 10 && lucro <= 20) {
                if (primeira2) {
                    lucro2.append("\n\n-------------------------------------\n");
                    lucro2.append("Lucro entre 10% e 20%:\n");
                    primeira2 = false;
                }
                lucro2.append(String.format("\n%s : %.1f%%", produto, lucro));
            }
            if (lucro > 20) {
                if (primeira3) {
                    lucro3.append("\n\n-------------------------------------\n");
                    lucro3.append("Lucro acima de 20%:\n");
                    primeira3 = false;
                }
                lucro3.append(String.format("\n%s : %.1f%%", produto, lucro));
            }
            System.out.print("\n\nDesejas adicionar outro produto (S/N)?: ");
            String opt = s.next();
            if (opt.equalsIgnoreCase("N")) {
                break;
            } 
        }
        LimparTela();
        System.out.print("Segue o resultado de lucro dos produtos informados: ");
        System.out.print(lucro1);
        System.out.print(lucro2);
        System.out.print(lucro3);
        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
