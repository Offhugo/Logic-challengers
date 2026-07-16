package Logic_Problems.HackerHank.Easy;

import java.io.*;

import static java.util.stream.Collectors.joining;

class KangarooResult {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */


    // OBJETIVO: Conseguir dizer se dois canguros, que começar em posições diferentes
    //           e em velocidades diferentes irão conseguir saltar no mesmo ponto UMA UNICA VEZ

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // x1 = posição do canguro 1
        // x2 posição do canguro 2
        // v1 = velocidade do canguro 1
        // v2 = velocidade do canguro 2

        // Eliminando caso impossível
        if (v1 <= v2) {
            return "NO";
        }

        while (x1 < x2) {
            x1 += v1;
            x2 += v2;

            if (x1 == x2) {
                return "YES";
            }
        }

        return "NO";
    }

}

public class KangarooSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = KangarooResult.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
