package service;

public class ArrayService {
    
    public static void fillArray(int[] arrayNumbers){
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = (int)(Math.random() * 100);
        }
    }
    
    public static void showArray(int[] arrayNumbers){
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println(arrayNumbers[i]);
        }
    }
    
    public static int getIndexIfFound(int[] arrayNumbers, int valueToSearch) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == valueToSearch) {
                return i;
            }
        }
        return -1; // Es un valor inválido, indicando que no se encontró
    }
    
}
