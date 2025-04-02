package Actividad4;

import java.util.Scanner;

public class FacturaconIVA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Precio sin iva: $");
        double precio = scanner.nextDouble();

        double valoriva = 0.19;
        double iva = precio * valoriva;

        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + (iva + precio));


        scanner.close();

    }
}