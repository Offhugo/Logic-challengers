package Logic_Problems.GeeksForGeeks.ExerciciosFaceis;

public class Fatorial {
    public static int calcularFatorial(int numFatorial) {
        int cont = numFatorial;

        for (int i = 2; i <= cont; i++) {

            System.out.println(numFatorial += numFatorial * i);
        }

        return numFatorial;
    }

    public static int factorial(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            // calculating the factorial
            System.out.println(ans = ans * i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int numFatorial = 4;

        //System.out.println("Fatorial: " + calcularFatorial(numFatorial));

        System.out.println(factorial(numFatorial));
    }
}
