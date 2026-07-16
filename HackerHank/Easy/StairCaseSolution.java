package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.Arrays;

import static java.util.stream.Collectors.joining;

class StairCaseResult {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // 1. imagina um array
        // 2. ele é preencchido por n #; EX: n = 3; ###
        // 3. se a gente exibir ele n vezes
        // 4. e se ele for todo preenchido por espaços em branco e ele for preenchido na ordem inversa por #

        // array correspondente as linhas que serão exibidas
        char[] linha = new char[n];

        Arrays.fill(linha, ' ');

        // váriavel que vai representar o ultimo indice da linha, vulgo array
        int indiceParaTrocar = n - 1;

        // Loop que faz o preenchimento inverso na linha
        for (int i = 0; i < n; i++) {

            // aqui o valor da váriavel de fora do loop entra para indicar o ultimo indice corretamente
            linha[indiceParaTrocar] = '#';

            System.out.println(String.valueOf(linha));

            // aqui a várivel que indica o ultimo indice é subtraida
            // isso faz com que os # sejam continuamente preenchidos na ordem inversa, da direita para a esquerda
            indiceParaTrocar--;
        }
    }

}

public class StairCaseSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        StairCaseResult.staircase(n);

        bufferedReader.close();
    }
}
