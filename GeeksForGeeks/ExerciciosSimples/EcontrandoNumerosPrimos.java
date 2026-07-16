/*
    Objetivo: algoritmo para buscar numeros primos em uma array
    1 - Criar método para preencher e retornar um array
    2 - Criar método que recebe um array e conta os seus números primos, assim retornando quantos números são primos
* */
package Logic_Problems.ExerciciosBase.GeeksForGeeks.ExerciciosSimples;

import java.util.Arrays;

public class EcontrandoNumerosPrimos {
    public int[] preencherArray(){
        int[] array = new int[16];
        for (int i = 1; i < array.length; i++) {
            array[i] = i ;
        }

        return array;
    }

    public int[] retornarPrimos(int[] array){
        int[] numerosPrimos = new int[array.length];
        System.out.println("Números passados: " + Arrays.toString(array));

        for (int i = 1; i < array.length; i++){
            if (i % i == 0 & i % 2 == 0) {
                numerosPrimos[i] = array[i];
            }
        }
        return numerosPrimos;
    }
    
    public static void main(String[] args) {
        EcontrandoNumerosPrimos econtrandoNumerosPrimos = new EcontrandoNumerosPrimos();

        System.out.println("Números primos " + Arrays.toString
                (econtrandoNumerosPrimos.retornarPrimos(econtrandoNumerosPrimos.preencherArray())));
    }
}
