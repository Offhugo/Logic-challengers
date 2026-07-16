package Logic_Problems.ExerciciosBase.ListaNivelUm;

public class ContarParImpar {
    int contPar;
    int contImpar;

    public ContarParImpar(int contPar, int contImpar) {
        this.contPar = contPar;
        this.contImpar = contImpar;
    }

    public String toString () {
        return "Par: " + this.contPar + " Impar: " + this.contImpar;
    }

    public static ContarParImpar encontrandoParImpar(int num) {
        int contPar = 0;
        int contImpar = 0;
        int numReserva = 1;

        while (num != 0) {

            numReserva = num % 10;

            if (numReserva % 2 == 0) {
                contPar += 1;
            } else {
                contImpar += 1;
            }

            num /= 10;
        }

        return new ContarParImpar(contPar, contImpar);
    }

    public static void main(String[] args) {
        int num = 12345;

        System.out.println(encontrandoParImpar(num));
    }
}
