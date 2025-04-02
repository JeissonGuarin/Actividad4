package Actividad4;

import java.util.Scanner;

public class OrdenamientodeNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        System.out.println("El orden de los numeros son: " + num + "," + num2 + "," + num3);

        int mayor, menor, medio;

        if (num <= num2 && num2 <= num3) {
            menor = num;

            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        }else if (num2 <= num3 && num2 <= num) {
                menor = num2;

                if (num <= num3) {
                    medio = num;
                    mayor = num3;
                } else {
                    medio = num3;
                    mayor = num;

            }
        }
        else {
            menor = num3;
            if (num <= num2) {
                medio = num;
                mayor = num2;
            }
            else {
                medio = num2;
                mayor = num3;
            }
        }
        System.out.println("Los números en orden ascendente: " + menor + "," + medio + "," + mayor);
    scanner.close();

    }
}
