package javaapplication1;

import static service.ScannerService.askDouble; // aca importo

public class Ej4 {

    public static void ejercicio4() {

        Double temperatura = askDouble("Ingrese una temperatura en Celcius para pasarlos a Fahrenheit ");
        System.out.println("Su temperatura en Fahrenheit es de " + (32 + (9 * temperatura / 5)));
    }
}
