/*
12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package javaapplication1;

import static service.ScannerService.askInt;

public class Ej12 {
    
    public static void ejercicio12(){
        
        boolean opcionValida;
        
        do {
            int option;
            option = askInt("Ingrese un numero del 0 al 10 chikitén: ");
            opcionValida = 0 <= option && option <= 10;
            
            if (!opcionValida){
                System.out.println("No mamon menos de 0 o mas de 10 no :v");
            }
            
        } while (!opcionValida);
        
        System.out.println("BIEN CHINCHULIN, HAZ PUESTO UNA OPCION NO INVALIDA :DDD");
    }
  
}
