package javaapplication1;

import static java.lang.Math.sqrt;
import service.ScannerService;

public class Ej5 {
    
    public static void ejercicio5(){
        
        Double result;
        result = ScannerService.askDouble("Ingrese un numero para mostrarte el doble, el triple y su raiz ");
        System.out.println("Su numero duplicado es: " + result*2);
        System.out.println("Su numero triplicado es: " + result*3);
        System.out.println("Y su raíz es: " + sqrt(result));
    }
}
