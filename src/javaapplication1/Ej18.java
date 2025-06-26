/*
18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo: 
5 ***** 
3 *** 
11 *********** 
2 **
 */
package javaapplication1;

import static service.ScannerService.askDouble;

public class Ej18 {

    public static void ejercicio18() {

        System.out.println("Agrega 4 numeros pa, se escribirán tantos * como grande sea el numero :)");
        System.out.println("");

        for (int i = 0; i < 4; i++) {

            Integer number = 0;
            number = verifyImput(number);
            
            System.out.print(number + " ");

            for (int j = 0; j < number; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
    
    private static Integer verifyImput(Integer number){
        
        do {
            number = askDouble("Ingrese dicho numerito pero entre 1 y 20 :) si es decimal se truncará... ").intValue();
            
            if (number<1 || 20<number) {
                System.out.println("Que sea entre 1 y 20 >:V ");
            }
            
        } while (number<1 || 20<number);
        
        return number;
    }
}
