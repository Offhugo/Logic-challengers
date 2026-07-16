package Logic_Problems.GeeksForGeeks.ExerciciosFaceis;
// LEMBRAR DE COMENTAR E EXPLICAR O CODIGO

public class SobreposicaoDeRetangulo {


    static class Ponto {
        int x, y;

        Ponto(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean validandoSobreposicao(Ponto eUm, Ponto dUm, Ponto eDois, Ponto dDois) {
        if (dUm.x > eDois.x || eUm.x > dDois.x) {
            return false;
        }

        if (dUm.y > eDois.y || eUm.y > dDois.y) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Ponto eUm = new Ponto(0, 10);
        Ponto dUm = new Ponto(10, 0);
        Ponto eDois = new Ponto(5, 5);
        Ponto dDois = new Ponto(-1, 0);

        if (validandoSobreposicao(eUm, dUm, eDois, dDois))
            System.out.println("Rectangles Overlap");
        else
            System.out.println("Rectangles Don't Overlap");
    }
}
