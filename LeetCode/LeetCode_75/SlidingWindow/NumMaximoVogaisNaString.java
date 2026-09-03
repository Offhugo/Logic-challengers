package Logic_Problems.LeetCode.LeetCode_75.SlidingWindow;

public class NumMaximoVogaisNaString {
    public int maxVowels(String s, int k) {
        int maxVogais = 0;
        int vogaisAtuais = 0;

        // 1. PRIMEIRA ETAPA: Montamos a "janela inicial" (os primeiros 'k' caracteres)
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vogaisAtuais++;
            }
        }

        // A maior contagem até agora é a da primeira janela
        maxVogais = vogaisAtuais;

        // 2. SEGUNDA ETAPA: As pontas vão trocando até o final da String
        // O 'i' começa em 'k' (o primeiro elemento que fica DE FORA da janela inicial)
        for (int i = k; i < s.length(); i++) {

            // PONTA QUE ENTRA (Direita): O novo caractere no índice 'i'
            if (isVowel(s.charAt(i))) {
                vogaisAtuais++;
            }

            // PONTA QUE SAI (Esquerda): O caractere antigo no índice '(i - k)'
            if (isVowel(s.charAt(i - k))) {
                vogaisAtuais--;
            }

            // Atualiza o recorde de maior quantidade de vogais encontradas
            maxVogais = Math.max(maxVogais, vogaisAtuais);
        }

        return maxVogais;
    }

    // Função auxiliar simples para saber se é vogal
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
