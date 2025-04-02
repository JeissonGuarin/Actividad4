package Actividad4;

import java.util.Scanner;
public class ParoImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[8];

        System.out.println("Ingrese 8 números enteros :");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }
        System.out.println("Clasificación de los números:");

        for (int j : num) {
            if (j % 2 == 0) {
                System.out.println(j + " es par");
            } else {
                System.out.println(j + " es impar");
            }
        }

    }
}