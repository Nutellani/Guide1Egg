package javaapplication1;

import static service.ScannerService.askDouble;

public class Ej6 {
    
    public static void ejercicio6(){
        
        Double number1;
        Double number2;
        
        System.out.println("Va a ingresar 2 numeros para comprobar cual es mayor y menor");
        number1 = askDouble("Ingrese el numero 1: ");
        number2 = askDouble("Ingrese el numero 2: ");
        
        System.out.println("El número " + ( number1 <= number2 ? number2: number1 ) + " es el mayor");
              
    }
}
