package Logic_Problems.LeetCode.LeetCode_75.Arrays_Strings;

public class MDCStrings {
    // OBJETIVO: encontrar a maior String póssivel X que divida duas strings(str1 e str2)

    // Método auxiliar que faz o cálculo devido do MDC
    private int calcularMDC(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMDC(b, a % b);
    }

    // Método principal para ver se a repetição resulta em str1 e str2
    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int mdc = calcularMDC(str1.length(), str2.length());

        return str1.substring(0, mdc);
    }
}
