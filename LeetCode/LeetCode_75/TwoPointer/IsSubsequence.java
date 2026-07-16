package Logic_Problems.LeetCode.LeetCode_75.TwoPointer;

public class IsSubsequence {
    // Objetivo: Saber se em uma sequencia de string, existe uma subsequencia de string contidas nela
    // EX: "abd" x "ActBuhD" == TRUE

    public boolean isSubsequence(String s, String t) {
        // Caso de borda, caso não tenha algo a percorrer
        if (s.length() == 0) return true;

        // Var reservadas para os ponteiros
        int i = 0;
        int j = 0;

        int numEncontros = 0;

        // Loop que percorre ambas as strings, char por char
        while (i < s.length() && j < t.length()) {
            // Condicional que impõe a regra, se baterem, os dois avançam, caso contrário não
            if (s.charAt(i) == t.charAt(j)) {
                numEncontros++;
                i++;
                j++;
            }
            else {
                j++;
            }
        }

        // Condicional para retornar o valor obtido
        if (i == s.length() && numEncontros >= s.length()) {
            return true;
        } else {
           return false;
        }
    }
}
