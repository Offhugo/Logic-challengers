package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class AvaliacaoAlunosResult {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Outra maneira
        // Sendo N cada valor da lista, vamos pegar  N % 5 = X
        // X que vai ser comparado com 5
        // Sem a necessidade de calcular os valores

        // Lista para guardar novos valores
        List<Integer> gradeAtualizada = new ArrayList<>();

        // Loop que realiza a lógica para preencher a nova grade
        for (int i = 0; i < grades.size(); i++) {
            int notaAtual = grades.get(i);

            if (notaAtual < 38) {
                gradeAtualizada.add(notaAtual);
            }
            else {
                // Busca aplicar um padrão para que possamos calcular indepentende do número
                int restoValor = notaAtual % 5;

                // Calcula a distância para o próximo multiplo de 5 com base no resto
                int distanciaEntreValor = 5 - restoValor;

                if (distanciaEntreValor < 3) {
                    gradeAtualizada.add(notaAtual + distanciaEntreValor);

                } else if (distanciaEntreValor >= 3) {
                    gradeAtualizada.add(notaAtual);
                }
            }
        }

        return gradeAtualizada;
    }

}

public class AvaliacaoAlunosSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = AvaliacaoAlunosResult.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
