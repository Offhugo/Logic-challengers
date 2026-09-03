package Logic_Problems.LeetCode.LeetCode_75.SlidingWindow;

public class MaximumAverage {
    public double findMaxAverage(int[] nums, int k) {
        int somaAtual = 0;

        // Calcula a soma da PRIMEIRA janela "cria" ela
        for (int i = 0; i < k; i++) {
            somaAtual += nums[i];
        }

        // Guarda essa primeira soma como a maior encontrada até agora
        int maxSoma = somaAtual;

        // Desliza a janela do índice 'k' até o final do array
        for (int i = k; i < nums.length; i++) {
            // Adiciona o novo elemento que ENTRA pela direita (nums[i])
            // Subtrai o elemento antigo que SAI pela esquerda (nums[i - k])
            somaAtual = somaAtual + nums[i] - nums[i - k];

            // Se a nova soma for maior, atualizamos o maxSoma
            maxSoma = Math.max(maxSoma, somaAtual);
        }

        // Retorna a maior soma dividida por k em formato decimal (double)
        return (double) maxSoma / k;
    }
}
