/*  Ideia principal:
    - Criar o loop para fazer a exponenciação a cada iteração
    - calcular o numero de digitos de cada valor na iteração
    - calcular INICIALMENTE quantos digitos possui o numero da exponenciação
*
* */
package Logic_Problems.GeeksForGeeks.ExerciciosFaceis;

public class EncontrandoPotencia {
    public static boolean encontrandoPotencia(int x, long y) {

        if (x == 1)
            return (y == 1);

        long pow = 1;
        while (pow < y)
            pow *= x;

        return (pow == y);
    }

    public static void main(String[] args) {
        System.out.println(encontrandoPotencia(10, 1));
        System.out.println(encontrandoPotencia(1, 20));
        System.out.println(encontrandoPotencia(2, 128));
        System.out.println(encontrandoPotencia(2, 30));
    }
}
