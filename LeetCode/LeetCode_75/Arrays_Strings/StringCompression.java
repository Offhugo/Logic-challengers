package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

public class StringCompression {
    public int compress(char[] chars) {
        // Ponteiros usados, i para percorrer e write para sobreescrever
        int i = 0;
        int write = 0;

        // Loop que percorre o array e aplica as regras
        while (i < chars.length) {
            // Var para olhar exatamente qual o valor do indice
            char charAtual = chars[i];
            // Ponteiro que conta quantos valores sequenciais temos repetidos
            int j = i;

            // Loop que devidamente faz a contagem da repetição
            while (j < chars.length && chars[j] == charAtual) {
                j++;
            }

            // Escreve o caractere do grupo na posição do "lápis"
            chars[write] = charAtual;
            write++;

            // Var que guarda o valor da repetição
            int count = j - i;

            // Convertemos o número (ex: 12) para uma sequência de caracteres (ex: '1', '2')
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }

            i = j;
        }

        return write;
    }
}
