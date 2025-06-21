/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:

    MENU  
Sumar 
Restar
Multiplicar
Dividir
Salir 
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package javaapplication1;

import service.ScannerService;

/**
 *
 * @author Julito
 */
public class Ej15J {

    private static final String MENU = "\n"
            + "MENU: \n"
            + "1. Sumar \n"
            + "2. Restar \n"
            + "3. Multiplicar \n"
            + "4. Dividir \n"
            + "5. Salir";

    public static void ejercicio15J() {
        int opcion;
        boolean quiereTerminar = false;
        double num1, num2;
        do {
            num1 = ScannerService.askDouble("Ingrese el primer número: ");
            num2 = ScannerService.askDouble("Ingrese el segundo: ");

            System.out.println(MENU);
            opcion = ScannerService.askInt("Ingrese una opción: ");

            switch (opcion) {
                case 1: // Sumar
                    sumar(num1, num2);
                    break;
                case 2: // Restar
                    restar(num1, num2);
                    break;
                case 3: // Multiplicar
                    multiplicar(num1, num2);
                    break;
                case 4: // Dividir
                    dividir(num1, num2);
                    break;
                case 5:
                    quiereTerminar = consultarSalida();
                    break;
                default:
                    System.out.println("Opción inválida, reintente");
            }

            if (!quiereTerminar) {
                enterParaContinuar();
            }
        } while (!quiereTerminar);

    }

    private static boolean consultarSalida() {
        String salir = ScannerService.askString("Está seguro de que quiere salir? ");
        // Para evitar casos raros como "siii", "Sí", "si",... Haría "sí" -> "s" -> "S"
        return salir.substring(0, 1).toUpperCase().equals("S");
    }

    private static void sumar(double num1, double num2) {
        System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " es: " + (num1 + num2));
    }

    private static void restar(double num1, double num2) {
        System.out.println("El resultado de la resta entre " + num1 + " y " + num2 + " es: " + (num1 - num2));
    }

    private static void multiplicar(double num1, double num2) {
        System.out.println("El resultado de la multiplicación entre " + num1 + " y " + num2 + " es: " + (num1 * num2));
    }

    private static void dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por 0 awebonao");
            return;
        }

        System.out.println("El resultado de la división entre " + num1 + " y " + num2 + " es: " + (num1 - num2));
    }

    private static void enterParaContinuar() {
        ScannerService.askString("Presione enter para continuar.");
        System.out.println(""); //Salto de linea
    }
}
