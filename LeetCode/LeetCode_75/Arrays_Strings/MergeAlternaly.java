package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

public class MergeAlternaly {
    /*
    OBJETIVO: Pegar duas string e criar uma nova a partir dos caracteres das outras string
              A nova string vai receber caracteres de forma alternada, até ser preenchida por completo
    * */

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }

            i++;
        }

        return sb.toString();
    }
}
