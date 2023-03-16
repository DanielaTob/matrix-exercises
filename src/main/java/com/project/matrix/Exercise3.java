package com.project.matrix;

public class Exercise3 {

    //Escriba un programa Java para imprimir la siguiente cuadrícula.
        public static void main(String[] args) {

            int filas = 4;
            int columnas = 4;


            int [][] matriz = new int[filas][columnas];

            for (int i = 1; i < filas; i++){
                for (int j = columnas -1; j > 0; j--){
                    if (j == i){
                        System.out.print(1);
                    }else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }

}
