package com.project.matrix;

public class Exercise4 {

    //Escriba un programa Java para calcular el valor promedio de los elementos de la matriz

    public static void main(String[] args) {

        double [] matriz = {
                3.5, 5.9, 7, 4.5
        };

        double suma = 0;
        double total = 0;

        for (int i = 0; i < matriz.length; i++){
                suma += matriz[i];
                total = suma / matriz.length;

        }
        System.out.println("La suma de los valores es : " + suma);
        System.out.println("El promedio de los valores es : " + total);
    }

}
