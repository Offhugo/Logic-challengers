package Logic_Problems.ExerciciosBase.ListaNivelDois;

public class SequenciaFibonacci {
    public static int fibonacciSequenc(int qtdVezes) {
        int x = 1;
        int y = 1;
        int f = 0;

        for (int i = 1; i <= qtdVezes; i++) {
            System.out.println("O que y recebe: " + (y = x + y));
            System.out.println("O que x recebe: " + (x = y + x));
        }

        return x;
    }

    public static void main(String[] args) {
        int qtdVezes = 4;

        System.out.println(fibonacciSequenc(qtdVezes));
    }
}
