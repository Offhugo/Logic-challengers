package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

public class ReverseWords {
    // Objetivo: Reverter uma string, mas não ela inteira char por char, e sim palavra por palavra
    // sendo assim eu devo padronizar os espaços entre elas em somente um e não deixar nenhum espaço
    // no inicio e no final
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            resultado.append(words[i]);

            if (i > 0) {
                resultado.append(" ");
            }
        }


        return resultado.toString();
    }
}
