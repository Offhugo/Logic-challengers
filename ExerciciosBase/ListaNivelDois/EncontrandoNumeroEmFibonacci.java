package Logic_Problems.ExerciciosBase.ListaNivelDois;

public class EncontrandoNumeroEmFibonacci {
    public static int fibonacciSequenc(int qtdVezes, int num) {
        int x = 1;
        int y = 1;
        int f = 0;

        for (int i = 1; i <= qtdVezes; i++) {

            f = x + y;
            x = y;
            y = f;

            if (num == f) {
                System.out.println("O número pertence a sequência.");
                break;
            } else if (f > num) {
                System.out.println("O número não pertence a sequência.");
                break;
            }
        }

        return f;
    }

    public static void main(String[] args) {
        int qtdVezes = 6;
        int num = 5 ;

        System.out.println("Número final: " + fibonacciSequenc(qtdVezes, num));
    }
}
