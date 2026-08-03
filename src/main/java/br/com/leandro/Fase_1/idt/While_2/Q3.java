package br.com.leandro.idt.While_2;
import java.util.Scanner;

public class Q3 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        boolean primeira = true;

        StringBuilder cursos = new StringBuilder();
        cursos.append("Dados dos cursos informados: \n");
        double maiorConcorrencia = 0;
        String maiorNome = "";
        String maiorId = "";
        StringBuilder maioresIndices = new StringBuilder();
        maioresIndices.append("\n\nOs cursos com índices de concorrência maior que 2,5 candidatos por vaga são:\n");
        int total = 0;
        int totalFemininas = 0;


        while (true) {
            System.out.print("Qual o código do curso (ou digite X para encerrar)?: ");
            String cursoId = s.nextLine();
            limparTela();
            if (cursoId.equalsIgnoreCase("X")) {
                break;
            }

            System.out.print("Qual o nome do curso a ser cadastrado?: ");
            String cursoNome = s.nextLine();
            limparTela();

            System.out.print("Qual a quantidade de vagas para o curso?: ");
            int cursoVagas = s.nextInt();
            limparTela();

            System.out.print("Qual a quantidade de candidatos do sexo masculino?: ");
            int cursoMasculino = s.nextInt();
            limparTela();

            System.out.print("Qual a quantidade de candidatos do sexo feminino?: ");
            int cursoFeminino = s.nextInt();
            limparTela();

            int candidatos = cursoMasculino + cursoFeminino;
            total += candidatos;
            totalFemininas += cursoFeminino;
            double concorrencia = (double) candidatos / cursoVagas;
            double porcentagemFeminino = (double) (cursoFeminino * 100) / candidatos;

            if (concorrencia >= 2.5) {
                maioresIndices.append(String.format("\n%s | %s | concorrência igual a: %.1f", cursoId, cursoNome, concorrencia));
            }

            cursos.append(String.format("\nDados do curso: %s | %s", cursoId, cursoNome));
            cursos.append(String.format("\nQuantidade de vagas: %d", cursoVagas));
            cursos.append(String.format("\nQuantidade de candidatos: %d (%d Masuculinos e %d Femininos)", candidatos, cursoMasculino, cursoFeminino));
            cursos.append(String.format("\nConcorrência: %.1f candidatos por vaga", concorrencia));
            cursos.append(String.format("\nPorcentagem de candidatos femininos: %.1f%%\n\n", porcentagemFeminino));
            cursos.append("=============================================");
            
            if (primeira == true) {
                maiorConcorrencia = concorrencia;
                maiorNome = cursoNome;
                maiorId = cursoId;
                primeira = false;
            } else {
                if (maiorConcorrencia < concorrencia) {
                    maiorConcorrencia = concorrencia;
                    maiorNome = cursoNome;
                    maiorId = cursoId;
                }
            }
            s.nextLine();
        }
        double partFem = (double) (totalFemininas*100) / total;

        System.out.printf("\n\nCurso com maior concorrência:  %s | %s", maiorId, maiorNome);
        System.out.print(maioresIndices);
        System.out.printf("\n\nA participação feminina geral é de: %.2f%%\n\n", partFem);
        limparTela();
        System.out.print(cursos);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}