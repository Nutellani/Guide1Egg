/*
9. Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java. 
 */
package javaapplication1;

import static service.ScannerService.askString;

public class Ej9 {

    public static void ejercicio9() {

        String phrase = askString("Ingrese una frase de 8 caracteres ");
        if (phrase.length() == 8) {
            System.out.println("Felicidades Shinji, la frase contiene 8 caracteres :)) ");
        } else {
            System.out.println("No mamon tu frase fuen't de 8 cifras LOL ");
        }

    }

}
