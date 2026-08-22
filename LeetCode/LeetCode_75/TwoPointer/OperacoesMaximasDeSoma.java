package Logic_Problems.LeetCode.LeetCode_75.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperacoesMaximasDeSoma {
    /*
        Objetivo:
    * */
    public int maxOperations(int[] nums, int k) {
        // Var dos ponteiros e o contador
        int left = 0;
        int right = nums.length - 1;
        int operation = 0;

        int somaPonteiros = 0;

        Arrays.sort(nums);

        // Loop que faz todo o processo
        while (left < right) {
            // Atualiza a somaPonteiros a cada rodada
            somaPonteiros = nums[left] + nums[right];

            // Condicionais que aplicam as regra do exercicios
            if (somaPonteiros == k) {
                operation++;
                left++;
                right--;
            }
            else if (somaPonteiros < k) {
                left++;
            }
            else {
                right--;
            }
        }

        return operation;
    }
}
