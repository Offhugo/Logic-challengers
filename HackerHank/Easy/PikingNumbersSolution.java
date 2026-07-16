package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class PikingNumbersResult {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Objetivo: Encontrar o maior subarray dentro do array original onde a diferença dos
        //           valores não sejam maiores do que 1

        Map<Integer, Integer> mapaFrequencia = new HashMap<>();
        int maximo = 0;

        // Contagem das frequências
        for (int num : a) {
            mapaFrequencia.put(num, mapaFrequencia.getOrDefault(num, 0) + 1);
        }

        // Cálculo do maior grupo
        for (int num : mapaFrequencia.keySet()) {
            int atual = mapaFrequencia.get(num);
            int proximo = mapaFrequencia.getOrDefault(num + 1, 0);

            maximo = Math.max(maximo, atual + proximo);
        }

        return maximo;

    }

}

public class PikingNumbersSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = PikingNumbersResult.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
