package Actividad4;

import java.util.Scanner;
public class ConteodePositivosyNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorPositivo = 0;
        int contadorNegativo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número "+(i+1)+":");
            int num = scanner.nextInt();

            if (num > 0){
                contadorPositivo++;
            } else if (num<0) {
                contadorNegativo++;

            }
        }

        System.out.println("La cantidad de numeros positivos son : "+contadorPositivo);
        System.out.println("La cantidad de numeros negativos son : "+contadorNegativo);

    }
}