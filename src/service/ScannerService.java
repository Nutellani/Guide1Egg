package service;

import java.util.Scanner;

public class ScannerService {

    //al indicar el .useDelimeter("\n") aclaro que todos los sc.next seran hasta el ennter y no el espacio
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /**
     * Imprime un mensaje pidiendo información al usuario y luego devuelve la
     * información introducida por él
     *
     * @param mensaje el mensaje a mostrar al usuario
     * @return la información introducida por el usuario
     */
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
    
}
