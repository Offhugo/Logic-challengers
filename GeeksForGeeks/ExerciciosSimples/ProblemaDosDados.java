/* EXPLICAÇÃO:
*   Para cada "lado" jogado do dado, deve ser mostrado o seu lado oposto, que configura da seguinte forma:
*   1-2-3-4-5-6
*   | | | | | |
*   6-5-4-3-2-1
*
*   PERGUNTAS:
*   1- A nível de código, existem até outras maneiras de fazer, mas é mais performatico ou não
*   2- usar ou não usar return
* */
package Logic_Problems.ExerciciosBase.GeeksForGeeks.ExerciciosSimples;

import java.util.Scanner;

public class ProblemaDosDados {
    
    public static int ladoOpostoDoDado(int ladoDoUsuario) {
        int ladoOposto = 0;

        while (true) {
            if (ladoDoUsuario == 6) {
                ladoOposto = 1;

                return ladoOposto;
            } else if (ladoDoUsuario == 5) {
                ladoOposto = 2;

                return ladoOposto;
            } else if (ladoDoUsuario == 4) {
                ladoOposto = 3;

                return ladoOposto;
            } else if (ladoDoUsuario == 3) {
                ladoOposto = 4;

                return ladoOposto;
            } else if (ladoDoUsuario == 2) {
                ladoOposto = 5;

                return ladoOposto;
            } else if (ladoDoUsuario == 1) {
                ladoOposto = 6;

                return ladoOposto;
            } else {
                System.out.println("Digite um valor valido para um dado de 6 lados");

                return 0;
            }
        }
    }

    // Método otimizado
    public static int ladoOpostoDoDadoOtimizado(int ladoDoUsuario) {
        int ladoOpostoDado = 7 - ladoDoUsuario;

        return ladoOpostoDado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorDoLadoDado= 0;

        System.out.println("Olá, informe um lado de um dado para receber o valor do lado oposto: ");
        valorDoLadoDado = sc.nextInt();
        System.out.println("O valor do lado oposto é de: " + ladoOpostoDoDado(valorDoLadoDado));

        System.out.println("Informe novamente por gentileza outro lado do dado: ");
        valorDoLadoDado = sc.nextInt();

        System.out.println("O valor do lado oposto é de: " + ladoOpostoDoDadoOtimizado(valorDoLadoDado));
    }
}
