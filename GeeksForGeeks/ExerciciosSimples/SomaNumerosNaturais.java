/*
    O código em questão, faz uma somatoria de valores baseado no valor passado pelo usúario
* */
package Logic_Problems.ExerciciosBase.GeeksForGeeks.ExerciciosSimples;

import java.util.Scanner;

public class SomaNumerosNaturais {

    public static int somandoValores(int valorEsperado) {
        int soma = 0;

        for (int i = 1; i <= valorEsperado; i++) {
            soma = soma + i;
            System.out.println(soma);
        }

        return soma;
    }

    public static int somandoValoresOtimizado (int n) {

        return n * (n + 1) / 2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor a ser somado: ");
        int valorEsperado = sc.nextInt();

        System.out.println("O resultado é: " + somandoValores(valorEsperado));

        System.out.println("-------------------------------------");
        System.out.println("Agora, outro valor por gentileza: ");
        int n = sc.nextInt();

        System.out.println("O resultado é: " + somandoValoresOtimizado(n));
    }
}
