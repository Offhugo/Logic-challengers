package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> docesECriancas = new ArrayList<>();

        int maxCandiesForKid = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandiesForKid) {
                maxCandiesForKid = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            docesECriancas.add(candies[i] + extraCandies >= maxCandiesForKid);
        }

        return docesECriancas;
    }
}
