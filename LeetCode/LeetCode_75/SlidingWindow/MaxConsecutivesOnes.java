package Logic_Problems.LeetCode.LeetCode_75.SlidingWindow;

public class MaxConsecutivesOnes {
    /*
        Objetivo: achar o maior conjunto de "1s" consecutivos, de modo que K zeros possam ser tranformados em 1
    * */
    public int longestOnes(int[] nums, int k) {
        int size = nums.length;
        int zeros = 0;
        int maxOne = 0;
        int hi = 0;
        int lo = 0;

        while (hi < size) {

            if (nums[hi] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[lo] == 0) {
                    zeros--;
                }
                lo++;
            }

            maxOne = Math.max(maxOne, (hi - lo) + 1);

            hi++;
        }

        return maxOne;
    }
}
