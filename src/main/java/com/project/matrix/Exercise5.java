package com.project.matrix;

public class Exercise5 {

    //Escriba un programa Java para probar si una matriz contiene un valor específico

    public static void main(String[] args) {

        int [] myArray = {
                3456,
                3445,
                3644,
                2003,
        };

        System.out.println(prueba(myArray, 2003));

    }

    public static boolean prueba(int[] array , int numero){
        for ( int resultado : array) {
            if ( resultado == numero){
                return true;
            }
        }
        return false;
    }
}
