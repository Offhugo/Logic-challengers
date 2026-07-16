package Logic_Problems.HackerHank.Easy;

import java.io.*;

import static java.util.stream.Collectors.joining;

class DayOfProgrammerResult {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    /* Objetivo:
        Dado um ano inteiro de 1700 a 2700, retorne o dia 256 daquele ano
        Considere que até o ano 1917, a russia usava o calendario gregoriano, após iss é o gregoriano
    */

        int diaNum = 0;
        String data = null;

        // Condicional para o ano de 1918
        if (year == 1918) {
            diaNum = 256 - (215 + 15);
        }

        // Condicional para anos entre 1700 e 1917
        if (year >= 1700 && year <= 1917) {

            // É bissexto
            if (year % 4 == 0) {
                diaNum = 256 - 244;
            }
            else { // Não é bissexto
                diaNum = 256 - 243;
            }
        }

        // Condicional para o restante dos anos no range
        if (year >= 1919 && year <= 2700) {
            // É Bissexto
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                diaNum = 256 - 244;
            }
            else { // Não é bissexto
                diaNum = 256 - 243;
            }
        }

        data = (diaNum + ".09." + year);

        return data;
    }

}

public class DayOfProgrammerSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = DayOfProgrammerResult.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}