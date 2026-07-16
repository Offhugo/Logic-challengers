package Logic_Problems.LeetCode.LeetCode_75.TwoPointer;

import java.util.Arrays;

public class MoveZeroes {
    // Objetivo: Em um Array númerico, Devemos mover todos os 0 para o final do mesmo


    public void moveZeroes(int[] nums) {
        // Ponteiro auxiliar que sobreescreve e desloca os números desejados
        int j = 0;

        // Loop que aplica a regra sobre todo o array
        for (int i = 0; i < nums.length; i++) {
            // Move os indices com valores para o inicio
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Preencher o aray com 0, baseado no valor de indices que não foram movidos para o ínicio
        // que logo são 0
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
