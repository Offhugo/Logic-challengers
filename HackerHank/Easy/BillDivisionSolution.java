package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BillDivisionResult {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int somaCompartilhada = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) { // Se o índice não for o que Anna não comeu
                somaCompartilhada += bill.get(i);
            }
        }
        int valorJusto = somaCompartilhada / 2;

}

public class BillDivisionSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        BillDivisionResult.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
  }
}