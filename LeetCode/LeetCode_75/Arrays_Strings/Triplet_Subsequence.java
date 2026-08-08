package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;



public class Triplet_Subsequence {
    public boolean increasingTriplet(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int secondMaxValue = Integer.MAX_VALUE;

        int i = 0;

        while (i < nums.length) {
            if (nums[i] <= minValue) {
                minValue = nums[i];
            }
            else if (nums[i] <= secondMaxValue) {
                secondMaxValue = nums[i];
            }
            else {
                return true;
            }

            i++;
        }

        return false;
    }
}
