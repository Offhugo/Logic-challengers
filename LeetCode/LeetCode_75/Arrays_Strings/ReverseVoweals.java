package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

public class ReverseVoweals {
    // Métodos auxiliar que faz a comparação independente do tamanho
    private boolean isVogal(char c) {
        // Aplicação do método que padroniza os tamanhos
        char letra = Character.toLowerCase(c);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    // Método principal
    public String reverseVowels(String s) {
        // Ponteiros para percorrer a palavra e fazer a troca das letras
        int leftPointer = 0;
        int righPointer = s.length() - 1; // O -1 é obrigatório para não estourar o array

        // Palavra quebrada em um array de char
        char[] listWords = s.toCharArray();

        // Loop que funciona até que os ponteiros se cruzem
        while (leftPointer < righPointer) {
            // Se o ponteiro da esquerda não achar uma vogal ele continua
            if (!isVogal(listWords[leftPointer])) {
                leftPointer++;
            }
            // O mesmo vale para o da direita
            else if (!isVogal(listWords[righPointer])) {
                righPointer--;
            }
            // Condicional que aplica devidamente a troca das letras
            else {
                char temp = listWords[leftPointer]; // Var que guarda a letra da esquerda para a direita temporariamente
                listWords[leftPointer] = listWords[righPointer];
                listWords[righPointer] = temp;

                leftPointer++;
                righPointer--;
            }
        }

        return new String(listWords);
    }
}
