package br.com.leandro.Fase_1.idt.Vetores_1;

public class Q2 {
    public static void main(String[] args) {
        limparTela();

        int[] vetor = new int[10];
        vetor = preencherVetor(vetor);

        System.out.printf("Os %d primeiros números primos são: ", vetor.length);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] ", vetor[i]);
        }
    }
    public static int[] preencherVetor (int[] vetor) {
        for (int i = 1, x = 0; i < (vetor.length*2); i += 2, x++) {
            vetor[x] = i;
        }
        return(vetor);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}
