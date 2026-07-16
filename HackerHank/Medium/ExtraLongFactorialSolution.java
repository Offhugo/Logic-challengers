package Logic_Problems.HackerHank.Medium;

import java.io.*;
import java.math.BigInteger;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.reducing;

class ExtraLongFactorialResult {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        BigInteger bigFactorial = BigInteger.ONE;

        for (int i = n; i > 0; i--) {
            bigFactorial = bigFactorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(bigFactorial);
    }

}

public class ExtraLongFactorialSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        ExtraLongFactorialResult.extraLongFactorials(n);

        bufferedReader.close();
    }
}
