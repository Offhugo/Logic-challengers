package Logic_Problems.ExerciciosBase.ListaNivelDois;

public class SomaMaximaSubArray {
    public static int somaDoArray(int[] array, int posDeInicio, int posDeParada) {
        int somaTotal = 0;

        for (int i = 0; i <= posDeParada; i++) {
            somaTotal += array[i];
        }

        return somaTotal;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, -5, 8, 2, 6, 14, 4, 6};
        int posDeInicio = 1;
        int posDeParada = 4;

        System.out.println("Soma total: " + somaDoArray(array, posDeInicio, posDeParada));
    }
}
