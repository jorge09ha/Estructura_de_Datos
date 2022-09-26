package Tarea2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //------------------------------Ejercicio 1 --------------------
        /**
         *
         */
//        Scanner sc = new Scanner(System.in);
//        Integer int1 = Integer.parseInt(sc.nextLine());
//        System.out.println("Ejercicio 1" + "\n" + "Numero Original: " + int1);
//        System.out.println("Numero Invertido: " + EjerciciosTarea.ejercicio1(int1));

        int num = 987456, reversed = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);

    }

}
