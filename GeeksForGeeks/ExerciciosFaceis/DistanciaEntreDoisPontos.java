/*
*   COMO FAZER:
*   - começar de dentro pra fora
*   - com isso, resolvemos os primeiros calculos e usamos nos subsequentes
*     os valores guardado em variaveis respectivas
*   - chega ao final
* */
package Logic_Problems.GeeksForGeeks.ExerciciosFaceis;

public class DistanciaEntreDoisPontos {
    public static double calcularDistancia(int x1, int x2, int y1, int y2) {
        double distanciaEntrePontos = 0;
        final int expoente = 2;

        // Variáveis que guardam as subtrações
        int subX = 0;
        int subY = 0;

        // variáveis que guardam a potência de cada ponto
        int potX = 0;
        int potY = 0;

        // variável que guarda a soma das potências
        double somaPot = 0;

        // Realizando subtração
        subX = x1 - x2;
        subY = y1 - y2;

        // Adicionando subtração as variáveis de potência
        potX = subX;
        potY = subY;


        // Para calcular as potencias
        // Calcula a potência usando multiplicações
        double exponeciacaoX = 1;
        for (int i = 0; i < expoente; i++) {
            exponeciacaoX *= potX;
        }

        double exponeciacaoY = 1;
        for (int i = 0; i < expoente; i++) {
            exponeciacaoY *= potY;
        }

        // somando as potências encontradas
        somaPot = exponeciacaoX + exponeciacaoY;

        distanciaEntrePontos = raizQuadrada(somaPot);

        return distanciaEntrePontos;
    }

    public static double raizQuadrada(double n) {

        // Para números negativos
        if (n < 0) {
            throw new IllegalArgumentException("Não existe raiz real de número negativo.");
        }
        if (n == 0 || n == 1) {
            return n;
        }

        double x = n; // chute inicial
        double precisao = 0.00001; // quanto menor, mais preciso

        while (Math.abs(x * x - n) > precisao) {
            x = (x + n / x) / 2; // fórmula de Newton
        }

        return x;
    }

    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 8;

        int y1 = 5;
        int y2 = 9;

        System.out.printf("Distância entre os pontos: %.2f%n", calcularDistancia(x1, x2, y1, y2));
    }
}
