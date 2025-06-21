/*
15. Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:

    MENU 
    1. Sumar 
    2. Restar 
    3. Multiplicar 
    4. Dividir 
    5. Salir 
    Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package javaapplication1;

import static service.ScannerService.*;

public class Ej15 {

    public static void ejercicio15() {

        String verification = "N";

        Double number1 = askDouble("Ingrese un numero chikititita: ");
        Double number2 = askDouble("Ahora el second: ");

        do {

            menu();

            int option = askInt("Enter option dea... ");

            verification = switchEj15(option, number1, number2, verification);

        } while (!verification.equals("S"));

        System.out.println(":D");
    }

    //////////////////////////////// Aux Methods /////////////////////////////////
    private static void menu() {

        System.out.println("    MENU \n"
                + "    1. Sumar \n"
                + "    2. Restar \n"
                + "    3. Multiplicar \n"
                + "    4. Dividir \n"
                + "    5. Salir \n"
                + "    Elija opción:");

    }

    private static String switchEj15(int option, Double number1, Double number2, String verification) {

        switch (option) {

            case 1:
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;

            case 2:
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;

            case 3:
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;

            case 4:
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;

            case 5:

                verification = askString("R U Sure U Want To Exit LoL??");
                break;

            default:

                System.out.println("Rta Incorrect lel");

        }

        return verification;

    }

}
