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

        for (int i = 0; i < 4; i++) {
            StringBuilder line = new StringBuilder();
            Integer number = 0;
            number = verifyInput(number);
            
            System.out.print(number + " ");
              
            for (int j = 0; j < number; j++) {
                line.append("*");

            }
            System.out.println(line);
        }
    }
    
    private static Integer verifyInput(Integer number){
        
        do {
            number = askDouble("Ingrese dicho numerito pero entre 1 y 20 :) si es decimal se truncará... ").intValue();
            
            if (number<1 || 20<number) {
                System.out.println("Que sea entre 1 y 20 >:V ");
            }
            
        } while (number<1 || 20<number);
        
        return number;
    }
}
