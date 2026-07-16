package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BirthDayCandlesResult {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Váriaveis que guardam os valores para executar o algoritmo
        int maiorValor = 0;
        int contadorDeMaiorVela = 0;

        // Loop que percorre a lista e seleciona as maiores velas
        for (int valor : candles) {
            // Primeiro if para achar as velas e reiniciar o contados
            if (valor > maiorValor) {
                maiorValor = valor;
                contadorDeMaiorVela = 1;
            }
            // Segundo if para aumentar o contadorDeMaiorVela
            else if (valor == maiorValor) {
                contadorDeMaiorVela++;
            }
        }

        return contadorDeMaiorVela;
    }

}

public class BirthDayCandlesSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = BirthDayCandlesResult.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
