/*
23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz. 
 */
package javaapplication1;

public class Ej23 {

    public static void ejercicio23() {

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();   
    }
}
