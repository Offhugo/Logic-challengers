package Logic_Problems.LeetCode.LeetCode_75.PrefixSum;

public class FindPivotIndex {
    /*  OBJETIVO:
        Tenho que descobrir qual o indice pivo, para ele receber esse nome ele tem que estar no "meio" e a soma de tudo
        do lado esquerdo é igual a soma de tudo do lado direito
    * */
    public int pivotIndex(int[] nums) {
        int total = 0;
        int i = 0;
        int leftPointer = 0;

        for (int num : nums) {
            total += num;
        }

        while (i < nums.length) {

            if (leftPointer == total - leftPointer - nums[i]) {
                return i;
            }
            leftPointer += nums[i];
            i++;
        }

        return -1;
    }
}
