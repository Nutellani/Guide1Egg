/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios, y luego
pida al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el numero y si se encuentra repetido;
 */
package javaapplication1;

import static service.ArrayService.fillArray;
import static service.ArrayService.getIndexIfFound;
import static service.ArrayService.showArray;
import static service.ScannerService.askInt;
import static service.ScannerService.askPositiveInt;

/**
 *
 * @author Julito
 */
public class Ej21J {

    public static void ejercicio21J() {
        int size = askPositiveInt("Ingrese el tamaño del array: ");
        int[] numbers = new int[size];

        fillArray(numbers);

        System.out.println("El array generado es: ");
        showArray(numbers);

        int valueToSearch = askInt("Ingrese el valor a buscar repeticiones: ");
        
        int index = getIndexIfFound(numbers, valueToSearch);
        
        if (index == -1) {
            System.out.println("El valor " + valueToSearch + " no se encuentra");
            return;
        }
        
        System.out.println("El valor se encontró en el indice " + index);
        
        for (int i = index; i < numbers.length; i++) {
            if (numbers[i] == valueToSearch && i != index) {
                System.out.println("Se repite en el incide: " + i);
            }
        }
    }
}
