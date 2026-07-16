package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CountApplesAndOrangesResult {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s PONTO INICIAL DA CASA
     *  2. INTEGER t PONTO FINAL DA CASA
     *  3. INTEGER a PONTO DA MACIEIRA
     *  4. INTEGER b PONTO DA LARANJEIRA
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    /* PROBLEMA: Saber quantas frutas, laranjas a direita e maçãs a esquerda, cairam na casa
        SOLUÇÃO: A partir da posição da respectiva árvore, somar com a posição da distancia em que a fruta caiu do pé
                 SE o número resultante estiver dentro do range da casa, a fruta respectiva deve ser contabiliza
    * */

        // ONDE: s = ponto inicial da casa
        //       t = ponto final da casa
        //       a = localização da macieira
        //       b = localização da laranjeira


        // Contadores de frutas
        int countApples = 0;
        int countOranges = 0;

        // Laço que determina se a maçã caiu ou não no range da casa, a partir da macieira
        for (int quedasApples : apples) {
            if (a + quedasApples >= s && a + quedasApples <= t) {
                countApples++;
            }
        }

        // Laço que determina se as laranjas cairam no range da casa, a partir da laranjeira
        for (int quedasOranges : oranges) {
            if (b + quedasOranges >= s && b + quedasOranges <= t) {
                countOranges++;
            }
        }

        System.out.println(countApples);
        System.out.println(countOranges);

    }

}

class CountAppleAndOrangesSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        CountApplesAndOrangesResult.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
