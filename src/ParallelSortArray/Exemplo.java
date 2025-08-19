package ParallelSortArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exemplo {
    public static void main(String[] args){
        //Criando um array
        Integer[] numeros = {10, 54, -9, 3, 7 -29, 3, 7 ,90, -24};
        //Imprimindo o array
        for(Integer n : numeros){
            System.out.println(n);
        }
        //Usando a classe parallel sort pra ordenar o meu array
        Arrays.parallelSort(numeros);

        //Imprimindo o array ordenado
        for(Integer n : numeros){
            System.out.println(n);
        }

    }
}
