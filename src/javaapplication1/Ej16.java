/*
16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O.  
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta.  
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals()
 */
package javaapplication1;

import static service.ScannerService.askString;

public class Ej16 {

    public static void ejercicio16() {

        String cadena;
        int corrects = 0;
        int incorrects = 0;

        do {

            cadena = askString("Ingrese una cadena master ashei máximo del mundo mundial");
            cadena = reduceTo5(cadena);
            cadena = cadena.toUpperCase();
            
            if (cadena.length() == 5 && cadena.substring(0,1).equals("X") && cadena.endsWith("O")){
                corrects += 1;
            }
            
        } while (!cadena.equals("&&&&&"));

        System.out.println("Cantidad de correctas: " + corrects);
        System.out.println("Cantidad de incorrectas: " + incorrects);
        
        // acortarlo a 5 caracteres en el caso que lo tenga
        // si empieza con X y termina con una O entonces respeta el funcionamiento del dispositivo RS232
        // secuencia &&&&& marca el final de los envios "FDE"
        // al final se indicaran la cantidad de lectruas correctas e incorrectas
    }

    private static String reduceTo5(String cadena) {

        if (cadena.length() > 5) {
            return cadena.substring(0, 5);
        }
        return cadena;
    }
}
