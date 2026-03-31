package br.com.leandro.idt.lista1_repeticao;
import  java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        int alunosBom = 0;
        int alunosExemplar = 0;
        StringBuilder notasExemplar = new StringBuilder();

        for (int a = 0; a < 5; a++) {
            String bimestrescomDez = "";
            float media = 0;
            float notas = 0;
            int dezCount = 0;
            for (int b = 0; b < 4; b++) {
                System.out.printf("Digite a nota do %dº bimestre do %dº aluno: ", b+1, a+1);
                notas = s.nextFloat();
                if (notas == 10) {
                    dezCount++;
                    bimestrescomDez += "["+(b+1)+"] ";
                }
                media += notas;
            }
            media /= 4;
            if (media >= 7 && media < 8) {
                alunosBom++;
            } else if (media >= 9 && dezCount >= 2) {
                alunosExemplar++;
                notasExemplar.append(String.format("O aluno %d é um Aluno Exemplar. Ele tirou notas 10 nos bimestres: %s\n", (a+1), bimestrescomDez));
            }
            LimparTela();
        }
        System.out.printf("Quantidade de alunos que obtiveram \"Honras pelo bom aproveitamento\": %d\n", alunosBom);
        System.out.printf("Quantidade de alunos exemplares: %d\n\n", alunosExemplar);
        if (alunosExemplar > 0) {
                System.out.print(notasExemplar+"\n");
        }

        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}
