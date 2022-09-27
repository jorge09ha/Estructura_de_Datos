package Tarea2;

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
        //------------------------------Ejercicio 1 --------------------
        Integer num = 123;

        System.out.println("-".repeat(40) + "\n" + "Ejercicio 1" + "\n" + "Original: " + num);
        System.out.println("Invertido: " + EjerciciosTarea.ejercicio1(num));

//        //------------------------------Ejercicio 2 --------------------
        String palabra = "Hola este es el ejercicio 2";

        System.out.println("-".repeat(40) + "\n" + "Ejercicio 2" + "\n" + "String: " + palabra);
        EjerciciosTarea.ejercicio2(palabra, 0);

        //------------------------------Ejercicio 3 --------------------
        //------------------------------Ejercicio 4 --------------------
        int arr[] = {5, 5, 5, 10, 5, 10};
        System.out.println("-".repeat(40) + "\n" + "Ejercicio 4");
        System.out.println("Resultado es: " + EjerciciosTarea.ejercicio4(arr, 0, 0));

        //------------------------------Ejercicio 5 --------------------
        System.out.println("-".repeat(40) + "\n" + "Ejercicio 5");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero multiplicador: ");
        int multiplicando = Integer.parseInt(sc.nextLine());
        EjerciciosTarea.ejercicio5(multiplicando, 0);

        //Variante del ejercicio 5
        EjerciciosTarea.ejercicio5_Ej2(0, 0);

    }

}
