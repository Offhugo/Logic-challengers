package Logic_Problems.HackerHank.Easy;

import java.io.*;

import static java.util.stream.Collectors.joining;

class TimeConvertionResult {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Converter o hórario de 12horas para o de 24horas
        // A ideia aqui é conseguir pegar os pedaços da string que tá vindo
        // pegando esses pedaços, eu vou transformar o hórario somando 12

        // Outra parte do processo é o de tranformar em numero, fazer o calculo e retornar para String

        // Váriaveis para trabalhar com os dados necessarios
        String turno = s.substring(8, 10);
        String minutagem = s.substring(2, 8);
        String hora = s.substring(0, 2);
        Integer horaNumerada = Integer.parseInt(hora);
        String novoHorario = "";

        if (turno.equalsIgnoreCase("AM")) {
            if (horaNumerada == 12) {
                novoHorario = "00" + minutagem;
            }
            else {
                novoHorario = hora + minutagem;
            }
        }
        else if (turno.equalsIgnoreCase("PM")) {
            if (horaNumerada == 12) {
                novoHorario = "12" + minutagem;
            }
            else {
                int novaHora = horaNumerada + 12;
                novoHorario = novaHora + minutagem;
            }
        }

        return novoHorario;
    }

}

public class TimeConvertionSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConvertionResult.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
