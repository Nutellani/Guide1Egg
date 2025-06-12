/*
10. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package javaapplication1;

import static service.ScannerService.askString;

public class Ej10 {

    public static void ejercicio10() {

        // SIEMPRE que quiera igualar o comparar Strings se usa el "equals()" no el "==" para comparar :)    
        String phrase = askString("Ingrese una frasecita  pls :)");
        
        phrase = phrase.toUpperCase();
        System.out.println(phrase);
        
        if ((phrase.substring(0,1)).equals("A")) {
            System.out.println("SÍ señoor su frase empezó con la letra A :))");
        } else {
            System.out.println("NoN , no empezó con la letra A jejen't");
        }
    }
}
