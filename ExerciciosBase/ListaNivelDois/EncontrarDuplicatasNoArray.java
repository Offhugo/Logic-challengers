package Logic_Problems.ExerciciosBase.ListaNivelDois;

import java.util.HashSet;
import java.util.Set;

public class EncontrarDuplicatasNoArray {
    public static void encontrandoDuplicata(int[] array) {
        // guarda os valores vistos
        Set<Integer> vistos = new HashSet<>();
        // guarda os valores duplicados
        Set<Integer> duplicados = new HashSet<>();

        for (int valor : array) {
            // o sinal "!" permite que a condição retorne true e execute o comando adentro
            if (!vistos.add(valor)) {
                duplicados.add(valor);
            }
        }

        System.out.println("Duplicados: " + duplicados);
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 8, 8, 1, 10};

        encontrandoDuplicata(array);
    }
}
