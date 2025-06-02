/* 
8. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.
*/

package javaapplication1;

import service.ScannerService;
        
public class Ej8 {
    
    public static void ejercicio8(){
        
        String contraseña = ScannerService.askString("Ingrese frase cualquiera: ");
        if ("cualquiera".equals(contraseña)){
            System.out.println("Si señoor la contraseña era cualquiera :))");
        } else {
            System.out.println("Santas cachulentas y la concha de tu mama, escrotalo bien chikitin, NO ERA LA CONTRASEÑA CORRETA");
        }
    }
}
