package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

/* OBJETIVO: Criar um novo array com o produto do lado esquerdo do indice X o produto do lado direito do indice
             multiplicando um a um(lado esquerdo x lado direito) pois o novo array vai ter o mesmo tamanho que o antigo
* */
public class Product_Array_Excepted_Serf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // 1. Passada da esquerda para a direita
        // Colocamos o produto de tudo que vem ANTES do elemento i
        answer[0] = 1; // Não tem nada à esquerda do primeiro elemento
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // 2. Passada da direita para a esquerda
        // Multiplicamos pelo produto de tudo que vem DEPOIS do elemento i
        int produtoDireita = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * produtoDireita;
            produtoDireita *= nums[i]; // Atualiza o acumulado da direita
        }

        return answer;
    }
}
