package Actividad4;

import java.util.Scanner;
public class OrdenInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = new int[11];


        System.out.println("Ingrese 10 números enteros ");
        for (int i = 1; i < num.length; i++) {
            System.out.println("numero " + i + ": ");
            num[i] = scanner.nextInt();
        }

        System.out.println("Números en orden inverso: ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

    }
}