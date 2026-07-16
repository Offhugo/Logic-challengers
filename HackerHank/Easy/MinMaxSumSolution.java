package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

class MinMaxSumResult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Se a gente tirar o minimo para fazer a conta máxima
        // E tirar o maior para fazer a conta mínima

        long somaMinima = 0;
        long somaMaxima = 0;
        long somaTotal = 0;
        long menorValor = (long) arr.get(0);
        long maiorValor = (long) arr.get(0);


        for (int i = 1; i < arr.size(); i++) {
            long valorPercorrido = (long) arr.get(i);

            if (valorPercorrido > maiorValor) {
                maiorValor = valorPercorrido;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            long valorPercorrido = (long) arr.get(i);

            if (valorPercorrido < menorValor) {
                menorValor = valorPercorrido;
            }
        }

        somaTotal = arr.stream()
                .mapToLong(Integer::longValue)
                .sum();

        somaMinima = somaTotal - maiorValor;
        somaMaxima = somaTotal - menorValor;

        System.out.println(somaMinima + " " + somaMaxima);
    }

}

public class MinMaxSumSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        MinMaxSumResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}
