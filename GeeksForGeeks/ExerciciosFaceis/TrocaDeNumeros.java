package Logic_Problems.GeeksForGeeks.ExerciciosFaceis;

import java.util.Scanner;

public class TrocaDeNumeros {

    public static void trocandoNumeros(int n1, int n2) {
        int numeroUm = n1;
        int numeroDois = n2;

        n2 = numeroUm;
        n1 = numeroDois;

        System.out.println("Primero número = " + n1);
        System.out.println("Segundo número = " + n2);

        System.out.println("Troca realizada com sucesso!");
    }

    // A SER CORRIGIDA

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor realizar uma troca de numeros");
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        trocandoNumeros(n1, n2);
    }
}
