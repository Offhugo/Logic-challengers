package Logic_Problems.ExerciciosBase.GeeksForGeeks.ExerciciosSimples;

import java.util.Scanner;

public class TabelaDeMultiplicacao {

    public static void multiplicarNumero (int numero) {
        for (int i = 0; i < 11; i++) {
            System.out.println("Tabuada: " + numero + " X " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para receber a tabuada do mesmo: ");
        int num = sc.nextInt();

        TabelaDeMultiplicacao.multiplicarNumero(num);
    }
}
