package Logic_Problems.ExerciciosBase.ListaNivelDois;

public class VerificarOrdenacaoArray {
    public static boolean verificarOrdenacao(int array[]) {
        for (int i = 1; i < array.length ; i++) {
            int indice = array[i];
            int indiceAnterior = array[i - 1];

            if (indice < indiceAnterior) {
                System.out.println("não esta ordenado");
                return false;
            }
        }

        System.out.println("está ordenado");
        return true;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println(verificarOrdenacao(array));
    }
}
