package Logic_Problems.ExerciciosBase.GeeksForGeeks.ExerciciosSimples;

import java.util.Arrays;

public class VerificandoAnagrama {

    public static boolean verificarAnagrama(String palavraUm, String palavraDois) {
        if (palavraUm == null || palavraDois == null) {
            return false;
        }

        palavraUm = palavraUm.replaceAll("\\s+", "").toLowerCase();
        palavraDois = palavraDois.replaceAll("\\s+", "").toLowerCase();

        if (palavraUm.length() != palavraDois.length()) {
            return false;
        }

        char[] palavraUmChar = palavraUm.toCharArray();
        char[] palavraDoisChar = palavraDois.toCharArray();

        Arrays.sort(palavraUmChar);
        Arrays.sort(palavraDoisChar);

        if (Arrays.equals(palavraUmChar, palavraDoisChar)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String nomeUm = "Victor";
        String nomeDois = "Yasmin";
        String nomeTres = "rotciv";

        System.out.println(verificarAnagrama(nomeUm, nomeTres));
    }
}
