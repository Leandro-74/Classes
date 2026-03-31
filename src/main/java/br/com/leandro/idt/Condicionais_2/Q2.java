package br.com.leandro.idt.Condicionais_2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LimparTela();

        System.out.print("Digite sua idade: ");
        int idade = s.nextByte();

        String extenso = "";

        switch (idade) {
            case 1:
                extenso = "Um ano";
                break;
            case 2:
                extenso = "Dois anos";
                break;
            case 3:
                extenso = "Três anos";
                break;
            case 4:
                extenso = "Quatro anos";
                break;
            case 5:
                extenso = "Cinco anos";
                break;
            case 6:
                extenso = "Seis anos";
                break;
            case 7:
                extenso = "Sete anos";
                break;
            case 8:
                extenso = "Oito anos";
                break;
            case 9:
                extenso = "Nove anos";
                break;
            case 10:
                extenso = "Dez anos";
                break;
            case 11:
                extenso = "Onze anos";
                break;
            case 12:
                extenso = "Doze anos";
                break;
            case 13:
                extenso = "Treze anos";
                break;
            case 14:
                extenso = "Quatorze anos";
                break;
            case 15:
                extenso = "Quinze anos";
                break;
            case 16:
                extenso = "Dezesseis anos";
                break;
            case 17:
                extenso = "Dezessete anos";
                break;
            case 18:
                extenso = "Dezoito anos";
                break;
            case 19:
                extenso = "Dezenove anos";
                break;
            case 20:
                extenso = "Vinte anos";
                break;
            case 21:
                extenso = "Vinte e um anos";
                break;
            case 22:
                extenso = "Vinte e dois anos";
                break;
            case 23:
                extenso = "Vinte e três anos";
                break;
            case 24:
                extenso = "Vinte e quatro anos";
                break;
            case 25:
                extenso = "Vinte e cinco anos";
                break;
            case 26:
                extenso = "Vinte e seis anos";
                break;
            case 27:
                extenso = "Vinte e sete anos";
                break;
            case 28:
                extenso = "Vinte e oito anos";
                break;
            case 29:
                extenso = "Vinte e nove anos";
                break;
            case 30:
                extenso = "Trinta anos";
                break;
            case 31:
                extenso = "Trinta e um anos";
                break;
            case 32:
                extenso = "Trinta e dois anos";
                break;
            case 33:
                extenso = "Trinta e três anos";
                break;
            case 34:
                extenso = "Trinta e quatro anos";
                break;
            case 35:
                extenso = "Trinta e cinco anos";
                break;
            case 36:
                extenso = "Trinta e seis anos";
                break;
            case 37:
                extenso = "Trinta e sete anos";
                break;
            case 38:
                extenso = "Trinta e oito anos";
                break;
            case 39:
                extenso = "Trinta e nove anos";
                break;
            case 40:
                extenso = "Quarenta anos";
                break;
            case 41:
                extenso = "Quarenta e um anos";
                break;
            case 42:
                extenso = "Quarenta e dois anos";
                break;
            case 43:
                extenso = "Quarenta e três anos";
                break;
            case 44:
                extenso = "Quarenta e quatro anos";
                break;
            case 45:
                extenso = "Quarenta e cinco anos";
                break;
            case 46:
                extenso = "Quarenta e seis anos";
                break;
            case 47:
                extenso = "Quarenta e sete anos";
                break;
            case 48:
                extenso = "Quarenta e oito anos";
                break;
            case 49:
                extenso = "Quarenta e nove anos";
                break;
            case 50:
                extenso = "Cinquenta anos";
                break;
            case 51:
                extenso = "Cinquenta e um anos";
                break;
            case 52:
                extenso = "Cinquenta e dois anos";
                break;
            case 53:
                extenso = "Cinquenta e três anos";
                break;
            case 54:
                extenso = "Cinquenta e quatro anos";
                break;
            case 55:
                extenso = "Cinquenta e cinco anos";
                break;
            case 56:
                extenso = "Cinquenta e seis anos";
                break;
            case 57:
                extenso = "Cinquenta e sete anos";
                break;
            case 58:
                extenso = "Cinquenta e oito anos";
                break;
            case 59:
                extenso = "Cinquenta e nove anos";
                break;
            case 60:
                extenso = "Sessenta anos";
                break;
            case 61:
                extenso = "Sessenta e um anos";
                break;
            case 62:
                extenso = "Sessenta e dois anos";
                break;
            case 63:
                extenso = "Sessenta e três anos";
                break;
            case 64:
                extenso = "Sessenta e quatro anos";
                break;
            case 65:
                extenso = "Sessenta e cinco anos";
                break;
            case 66:
                extenso = "Sessenta e seis anos";
                break;
            case 67:
                extenso = "Sessenta e sete anos";
                break;
            case 68:
                extenso = "Sessenta e oito anos";
                break;
            case 69:
                extenso = "Sessenta e nove anos";
                break;
            case 70:
                extenso = "Setenta anos";
                break;
            case 71:
                extenso = "Setenta e um anos";
                break;
            case 72:
                extenso = "Setenta e dois anos";
                break;
            case 73:
                extenso = "Setenta e três anos";
                break;
            case 74:
                extenso = "Setenta e quatro anos";
                break;
            case 75:
                extenso = "Setenta e cinco anos";
                break;
            case 76:
                extenso = "Setenta e seis anos";
                break;
            case 77:
                extenso = "Setenta e sete anos";
                break;
            case 78:
                extenso = "Setenta e oito anos";
                break;
            case 79:
                extenso = "Setenta e nove anos";
                break;
            case 80:
                extenso = "Oitenta anos";
                break;
            case 81:
                extenso = "Oitenta e um anos";
                break;
            case 82:
                extenso = "Oitenta e dois anos";
                break;
            case 83:
                extenso = "Oitenta e três anos";
                break;
            case 84:
                extenso = "Oitenta e quatro anos";
                break;
            case 85:
                extenso = "Oitenta e cinco anos";
                break;
            case 86:
                extenso = "Oitenta e seis anos";
                break;
            case 87:
                extenso = "Oitenta e sete anos";
                break;
            case 88:
                extenso = "Oitenta e oito anos";
                break;
            case 89:
                extenso = "Oitenta e nove anos";
                break;
            case 90:
                extenso = "Noventa anos";
                break;
            case 91:
                extenso = "Noventa e um anos";
                break;
            case 92:
                extenso = "Noventa e dois anos";
                break;
            case 93:
                extenso = "Noventa e três anos";
                break;
            case 94:
                extenso = "Noventa e quatro anos";
                break;
            case 95:
                extenso = "Noventa e cinco anos";
                break;
            case 96:
                extenso = "Noventa e seis anos";
                break;
            case 97:
                extenso = "Noventa e sete anos";
                break;
            case 98:
                extenso = "Noventa e oito anos";
                break;
            case 99:
                extenso = "Noventa e nove anos";
                break;
            case 100:
                extenso = "Cem anos";
                break;
        }
        s.nextLine();
        System.out.printf("Sua idade em extenso é: %s\n\n", extenso);
        System.out.print("Pressione ENTER para encerrar...\n\n");
        s.nextLine();
        s.close();
    } public static void LimparTela() {
        System.out.print("\033[H\033[2J");
    }
}