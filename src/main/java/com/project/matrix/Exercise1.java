package com.project.matrix;

import java.util.Arrays;

public class Exercise1 {

    //Escriba un programa Java para ordenar una matriz numérica y una matriz de cadenas.

    public static void main(String[] args) {

        int[] myArray = {
                10,3,4,6,7,9,1,2,5,8
        };

        String[] myArray2 = {
                "perro", "gato", "nutria", "león", "tigre", "ave", "hamster",
                "pinguino", "pantera", "canguro"
        };

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));

        Arrays.sort(myArray);
        Arrays.sort(myArray2);

        System.out.println("----------------------------------------------------------------------------");

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));

    }

    //SORT - Arrays.sort ordena de forma ascendente (de menor a mayor).
    // Para ordenar un array de forma descendente (de mayor a menor) hay que indicarlo utilizando el método
    // reverseOrder() de la clase Collections.

    //TO STRING - por defecto retorna el nombre de la clase que se ha instanciado y la dirección de memoria del mismo.
}
