package Actividad4;

import java.util.Scanner;

public class PrimeraCifradeunNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero de hasta 5 dígitos: ");
        int numero = scanner.nextInt();

        if (numero >= -99999 && numero <= 99999) {
            int numeroPositivo = Math.abs(numero);

            String numeroTexto = String.valueOf(numeroPositivo);
            char primeraCifraTexto = numeroTexto.charAt(0);

            System.out.println("\nUsando conversión a String:");
            System.out.println("La primera cifra de " + numero + " es: " + primeraCifraTexto);
        }
        else {
            System.out.println("El número no debe ser mayor a 5 dígitos");
        }

    }

}