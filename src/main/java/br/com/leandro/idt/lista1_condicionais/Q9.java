package br.com.leandro.idt.lista1_condicionais;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        LimparTela();

        System.out.print("Informe o primeiro valor: "); 
        int v1 = s.nextInt(); 
        LimparTela();
        System.out.print("Informe o segundo valor: "); 
        int v2 = s.nextInt(); 
        LimparTela();
        System.out.print("Informe o terceiro valor: "); 
        int v3 = s.nextInt(); 
        LimparTela();
        System.out.print("Informe o quarto valor: "); 
        int v4 = s.nextInt(); 
        LimparTela();
        System.out.print("Informe o quinto valor: "); 
        int v5 = s.nextInt(); 
        LimparTela();

        int media = (v1+v2+v3+v4+v5) / 5;
        StringBuilder todos = new StringBuilder();
        StringBuilder res = new StringBuilder();
        todos.append(String.format("[%d] [%d] [%d] [%d] [%d]", v1, v2, v3, v4, v5));
        
        if (v1 > media) {
            res.append(String.format("[%d] ", v1));
        }
        if (v2 > media) {
            res.append(String.format("[%d] ", v2));
        }
        if (v3 > media) {
            res.append(String.format("[%d] ", v3));
        }
        if (v4 > media) {
            res.append(String.format("[%d] ", v4));
        }
        if (v5 > media) {
            res.append(String.format("[%d] ", v5));
        }

        System.out.printf("A media foi de: %d\n\nOs valores indicados foram: %s\n\nOs valores acima da média são: %s\n\n", media, todos, res);
        s.close();

    } public static void LimparTela() {System.out.print("\033[H\033[2J");}
}
