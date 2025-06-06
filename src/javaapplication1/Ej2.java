/*
 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla
 */
package javaapplication1;

import static service.ScannerService.askString;

public class Ej2 {
    
    public static void ejercicio2(){
        
        String name = askString("Ingrese su nombre Para mostrarlo or pantasha :) ");
        System.out.println("Su nombre es " + name + " lol q nombre mas de gei jaja, dea se reia");        
    
    }
    
}
