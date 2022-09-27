package Tarea2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge.hernandez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //------------------------------Ejercicio 1 --------------------
        Integer num = 123;

        System.out.println("-".repeat(40) + "\n" + "Ejercicio 1" + "\n" + "Original: " + num);
        System.out.println("Invertido: " + EjerciciosTarea.ejercicio1(num));

        //------------------------------Ejercicio 2 --------------------
        String palabra = "Hola este es el ejercicio 2";

        System.out.println("-".repeat(40) + "\n" + "Ejercicio 2" + "\n" + "String: " + palabra);
        EjerciciosTarea.ejercicio2(palabra, 0);

        //------------------------------Ejercicio 3 --------------------
        System.out.println("-".repeat(40) + "\n" + "Ejercicio 3");

        int[] vector;    //Declaro el vector
        System.out.println("Ingrese la cantidad de números: ");
        int n = Integer.parseInt(sc.nextLine());
        vector = new int[n];  // Tanaño del vectror

        //LLeno el vector
        vector = EjerciciosTarea.ejercicio3P1(vector, 0);
        //Muestro el vector
        EjerciciosTarea.ejercicio3P2(vector, 0);
        //Busco el mayor
        System.out.println(EjerciciosTarea.ejercicio3P3(vector, 0, 0));

//        //------------------------------Ejercicio 4 --------------------
        int arr[] = {5, 5, 5, 10, 5, 10};
        System.out.println("-".repeat(40) + "\n" + "Ejercicio 4");
        System.out.println("Estos son los numeros: " + Arrays.toString(arr));
        System.out.println("Resultado es: " + EjerciciosTarea.ejercicio4(arr, 0, 0));
//
//        //------------------------------Ejercicio 5 --------------------
        System.out.println("-".repeat(40) + "\n" + "Ejercicio 5");
        System.out.print("Ingrese el numero multiplicador: ");
        int multiplicando = Integer.parseInt(sc.nextLine());
        EjerciciosTarea.ejercicio5(multiplicando, 0);

        //Variante del ejercicio 5
        EjerciciosTarea.ejercicio5_Ej2(0, 0);
    }

}
