package Logic_Problems.HackerHank.Medium;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class QuadradoMagicoResult {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> s) {
        // Armazenamento de todos os quadrados mágicos
        int[][][] todosMagicos = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
        };

        // custo mínimo válido para a o quadrado mágico
        int custoMinimo = Integer.MAX_VALUE;

        // iteração que passa por todos os quadrados
        for (int[][] magico : todosMagicos) {
            // custo deste quadrado em espécifico
            int custoDesteQuadrado = 0;

            // iteração que passa por cada valor de cada quadrado e calcula o custo do valor
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    // Calculo do valor propriamente dito
                    custoDesteQuadrado += Math.abs(s.get(i).get(j) - magico[i][j]);
                }
            }

            // Condicional encarregada de salvar o quadrado com o menor custo, caso ele seja menor que o anterior
            if (custoDesteQuadrado < custoMinimo) {
                custoMinimo = custoDesteQuadrado;
            }
        }

        return custoMinimo;
    }

}

public class QuadradoMagicoSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = QuadradoMagicoResult.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 