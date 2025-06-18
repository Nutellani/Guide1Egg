package service;

public class Verifications {

    public static Double verifEj14() {

        Double number = 0d;

        number = ScannerService.askDouble("Ingrese 20 numeros papá, si son negativos no se sumarán :)");

        if (0 > number) {

            number = 0d;

        } else if (number == 0) {

            System.out.println("Se ha captura2 el número CERO");

        }

        return number;
    }

}
