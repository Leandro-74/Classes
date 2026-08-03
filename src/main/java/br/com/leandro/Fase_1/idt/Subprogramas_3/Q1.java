package br.com.leandro.idt.Subprogramas_3;
import java.util.Scanner;

public class Q1 {
    static Scanner s = new Scanner(System.in);
    static int paralel = 0;
    static int cubo = 0;
    static int cilindro = 0;
    static int esfera = 0;
    static int cone = 0;
    static int invalidos = 0;
    public static void main(String[] args) {
        double media = 0;
        int contador = 0;

        while (true) {
            limparTela();
            double volume;
            String tipo = "";

            System.out.print("Para as seguintes formas geométricas:\n\n");
            System.out.print("[1] Cubo\n[2] Paralelepípedo\n[3] Cilindro\n[4] Esfera\n[5] Cone");
            System.out.print("\n\nEscolha uma forma para calcular seu volume: ");
            byte forma = s.nextByte();

            if (forma == 1) {
                tipo = "cubo";
                System.out.print("\n\nQual o lado do cubo?: ");
                double l = s.nextDouble();
                volume = calculaCubo(l);
            }
            else if (forma == 2) {
                tipo = "paralelepípedo";
                System.out.print("\n\nQual o comprimento do paralelepípedo?: ");
                double c = s.nextDouble();
                System.out.print("\nQual a largura do paralelepípedo?: ");
                double l = s.nextDouble();
                System.out.print("\nQual a altura do paralelepípedo?: ");
                double a = s.nextDouble();
                volume = calculaParalelepipedo(c, l, a);
            
            } else if (forma == 3) {
                tipo = "cilindro";
                System.out.print("\n\nQual o raio do cilindro?: ");
                double r = s.nextDouble();
                System.out.print("\nQual a altura do cilindro?: ");
                double a = s.nextDouble();
                volume = calculaCilindro(r, a);
            
            } else if (forma == 4) {
                tipo = "esfera";
                System.out.print("\n\nQual o raio da esfera?: ");
                double r = s.nextDouble();
                volume = calculaEsfera(r);
            
            } else if (forma == 5) {
                tipo = "cone";
                System.out.print("\n\nQual o raio da base do cone?: ");
                double r = s.nextDouble();
                System.out.print("\nQual a altura do cone?: ");
                double a = s.nextDouble();
                volume = calculaCone(r, a);
            
            } else {
                limparTela();
                System.out.print("A opção escolhida é inválida, tente novamente!\n\n");
                continue;
            }
            limparTela();

            if (forma == 4) {
                if (volume > 0) {
                    System.out.printf("O volume da %s informada é: %.1f\n\n", tipo, volume);
                } else {
                    System.out.printf("O volume da %s informada é: %.1f (Inválido)\n\n", tipo, volume);
                }
            } else {
                if (volume > 0) {
                    System.out.printf("O volume do %s informado é: %.1f\n\n", tipo, volume);
                } else {
                    System.out.printf("O volume do %s informado é: %.1f (Inválido)\n\n", tipo, volume);
                }
            }

            if (volume > 0) {
                media += volume;
                contador++;
            }
            
            System.out.print("Deseja calcular o volume de outro objeto(S/N)?: ");
            String continuar = s.next();
            
            if (continuar.equalsIgnoreCase("N")) {
                break;
            } 
        }
        if (contador > 0) {
            media /= (double) contador;
        }
        else {
            media = 0;
        }
        
        limparTela();
        System.out.printf("A média do volume dos objetos informados é: %.2f\n\n", media);
        System.out.print("Dos objetos apresentados, são eles:\n\n");
        System.out.printf("%d Cubo(s)\n", cubo);
        System.out.printf("%d Paralelepípedo(s)\n", paralel);
        System.out.printf("%d Cilindro(s)\n", cilindro);
        System.out.printf("%d Esfera(s)\n", esfera);
        System.out.printf("%d Cone(s)\n", cone);
        
        if (invalidos == 0) {
            System.out.print("\nE dos objetos informados, nenhum é inválido!");
        }
        else if (invalidos == 1) {
            System.out.print("\nE dos objetos informados, 1 é inválido!");
        }
        else {
            System.out.printf("\nE dos objetos informados, %d são inválidos", invalidos);
        }
        s.close();
    }
    private static double calculaCubo(double l) {
        if (l <= 0) {
            invalidos++;
            return(0);
        }
        else {
            double volume = l*l*l;
            cubo++;
            return(volume); 
        }
    }
    private static double calculaParalelepipedo(double c, double l, double a) {
        if (c <= 0 || l <= 0 || a <= 0) {
            invalidos++;
            return(0);
        }
        else {
            double volume = c*l*a;
            paralel++;
            return(volume);
        }
    }
    private static double calculaCilindro(double r, double a) {
        if (r <= 0 || a <= 0) {
            invalidos++;
            return(0);
        }
        else {
            double volume = Math.PI*(r*r)*a;
            cilindro++;
            return(volume);
        }
    }
    private static double calculaEsfera(double r) {
        if (r <= 0) {
            invalidos++;
            return(0);
        }
        else {
            double volume = (4.0/3.0)*Math.PI*(r*r*r);
            esfera++;
            return(volume);
        }
    }
    private static double calculaCone(double r, double a) {
        if (r <= 0 || a <= 0) {
            invalidos++;
            return(0);
        }
        else {
            double volume = (1.0/3.0)*Math.PI*(r*r)*a;
            cone++;
            return(volume);
        }
    }
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
    }
}