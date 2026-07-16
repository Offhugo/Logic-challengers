/*
*   IDEIA: ir removendo cada ultimo item e jogar para outra variavel
*
* */
package Logic_Problems.ExerciciosBase.ListaNivelUm;

public class InverterNumeroInteiro {
    public static int inversaoNumerica(int num) {
        int numeroInvertido = 0;

        while (num != 0) {
            System.out.println("entrou no loop");
            int digito = num % 10;

            numeroInvertido = numeroInvertido * 10 + digito;

            num /= 10;
        }

        return numeroInvertido;
    }

    public static void main(String[] args) {
        int num = 1234;

        System.out.println(inversaoNumerica(num));
    }
}
