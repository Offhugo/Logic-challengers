package Logic_Problems.LeetCode.LeetCode_75.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] resolucaoTwoSum(int target, int[] nums) {
            Map<Integer, Integer> hashMap = new HashMap<>();
            int complemento = 0;

            for (int i = 0; i < nums.length; i++) {
                complemento = target - nums[i];

                if (hashMap.containsKey(complemento)) {
                    return new int[]{ hashMap.get(complemento), i };
                };

                hashMap.put(nums[i], i);
            }
            return new int[]{};
        }
}
