package Logic_Problems.ExerciciosBase.ListaNivelUm;

public class CalcularMDC {
    public static int calculo(int x, int y) {
        int resto = 1;
        int cont = 0;

        while (y != 0) {
            cont += 1;

            System.out.println("Entrou no cálculo " + cont + " vez");

            resto = x % y;
            x = y;
            y = resto;
        }
        return x;
    }

    public static void main(String[] args) {
        int x = 60;
        int y = 18;

        System.out.println("MDC: " + calculo(x, y));
    }
}
