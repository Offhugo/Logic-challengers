package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    // Objetivo: Verificar se para cada criança da lista, ao receberem o número de balas extras, elas empatam
    // ou ficam acima da criança que tinha mais balas ANTES de receber as extra candies
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Lista para retornar o resultado de cada criança
        List<Boolean> docesECriancas = new ArrayList<>();

        // O topo depois de receberem os extras
        int maxCandiesForKid = 0;

        // Loop que descobre quem tem mais doces
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandiesForKid) {
                maxCandiesForKid = candies[i];
            }
        }

        // Loop que retorna o resultado final em boolean
        for (int i = 0; i < candies.length; i++) {
            docesECriancas.add(candies[i] + extraCandies >= maxCandiesForKid);
        }

        return docesECriancas;
    }
}
