package br.com.leandro.Fase_1.idt.Vetores_1;
import java.util.Scanner;
import java.util.Random;


// ATENÇÃO: Como o enunciado da questão não limitava o uso de vetores auxiliares, decidi usar um segundo vetor para armazenar a versão corrigida.
// Fiz pois achei interessante manter o vetor original sem a correção armazenado, dessa forma no final do programa tenho os dois vetores disponíveis.
public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opt;
        int[] vetor = new int[10];
        
        do {
            limparTela();
            System.out.print(
            "Esse programa cria um vetor de 10 posições de inteiros, e substitui os negativos por zeros.");
            System.out.print("\nDe que forma deseja preencher esse vetor?");
            System.out.print(
                "\n\n[1] Preencher automaticamente\n[2] Preencher manualmente\n[3] Preencher sequencialmente");
            System.out.print("\n\nOpção escolhida: ");
            try {
                opt = s.nextInt();
            }
            catch (Exception e) {
                opt = 0;
                s.next();
            }
        } while (opt < 1 || opt > 3);
        
        switch (opt) {
            case 1 -> preencherAuto(vetor, s);
            case 2 -> preencherManual(vetor, s);
            case 3 -> preencherSequencial(vetor);
        }
        limparTela();

        int[] corrigido = corrigirVetor(vetor);
        limparTela();

        System.out.print("O vetor original é:\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] ", vetor[i]);
        }
        System.out.print("\n\nO vetor com os valores corrigidos ficou: \n");
        for (int i = 0; i < corrigido.length; i++) {
            System.out.printf("[%d] ", corrigido[i]);
        }
        System.out.print("\n\n");
    }
    public static void preencherAuto (int[] vetor, Scanner s) {
        Random r = new Random();
        while (true) {
            limparTela();
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = r.nextInt(201) - 100;
            }
            System.out.print("Os valores definidos aleatoriamente foram:\n\n");
            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("[%d] ", vetor[i]);
            }
            System.out.print("\n\nDeseja gerar eles novamente(S/N)?: ");
            String opt = s.next();

            if (opt.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    public static void preencherManual (int[] vetor, Scanner s) {
        limparTela();
        for (int i = 0; i < vetor.length; i++) {
            while (true) {
                try {
                    System.out.printf("Qual o valor para a %dª posição?: ", i+1);
                    vetor[i] = s.nextInt();
                }
                catch (Exception e) {
                    s.next();
                    continue;
                }
                break;
            }
        }
    }
    public static void preencherSequencial (int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i - 4;
        }
    }
    public static int[] corrigirVetor (int[] vetor ) {
        int [] corrigido = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                corrigido[i] = 0;
            } else {
                corrigido[i] = vetor[i];
            }
        }
        return(corrigido);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}