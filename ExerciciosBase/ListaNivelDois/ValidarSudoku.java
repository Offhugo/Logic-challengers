package Logic_Problems.ExerciciosBase.ListaNivelDois;

import java.util.*;

public class ValidarSudoku {
    public static void main(String[] args) {

        Set<Integer> numerosSudoku = new HashSet<>();

        // Cria e determina os valores da matriz
        int[][] matriz = {
                {2, 4, 5},
                {1, 2, 9},
                {6, 7, 8}
        };


        // Percorre a matriz
        for (int i = 0; i < matriz.length; i++) {// percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas
                System.out.println(matriz[i][j] + " ");
                int valor = matriz[i][j];

                if (!numerosSudoku.add(valor)) {
                    System.out.println("Números repetidos!!");
                }
            }
        }
    }
}
