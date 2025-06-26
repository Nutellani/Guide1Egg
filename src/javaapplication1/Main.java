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
                Ej10.ejercicio10();
                break;

            case 11:
                Ej11.ejercicio11();
                break;
                
            case 12:
                Ej12.ejercicio12();
                break;

            case 13:
                Ej13.ejercicio13();
                break;
                
            case 14:
                Ej14.ejercicio14();
                break;
                
            case 141:
                Ej141.ejercicio141();
                break;
                
            case 15:
                Ej15.ejercicio15();
                break;
                
            case 151:
                Ej15J.ejercicio15J();
                break;
                
            case 16:
                Ej16.ejercicio16();
                break;

            case 17:
                Ej17.ejercicio17();
                break;
                
            case 18:
                Ej18.ejercicio18();
                break;
                
            case 19:
                Ej19.ejercicio19();
                break;
                
            default:
                System.out.println("Que pasó chikitin, te olvidaste de poner ese ejercicio en el Switch?? lol");
                break;
        }
    }
}
