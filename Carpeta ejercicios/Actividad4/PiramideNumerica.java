package Actividad4;

import java.util.Scanner;
public class PiramideNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número que va arriba de la pirámide: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 1; j <= num- i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }

    }
}