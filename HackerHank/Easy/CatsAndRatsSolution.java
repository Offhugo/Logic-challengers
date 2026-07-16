package Logic_Problems.HackerHank.Easy;

import java.io.*;
import java.util.*;

public class CatsAndRatsSolution {

    static String catAndMouse(int x, int y, int z) {
        // z eh o rato
        // x é p gato A
        // y eh o gato B
        // Objetivo: Existem 2 gatos que estão em uma reta enumerada(como um array)
        //           Eles estão atrás de um rato que está na mesma linha, os gatos se movem na mesma velocidade
        //           Logo, quem estiver mais próximo chega no rato, mas se eles se baterem ao mesmo tempo o rato escapa.

        // Dando nome aos bois
        int posRato = z;
        int posCatA = x;
        int posCatB = y;

        String finalResult;

        // Cálculo da distância real e definitiva
        int distAbsCatA = Math.abs(posRato - posCatA);
        int distAbsCatB = Math.abs(posRato - posCatB);

        // Condicionais para criar e válidar os resultados
        if (distAbsCatA - distAbsCatB == 0) {
            finalResult = "Mouse C";
        }
        else if (distAbsCatA < distAbsCatB) {
            finalResult = "Cat A";
        }

        else  {
            finalResult = "Cat B";
        }

        return finalResult;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
