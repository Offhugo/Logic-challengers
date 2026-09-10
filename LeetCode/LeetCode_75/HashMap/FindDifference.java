package Logic_Problems.LeetCode.LeetCode_75.HashMap;

import java.util.*;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Criando os HashSet para evitar as duplicatas
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Popula os Sets (elimina duplicatas de cada array em O(n))
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        // Elementos que estão em set1 mas NÃO em set2
        for (int num : set1) {
            if (!set2.contains(num)) { // Busca em O(1)
                diff1.add(num);
            }
        }

        // Elementos que estão em set2 mas NÃO em set1
        for (int num : set2) {
            if (!set1.contains(num)) { // Busca em O(1)
                diff2.add(num);
            }
        }

        return Arrays.asList(diff1, diff2);
    }
}
