package br.com.leandro.idt.While_1;
import java.util.Scanner;

public class Q4 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        limparTela();
        boolean repetir = true;
        boolean primeira = true;

        StringBuilder cursos = new StringBuilder();
        cursos.append("Dados dos cursos informados: ");
        double maiorConcorrencia = 0;
        String maiorNome = "";
        String maiorId = "";

        while (repetir == true) {
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

            int totalCandidatos = cursoMasculino + cursoFeminino;
            double concorrencia = (double) totalCandidatos / cursoVagas;
            double porcentagemFeminino = (double) (cursoFeminino * 100) / totalCandidatos;

            cursos.append(String.format("Dados do curso: %s | %s", cursoId, cursoNome));
            cursos.append(String.format("\nQuantidade de vagas: %d", cursoVagas));
            cursos.append(String.format("\nQuantidade de candidatos: %d (%d Masuculinos e %d Femininos)", totalCandidatos, cursoMasculino, cursoFeminino));
            cursos.append(String.format("\nConcorrência: %.1f candidatos por vaga", concorrencia));
            cursos.append(String.format("\nPorcentagem de candidatos femininos: %.1f%%\n\n", porcentagemFeminino));
            cursos.append("=============================================\n");
            
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
        cursos.append(String.format("\n\nCurso com maior concorrência:  %s | %s", maiorId, maiorNome));
        limparTela();
        System.out.print(cursos);
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}