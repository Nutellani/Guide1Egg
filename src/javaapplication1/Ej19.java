/*
19. Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void). 
El cambio de divisas es: 
* 0.86 libras es un 1 € 
* 1.28611 $ es un 1 € 
* 129.852 yenes es un 1 €
 */
package javaapplication1;

import static service.ScannerService.askDouble;
import static service.ScannerService.askInt;

public class Ej19 {

    public static void ejercicio19() {

        Double moneda = askDouble("Ingrese el valor de una moneda para hacerle la transformacion de moneda :) ");

        convertion(moneda);

    }

    private static void convertion(Double moneda) {

        int option = askInt("Introduce si quieres cambiarlo a: \n" + "1: Libras \n" + "2: Dolares \n" + "3: Yenes \n");

        switch (option) {

            case 1:
                System.out.println("Convertido a Libras es: " + moneda * 0.86);
                break;

            case 2:
                System.out.println("Convertido a Dolarucos es : " + moneda * 1.28611);
                break;

            case 3:
                System.out.println("Convertido a Yenes es : " + moneda * 129.852);
                break;

            default:
                System.out.println("Ah respondñia cualquier cosa el chabon/a, q tenga un wen día :)");

        }
        
        System.out.println("Pero que tenga un wen día :)");

    }

}
