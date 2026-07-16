package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BetweenTwoSetsResult {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Between two sets: A questão quer saber a contagem de valores que são fatores para as duas listas
        // Logo tenho que fazer um loop que consiga aplicar a regra aos valores
        int count = 0;
        int maiorA = Collections.max(a);
        int menorB = Collections.min(b);

        for (int i = maiorA; i <= menorB; i++) {
            boolean ehValido = true;

            for (int numA : a) {
                if (i % numA != 0) {
                    ehValido = false;
                    break;
                }
            }

            for (int numB : b){
                if (numB % i != 0) {
                    ehValido = false;
                    break;
                }
            }

            if (ehValido) {
                count++;
            }
        }

        return count;
    }
}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = BetweenTwoSetsResult.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
