package Logic_Problems.GeeksForGeeks.ExerciciosFaceis;

public class VerificarNumeroPrimo {
    public static boolean ehPrimo(int n) {
        System.out.println("ta aqui");
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            System.out.println("chegou aqui, verificando: " + (n % i == 0));
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 43;

        System.out.println("Resposta: " + ehPrimo(n));
    }
}
