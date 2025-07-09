package service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerService {

    //al indicar el .useDelimeter("\n") aclaro que todos los sc.next seran hasta el enter y no el espacio
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static String askString(String mensaje) {
        System.out.print(mensaje);
        return sc.next(); // aca por defecto del "sc.next" usa como delimitador el espacio, por ende si quiero que me tome hasta el enter tiene que ir sc.nextLine()
    }

    public static Double askDouble(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static int askInt(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static int askPositiveInt(String mensaje) {

        int numero = -1;

        do {

            try {
                numero = askInt(mensaje);
            } catch (InputMismatchException ignored) {  // "ignored" en vez de "e" solo para indicar q no se urará
                System.out.println("Wn pusiste una coma, reintentá");
            };

        } while (numero < 0d); // 0 y 0d fuciona igual

        return numero;
    }

}
