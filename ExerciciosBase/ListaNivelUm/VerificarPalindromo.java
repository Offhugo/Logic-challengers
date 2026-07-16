package Logic_Problems.ExerciciosBase.ListaNivelUm;

import java.util.Scanner;

public class VerificarPalindromo {
    public static boolean verificandoTermo(String termo) {
        String stringInvertida = new StringBuilder(String.valueOf(termo)).reverse().toString();

        if (stringInvertida.equalsIgnoreCase(termo)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou número para verificar se tal é palindromo");
        String termo = sc.next();

        System.out.println(verificandoTermo(termo));
    }
}
