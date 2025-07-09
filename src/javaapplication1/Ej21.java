/*
21. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido.
 */
package javaapplication1;

import static service.ArrayService.showArray;
import static service.ArrayService.fillArray;
import static service.ScannerService.askPositiveInt;

public class Ej21 {

    public static void ejercicio21() {

        int arraySize = askPositiveInt("Manin introduzca el tamaño que quiere quesea el vector :))");
        int counter = 0;
        
        int[] arrayNumbers = new int[arraySize];

        fillArray(arrayNumbers);

        showArray(arrayNumbers);
        
        int number2 = askPositiveInt("Metele un pastel (ejem numero) a ver cuantas veces se repitió en el caso que se haya repetido c;");
        
        System.out.println("El numero se encontró en ... \n");
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] ==number2) {
                System.out.print(arrayNumbers[i] + ", ");
                counter ++ ;
            }
        }
        
        System.out.println("el " + number2 + " se encontró " + counter + " veces :D");

    }

}
