package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BreakingRecordsResult {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Var respónsaveis por iniciar as pontuações com os scores iniciais
        int pontMax = scores.get(0);
        int pontMin = scores.get(0);

        // Contadores para cada quebra de recorde
        int contMax = 0;
        int contMin = 0;

        // Lista que guarda as vezes totais de recordes quebrados
        List<Integer> recordsMaxEMin = new ArrayList<>();

        // Loop que faz a contagem e verifica se há ou não uma quebra de recorde
        for (int pontuacao : scores) {
            if (pontuacao < pontMin) {
                pontMin = pontuacao;

                contMin += 1;
            }
            else if (pontuacao > pontMax) {
                pontMax = pontuacao;

                contMax += 1;
            }
        }

        recordsMaxEMin.add(contMax);
        recordsMaxEMin.add(contMin);

        return recordsMaxEMin;
    }

}

public class BreakingRecordsSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = BreakingRecordsResult.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}