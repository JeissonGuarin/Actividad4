package Actividad4;

import java.util.Scanner;

public class ConversordeMoneda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pesos Colombianos: $");
        double pesoColombia = scanner.nextDouble();

        double dolar = 3895;

        double peso = pesoColombia / dolar;


        System.out.println("Dolar: $" + peso);


        scanner.close();
    }
}
