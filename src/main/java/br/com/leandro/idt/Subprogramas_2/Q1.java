package br.com.leandro.idt.Subprogramas_2;
import java.util.Scanner;

public class Q1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            limparTela();
            double l = 0;
            double a = 0;
            double c = 0;
            double r = 0;
            double volume = 0;
            String tipo = "";

            System.out.print("Para as seguintes formas geométricas:\n\n");
            System.out.print("[1] Cubo\n[2] Paralelepípedo\n[3] Cilindro\n[4] Esfera\n[5] Cone");
            System.out.print("\n\nEscolha uma forma para calcular seu volume: ");
            byte forma = s.nextByte();

            if (forma == 1) {
                tipo = "cubo";
                System.out.print("\n\nQual o lado do cubo?: ");
                l = s.nextDouble();
                volume = calculaCubo(l);
            
            } else if (forma == 2) {
                tipo = "paralelepípedo";
                System.out.print("\n\nQual o comprimento do paralelepípedo?: ");
                c = s.nextDouble();
                System.out.print("\nQual a largura do paralelepípedo?: ");
                l = s.nextDouble();
                System.out.print("\nQual a altura do paralelepípedo?: ");
                a = s.nextDouble();
                volume = calculaParalelepipedo(c, l, a);
            
            } else if (forma == 3) {
                tipo = "cilindro";
                System.out.print("\n\nQual o raio do cilindro?: ");
                r = s.nextDouble();
                System.out.print("\nQual a altura do cilindro?: ");
                a = s.nextDouble();
                volume = calculaCilindro(r, a);
            
            } else if (forma == 4) {
                System.out.print("\n\nQual o raio da esfera?: ");
                r = s.nextDouble();
                volume = calculaEsfera(r);
            
            } else if (forma == 5) {
                tipo = "cone";
                System.out.print("\n\nQual o raio da base do cone?: ");
                r = s.nextDouble();
                System.out.print("\nQual a altura do cone?: ");
                a = s.nextDouble();
                volume = calculaCone(r, a);
            
            } else {
                limparTela();
                System.out.print("A opção escolhida é inválida, tente novamente!\n\n");
                continue;
            }
            limparTela();

            if (forma == 4) {
                System.out.printf("O volume da esfera informada é: %.1f\n\n", volume);
            } else {
                System.out.printf("O volume do %s informado é: %.1f\n\n", tipo, volume);
            }
            
            System.out.print("Deseja calcular o volume de outro objeto(S/N)?: ");
            String continuar = s.next();
            
            if (continuar.equalsIgnoreCase("N")) {
                break;
            } 
        }
        s.close();
    } private static double calculaCubo(double l) {
        double volume = l*l*l;
        return(volume);
    
    } private static double calculaParalelepipedo(double c, double l, double a) {
        double volume = c*l*a;
        return(volume);
    
    } private static double calculaCilindro(double r, double a) {
        double volume = Math.PI*Math.pow(r, 2)*a;
        return(volume);
    
    } private static double calculaEsfera(double r) {
        double volume = (4.0/3.0)*Math.PI*Math.pow(r, 3);
        return(volume);
    
    } private static double calculaCone(double r, double a) {
        double volume = (1.0/3.0)*Math.PI*Math.pow(r, 2)*a;
        return(volume);
    
    } public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}