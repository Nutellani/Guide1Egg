package javaapplication1;

import static service.ScannerService.*;

public class Main {

    public static void main(String[] args) {

        int option;

        option = askInt("Elija el ejercicio to execute :) ");

        switch (option) {

            case 1:
                Ej1.ejercicio1();
                break;

            case 2:
                Ej2.ejercicio2();
                break;

            case 3:
                Ej3.ejercicio3();
                break;

            case 4:
                Ej4.ejercicio4();
                break;

            case 5:
                Ej5.ejercicio5();
                break;

            case 6:
                Ej6.ejercicio6();
                break;

            case 7:
                Ej7.ejercicio7();
                break;

            case 8:
                Ej8.ejercicio8();
                break;

            case 9:
                Ej9.ejercicio9();
                break;
                
            case 10:

            default:
                System.out.println("Chikitin pero que mamada mandsaste lol ??");
                break;
        }
    }
}
