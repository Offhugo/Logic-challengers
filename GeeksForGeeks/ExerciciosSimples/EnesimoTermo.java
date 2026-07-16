package Logic_Problems.ExerciciosBase.GeeksForGeeks.ExerciciosSimples;

public class EnesimoTermo {
    public static int enesimoTermo(int a1, int a2, int n) {
        int razao = a2 - a1;

        for (int i = 1; i < n; i++) {
            a1 += razao;
        }

        return a1;
    }

    public static void main(String[] args) {

        int a1 = 1;
        int a2 = 3;
        int n = 10;

        System.out.println("Termo da sequência: " + enesimoTermo(a1, a2, n));
    }
}
