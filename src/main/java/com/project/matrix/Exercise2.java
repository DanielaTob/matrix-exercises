package com.project.matrix;

public class Exercise2 {

    public static void main(String[] args) {

        // Escriba un programa Java para sumar los valores de una matriz.
        // Escriba un programa Java para restar los valores de una matriz.

        int matriz_1 [][] = new int[3][3];
        int matriz_2 [][] = new int[3][3];
        int matriz_resultado [][] = new int[3][3];


        //Llenado de la matriz 1
        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1.length; j++){
                matriz_1[i][j] = (int) (Math.random() * 5); //Casteo
            }
        }


        //Llenado de la matriz 2
        for (int i = 0; i < matriz_2.length; i++){
            for (int j = 0; j < matriz_2.length; j++){
                matriz_2[i][j] = (int) (Math.random() * 5);
            }
        }

        //Suma y resta de Matrices
        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1.length; j++){
                matriz_resultado[i][j] = matriz_1[i][j] + matriz_2[i][j];
            }
        }

       /* for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1.length; j++){
                matriz_resultado[i][j] = matriz_1[i][j] - matriz_2[i][j];
            }
        }*/

        //Imprimiendo las matrices
        for (int i = 0; i < matriz_1.length; i++){


            for (int j = 0; j < matriz_1.length; j++){
                System.out.print("[ " + matriz_1[i][j] + " ]");

            }

            System.out.print("     +    ");

            for (int j = 0; j < matriz_2.length; j++){
                System.out.print("[ " + matriz_2[i][j] + " ]");
            }

            System.out.print("     =    ");


            for (int j = 0; j < matriz_resultado.length; j++){
                System.out.print("[ " + matriz_resultado[i][j] + " ]");
            }


            System.out.println("");
        }


    }
}
