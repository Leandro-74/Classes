package br.com.leandro.idt.lista1_repeticao;
import java.util.Scanner;

public class Q10 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();
        byte comercioCandidatos = 0;
        byte gerenciaCandidatos = 0;
        byte operacionalCandidatos = 0;

        for (int a = 0; a < 5; a++) {
            LimparTela();
            System.out.print("[1] Na cidade\n[2] Fora da cidade");
            System.out.print("\n\nOnde você reside?: ");
            byte residencia = s.nextByte();
            LimparTela();
            int residencia_tempo = 0;
            String comercio = "";
            String operacional = "";
            String gerencia = "";
            byte escolaridade = 0;
            byte experiencia = 0;
            if (residencia == 1) {
                System.out.print("Há quantos meses?: ");
                residencia_tempo = s.nextInt();
                LimparTela();
            } 
            System.out.print("[1] Fundamental Incompleto\n[2] Fundamental Completo\n[3] Segundo Grau Incompleto\n[4] Segundo Grau Completo\n[5] Curso Superior");
            System.out.print("\n\nQual sua escolaridade?: ");
            escolaridade = s.nextByte();
            LimparTela();
            System.out.print("[1] Experiência Comprovada\n[2] Sem experiência");
            System.out.print("\n\nVocê possui experiência?: ");
            experiencia = s.nextByte();
            LimparTela();
            if (escolaridade >= 4) {
                operacional = "[Apto]";
                operacionalCandidatos++;
                if (experiencia == 1) {
                    if (residencia_tempo >= 12) {
                        comercio = "[Apto]";
                        comercioCandidatos++;
                    } else {
                        comercio = "[Inapto] - Não reside na cidade por pelo menos 1 ano";
                    }
                    if (escolaridade == 5) {
                        gerencia = "[Apto]";
                        gerenciaCandidatos++;
                    } else {
                        gerencia = "[Inapto] - Não possui curso superior.";
                    }
                } else {
                    comercio = "[Inapto] - Não possui experiência";
                    gerencia = "[Inapto] - Não possui experiência";
                }
            } else {
                operacional = "[Inapto] - Não possui segundo grau completo";
                comercio = "[Inapto] - Não possui segundo grau completo";
                gerencia = "[Inapto] - Não possui curso superior";
            }
            s.nextLine();
            LimparTela();
            System.out.printf("O resultado de sua avaliação foi:\n\nIndústria - Operacional: %s\nIndústria - Gerência: %s\nComércio: %s", operacional, gerencia, comercio);
            System.out.print("\n\nPressione ENTER para avaliar o próximo candidato...");
            s.nextLine();
        }
        int gerenciaInaptos = ((30 - gerenciaCandidatos)*100)/30;
        int comercioInaptos = ((30 - comercioCandidatos)*100)/30;
        int operacionalInaptos = ((30 - operacionalCandidatos)*100)/30;
        LimparTela();

        System.out.print("O resultado final da avaliação de candidatos foi: \n\n");
        System.out.printf("Candidatos inaptos para Comércio:                 %d%%\n", comercioInaptos);
        System.out.printf("Candidatos inaptos para Indústria - Operacional:  %d%%\n", operacionalInaptos);
        System.out.printf("Candidatos inaptos para Indústria - Gerência:     %d%%", gerenciaInaptos);

        System.out.printf("\n\nCandidatos aptos para Comércio: %d", comercioCandidatos);
        System.out.printf("\nCandidatos aptos para Indústria - Operacional: %d", operacionalCandidatos);
        System.out.printf("\nCandidatos aptos para Indústria - Gerência: %d", gerenciaCandidatos);

        s.close();
     } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
     }
}