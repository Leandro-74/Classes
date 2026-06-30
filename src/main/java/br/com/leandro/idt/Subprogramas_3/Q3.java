package br.com.leandro.idt.Subprogramas_3;
import java.util.Scanner;

public class Q3 {
    static Scanner s = new Scanner(System.in);
    static int media = 0;
    public static void main(String[] args) {
        limparTela();
        System.out.print("Este programa tem como funcionalidade calcular o tempo necessário para que um determinado material radioativo complete ciclos de meia-vida até pesar menos que 0,5 gramas.");
        System.out.print("\n\nPara tal, foi definido como o tempo para meia-vida 50 segundos, o programa fornecerá:");
        System.out.print("\n\n - O tempo levado para atingir uma massa menor que 0,5 gramas.");
        System.out.print("\n - A massa final após o fim dos ciclos.");
        System.out.print("\n - E ao finalizar o programa, informará o material que mais levou tempo, e o que menos levou tempo.");
        System.out.print("\n - O programa também informará a média de tempo ao ser finalizado.");
        
        System.out.print("\n\nPressione ENTER para iniciar o programa...");
        s.nextLine();

        limparTela();
        int calculados = 0;
        String maiorTempo = "";
        String menorTempo = "";
        String maiorNome = "";
        String menorNome = "";
        while (true) {
            System.out.print("Qual o nome do material?: ");
            String nome = s.nextLine();
            System.out.print("Qual a massa, em gramas, do material?: ");
            float massaInicial = s.nextFloat();
            s.nextLine();
            limparTela();

            if (massaInicial < 0.5) {
                System.out.print("A massa do material já é menor que 0,5 gramas ou apresenta um valor inválido!\n\n");
                continue;
            }
            calculados++;
            String resultado = decaimento(massaInicial, maiorTempo, menorTempo);
            System.out.print(resultado);

            System.out.print("Deseja calcular o decaimento de outro material(S/N)?: ");
            String continuar = s.next();

            if (continuar.equalsIgnoreCase("N")) {
                limparTela();
                break;
            }
            s.nextLine();
            limparTela();
        }
        media /= calculados;
        System.out.printf("A média de tempo levado para os materais informados decaírem é %s.", converterTempo(media));
        s.close();
    }
    public static String decaimento(float massaInicial, String maior, String menor) {
        float massaFinal = massaInicial;
        int segundos = 0;
        while (massaFinal >= 0.5) {
            massaFinal /= 2;
            segundos += 50;
        }

        media += segundos;
        String resultado = String.format("Para um material de %.1f gramas, levará %s para que ele fique com uma massa de %.2f gramas, sendo menor que 0,5 gramas\n\n", massaInicial, converterTempo(segundos), massaFinal);
        return(resultado);
    }
    public static String converterTempo(int segundos) {
        int horas = segundos/3600;
        int minutos = (segundos%3600)/60;
        segundos = (segundos%3600)%60;
        String resultado = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        return(resultado);
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}