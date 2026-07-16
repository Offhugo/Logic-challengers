/*
*   Fazer com que se encontre o numero mais proximo de N e divisivel por M, ou seja:
*   N = 13 | M = 4
*   logo:
*       13 ++ % 4 == 0 ou não
*       13 -- % 4 == 0 ou não
* */
package Logic_Problems.ExerciciosBase.GeeksForGeeks.ExerciciosSimples;

import java.util.Scanner;

// CORRIGIR
public class ProximoDivisivelPorNumEPorM {

    public static int encontrandoNumeroDivisivel(int num, int divisor) {
        int cont = 0;

        for (int i = 0; i < 3; i++) {

            int numAscendente = num;
            int numDescendente = num;

            if (numAscendente % divisor == 0) {
                numAscendente = numAscendente + 1;

                int numeroProximo = numAscendente;

                cont = 1;
                return numeroProximo;
            }
            else if (numDescendente % divisor == 0) {
                numDescendente = numDescendente - 1;

                int numeroProximo = numDescendente;

                cont = 1;
                return numeroProximo;
            }

            System.out.println("rodando...");

        }

        return 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número a ser encontrado o divisível mais próximo: ");
        int num = sc.nextInt();

        System.out.println("Digite o número a ser o fator de divisão: ");
        int divisor = sc.nextInt();

        System.out.println("O numero é " + encontrandoNumeroDivisivel(num, divisor));
    }
}
