package javaapplication1;

import service.ScannerService;

public class Ej3 {

    public static void ejercicio3() {
        
        String word = ScannerService.askString("Ingrese texto para mostrarlo en minuscula y mayuscula");
        
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        
    }
}
