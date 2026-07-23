package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

public class MergeAlternaly {
    /*
    OBJETIVO: Pegar duas string e criar uma nova a partir dos caracteres das outras string
              A nova string vai receber caracteres de forma ALTERNADA, até ser preenchida por completo
    * */

    public String mergeAlternately(String word1, String word2) {
        // String builder para construir a nova string
        StringBuilder sb = new StringBuilder();

        // Ponteiro incrementer cada letra
        int i = 0;

        // Loop para construir a lógica
        // As condicionais aplicam a regra para cada word
        // se uma delas acabar, tudo bem, a regra do while garante a continuidade, para ambos
        while (i < word1.length() || i < word2.length()) {

            // Primeira condicional
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }

            // Segunda condicional
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }

            // Ponteiro avançando ao final do ciclo
            i++;
        }

        // String definitiva
        return sb.toString();
    }
}
