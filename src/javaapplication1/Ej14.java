/*
14. Escriba un programa que lea 20 números. Si el número leído es igual a cero
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de
la sentencia break.
 */
package javaapplication1;

import static service.Verifications.verifEj14;

public class Ej14 {

    public static void ejercicio14() {

        int counter = 0;
        Double number = 0d;

        do {
            
            number += verifEj14();
            counter += 1; // ingresa siendo cero y cuando termina una vuelta se cambia a uno, en la ultima vuelta termina siendo veinte y el ciclo termina :)

        } while (counter < 20);

        System.out.println("La suma total sería de: " + number + " :)");

    }
}
