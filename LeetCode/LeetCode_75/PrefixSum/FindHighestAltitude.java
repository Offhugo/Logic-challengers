package Logic_Problems.LeetCode.LeetCode_75.PrefixSum;

public class FindHighestAltitude {
    /* OBJETIVO:
        Um ciclista que vai pedalar em uma montanha, que começa em altitude 0 e vai variando conforme pedala
        com isso, as variações podem ser negativas ou positivas, então, o objetivo é retornar o maior valor
    * */
    public int largestAltitude(int[] gain) {
        // Var de ambiente
        int contHigh = 0;
        int alturaMax = 0;
        int i = 0;

        // Loop que percorre o array e faz a soma acumulada
        while (i < gain.length) {

                contHigh += gain[i];

                if (contHigh > alturaMax) {
                    alturaMax = contHigh;
                }

            i++;
        }

        return alturaMax;
    }
}
