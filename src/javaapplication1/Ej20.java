/*
20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.
*/
package javaapplication1;

import static service.ScannerService.askString;

public class Ej20 {

    public static void ejercicio20() {

        String[] naturalNumbers = new String[100];
        System.out.println("Oie chico te amo a pedi unos 100 numericos solo pa rellenar :)\n");

        for (int i = 0; i < naturalNumbers.length; i++) {
            
            naturalNumbers[i] = askString("Ingrese el valorico" + i + " del vector papi: ");
            
        }
        
        System.out.println("\n----------------------\n");
        
        for (int i = naturalNumbers.length-1; i >= 0 ; i--) {
            System.out.println(naturalNumbers[i]);
        }
        
        System.out.println("");
    }

}
