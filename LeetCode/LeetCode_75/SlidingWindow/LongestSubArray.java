package Logic_Problems.LeetCode.LeetCode_75.SlidingWindow;

public class LongestSubArray {
    public int longestSubarray(int[] nums) {
        int zeros = 0;
        int maxLen = 0;
        int lo = 0;
        int hi = 0;

        // loop que percorre todo o array e avança os ponteiros
        while (hi < nums.length) {
            // Condicional para verificar e adicionar 0s
            if (nums[hi] == 0) {
                zeros++;
            }

            // Caso 0s passem do limites
            while (zeros > 1) {
                // Condicional para o lo andar e diminuir os 0s
                if (nums[lo] == 0) {
                    zeros--;
                }
                lo++;
            }

            // Trecho que efetivamente guarda a maior janela
            maxLen = Math.max(maxLen, hi - lo);

            hi++;
        }

        return maxLen;
    }
}
