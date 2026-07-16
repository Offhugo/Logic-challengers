package Logic_Problems.ExerciciosBase.ListaNivelDois;

public class RotacionarElementos {
    public static void trocarElementoArray(int[] array,int posUm, int posDois) {
        int conteudoPosDois = array[posDois];
        int conteudoPosUm = array[posUm];

        array[posUm] = conteudoPosDois;
        array[posDois] = conteudoPosUm;


        for (int valores : array) {
            System.out.println("Valores: " + valores);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 8, 9, 10};
        int posUm = 2;
        int posDois = 5;

        trocarElementoArray(array, posUm, posDois);
    }
}
