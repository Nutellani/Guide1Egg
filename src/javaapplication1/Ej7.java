package javaapplication1;

import service.ScannerService;

public class Ej7 {

    public static void ejercicio7() {

        Double number = ScannerService.askDouble("Inserte un numero para ver si es par o impar: ");
        if ((number % 2) == 0) {
            System.out.println("Sii chikitiin es PAR :)");
        } else {
            System.out.println("Es IMPAR chikitin UnU");
        }

    }

}
