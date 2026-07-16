package Logic_Problems.ExerciciosBase.GeeksForGeeks.ExerciciosSimples;

import java.util.Scanner;

public class NumeroParOuImpar {

    public static void verificacaoParOuImpar (int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar se o mesmo é par ou impar: ");
        int num = sc.nextInt();

        NumeroParOuImpar.verificacaoParOuImpar(num);
    }
}
