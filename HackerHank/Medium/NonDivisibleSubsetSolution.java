package Logic_Problems.HackerHank.Medium;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class NonDivisibleSubsetResult {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // DECOMPOSIÇÃO:
        int[] counts = new int[k];
        int count = 0;

        for (int elementos : s) {
            int resto = elementos % k;
            counts[resto]++;
        }

        if (counts[0] > 0) {
            count++;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) {
                if (counts[i] > 0) count++;
            }
            else {
                count += Math.max(counts[i], counts[k - i]);
            }
        }

        return count;
    }


}

public class NonDivisibleSubsetSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = NonDivisibleSubsetResult.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
