/*
17. Dibujar un cuadrado de N elementos por lado utilizando el carácter
“*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá
dibujar lo siguiente: 
* * * *  
*     *
*     *
*     *      
*     *
* * * * 
 */
package javaapplication1;

import static java.lang.Math.floor;
import static service.ScannerService.askDouble;

public class Ej17 {

    public static void ejercicio17() {

        Double squareSize = 0d;
        squareSize = verifyInt(squareSize);
        squareSize = floor(squareSize);

        for (int i = 0; i < squareSize; i++) {

            for (int j = 0; j < squareSize; j++) {

                if (i == 0 || i == squareSize - 1) {
                    System.out.print("* ");
                } else {

                    if (j == 0 || j == squareSize - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println("");
        }

    }

    private static void inicioYFin(Double squareSize) {

        for (int i = 0; i < squareSize; i++) {
            System.out.print("* ");
        }
        System.out.println("");

    }

    private static Double verifyInt(Double squareSize) {

        do {

            squareSize = askDouble("Chamaco mete un numero, si es decimal se truncará :)");

            if (squareSize < 1d) {
                System.out.println("Pusistes menor a uno huevon jiji reingresá");
            }

        } while (squareSize < 1);

        return squareSize;
    }

}
