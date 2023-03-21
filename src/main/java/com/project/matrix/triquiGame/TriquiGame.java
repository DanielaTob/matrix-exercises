package com.project.matrix.triquiGame;

public class TriquiGame {

    public static void main(String[] args) {

        int filas = 4;
        int columnas = 4;


        int [][] game = new int[filas][columnas];

        for (int i = 1; i < filas; i++){
            for (int j = columnas -1; j > 0; j--){
                if (j == i){
                    System.out.print(" x ");
                } else if (i >= j) {
                    System.out.print(" o ");
                } else if (j >= i) {
                    System.out.print(" o ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }


    }

}
