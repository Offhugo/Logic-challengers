package Logic_Problems.ExerciciosBase.LeetCode.Medium;

public class SomaremDoisNumeros {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /*
          OBJETIVO: Somar os valores de duas listas encadeadas, onde cada nó representa um
          dígito do número de forma invertida (das unidades para as maiores casas).
          É preciso calcular a soma considerando o "vai um" (carry) quando o valor passar de 9,
          e retornar o resultado em uma nova lista encadeada, nó por nó.
       *
       * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 1. Criação do nó sentinela para servir de âncora inicial
        ListNode dummyHead = new ListNode(0);
        ListNode atual = dummyHead; // Ponteiro que vai avançar construindo a resposta

        int carry = 0; // Variável para guardar o "vai um"

        // 2. O laço continua enquanto houver elementos em l1, l2 ou sobrar um carry
        while (l1 != null || l2 != null || carry != 0) {

            // A soma da rodada sempre começa com o que sobrou da iteração anterior
            int soma = carry;

            // Se l1 ainda tiver números, adicionamos à soma e avançamos o ponteiro
            if (l1 != null) {
                soma += l1.val;
                l1 = l1.next;
            }

            // Se l2 ainda tiver números, adicionamos à soma e avançamos o ponteiro
            if (l2 != null) {
                soma += l2.val;
                l2 = l2.next;
            }

            // 3. Matemática da quebra do número
            carry = soma / 10;          // Extrai a dezena (vai ser 0 ou 1)
            int digito = soma % 10;     // Extrai a unidade (o que vai ficar no nó)

            // 4. Cria o novo nó com o dígito calculado e conecta na lista de resposta
            atual.next = new ListNode(digito);

            // 5. Move o ponteiro 'atual' para o novo nó recém-criado
            atual = atual.next;
        }

        // 6. Retorna a lista ignorando o nó falso de valor 0 que criamos no início
        return dummyHead.next;
    }

    public static void main(String[] args) {


    }
}
