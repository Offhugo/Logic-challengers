package Logic_Problems.ExerciciosBase.GeeksForGeeks.ExerciciosSimples;

import java.util.Scanner;

public class SomaDosQuadrados {
    public static double somandoQuadrados(double valor) {
        double somaDosValores = 0;
        double somaReal = 0;

        for (int i = 1; i <= valor; i++) {
            System.out.println("somatoria: " + (somaDosValores = Math.pow(i, 2))) ;
            somaReal = somaReal + somaDosValores;
        }

        return somaReal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor a ser calculado a soma dos seus quadrados: ");
        double valor = sc.nextDouble();

        System.out.println("A soma dos quadrados é de: " + somandoQuadrados(valor));
    }
}
