/*
14. Escriba un programa que lea 20 números. Si el número leído es igual a cero
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de
la sentencia break.
 */
package javaapplication1;

import static service.ScannerService.askDouble;

public class Ej141 {

    public static void ejercicio141() {

        int counter = 0;
        Double number, total = 0d;
        
        do {
            number = verifyEj14();
            if (number == 0) {
                break; // El break interrumpe el bucle y continua con la ejecucion fuera del mismo
            } 
            if (number < 0) {
                continue; // El continue ignora todo lo que contiene debajo para esa iteración del bucle y continua en la siguiente iteracion dentro del mismo
            }

            total += number;
            counter += 1; // ingresa siendo cero y cuando termina una vuelta se cambia a uno, en la ultima vuelta termina siendo veinte y el ciclo termina :)

        } while (counter < 20);

        System.out.println("La suma total sería de: " + total + " :)");

    }

    private static Double verifyEj14() {

        Double number;

        number = askDouble("Ingrese 20 numeros papá, si son negativos no se sumarán :)");
        
        if (number == 0) {
            System.out.println("Se ha captura2 el número CERO");
        }

        return number;
    }
    
}
