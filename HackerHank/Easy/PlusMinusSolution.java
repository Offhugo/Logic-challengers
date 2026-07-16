package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // váriaveis que guadam as contagenns
        int contPositivos = 0;
        int contNegativos = 0;
        int contZeros = 0;
        int numRazao = arr.size();

        // loop para realizar as contagens
        for (int valor : arr){

            if (valor > 0) {
                contPositivos++;
            } else if (valor < 0) {
                contNegativos++;
            } else {
                contZeros++;
            }
        }

        // váriaveis que guardam as razões
        double razaoPos = (double) contPositivos / numRazao;
        double razaoNeg = (double) contNegativos / numRazao;
        double razaoZero = (double) contZeros / numRazao;

        System.out.println(razaoPos);
        System.out.println(razaoNeg);
        System.out.println(razaoZero);
    }

}

public class PlusMinusSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        PlusMinusResult.plusMinus(arr);

        bufferedReader.close();
    }
}
