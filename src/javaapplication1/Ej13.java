/*
13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial.
 */
package javaapplication1;

import static service.ScannerService.askDouble;

public class Ej13 {
    
    public static void ejercicio13(){
        
        Double limit = askDouble("Metele que son tortitas, decime un numero para usarlo de limite...");
        Double total = 0d;  // los Double por defecto son null, por ende se tienen que inicializar. Al inicializarlos con 0d estoy indicando que es un double ;)
        do {
            total += askDouble("Chikitin tirá numeros para superar ese límite :))");
        } while (total<limit);
        
        System.out.println("Moy bieeeen, has sali2 del bucle, ya pasaste tu límite :))");
        
    }
    
}
