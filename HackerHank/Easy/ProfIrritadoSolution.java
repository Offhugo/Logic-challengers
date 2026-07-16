package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ProfessorIrritadoResult {

    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
        // k = numero minimo de alunos pontuais
        // a = lista dos alunos, onde cada indice contem o "tempo" em que chegaram
        /*
            REGRAS: 1. Independentemente se o aluno estiver ou não na sala, o que importa é o numero de atrasos
                       comparado a K
        */

        // Variável pote que guarda a quantidade de alunos que chegaram no horário
        int countChegadaNoHorario = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= 0) {
                countChegadaNoHorario++;
            }
        }

        if (countChegadaNoHorario < k) {
            return "YES";
        }
        else {
            return "NO";
        }
    }

}

public class ProfIrritadoSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = ProfessorIrritadoResult.angryProfessor(k, a);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
