package br.com.leandro.idt.Repetições_2;
import  java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        int alunosBom = 0;
        int alunosExemplar = 0;
        float media2 = 0;
        int divisor = 0;

        for (int a = 0; a < 5; a++) {
            float media = 0;
            float notas = 0;
            int dezCount = 0;
            for (int b = 0; b < 4; b++) {
                System.out.printf("Digite a nota do %dº bimestre do %dº aluno: ", b+1, a+1);
                notas = s.nextFloat();
                if (notas == 10) {
                    dezCount++;
                }
                media += notas;
            }
            media /= 4;
            if (media >= 7 && media < 8) {
                alunosBom++;
            } else if (media >= 9) {
                media2 += media;
                divisor++;
                if (dezCount >= 2) {
                    alunosExemplar++;
                }
            }
            LimparTela();
        }
        if (divisor == 0) {
            divisor = 1;
        }
        media2 = media2 / divisor;
        System.out.printf("Quantidade de alunos que obtiveram \"Honras pelo bom aproveitamento\": %d\n", alunosBom);
        System.out.printf("Quantidade de alunos exemplares: %d\n", alunosExemplar);
        System.out.printf("A media de notas de todos os alunos que tiraram 9 ou mais é: %.1f\n", media2);
        if (media2 >= 9.5) {
            System.out.print("Os alunos que receberam Honras por Excelência ou Aluno Exemplar tendem a nota: 10\n\n");
        } else {
            System.out.print("Os alunos que receberam Honras por Excelência ou Aluno Exemplar tendem a nota: 9\n\n");
        }
        

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
