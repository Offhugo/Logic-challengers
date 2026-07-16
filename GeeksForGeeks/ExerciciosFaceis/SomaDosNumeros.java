package Logic_Problems.GeeksForGeeks.ExerciciosFaceis;

public class SomaDosNumeros {
    public static int somandoDigitos(int n) {
        int soma = 0;

        while (n != 0) {
            // Adiciona o ultimo valor
            int ultimo = n % 10;

            soma += ultimo;

            // Remove o ultimo valor
            n /= 10;
        }

        return soma;
    }

    public static void main(String[] args) {
        int n = 687;

        System.out.println("A soma é de: " + somandoDigitos(n));
    }
}
