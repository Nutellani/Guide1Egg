/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package javaapplication1;

import static service.ScannerService.askDouble;

public class Ej1 {
    
    public static void ejercicio1(){
        
        Double number1 = askDouble("Ingrese un numero para sumarlo con otro Brou ");
        Double number2 = askDouble("Ahora el 2do pls :)) ");
        System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
    }
    
}
