package com.datastructures;

/**
 *
 * @author jorge
 */
public class Recursion {

    //static int arr[] = {12, 34, 64, 2, 3, 90};

    /**
     * El metodo recursivo debe tener minimo una condicion de Parada/Base, que
     * nos permite devolver un valor una llamada a si mi
     * @param n
     * @return 
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            System.out.println(n);
            return n * factorial(n - 1);
        }
    }

    /**
     * Determinar la posicion del valor mas alto en un vector de
     * numeros(Retornar la posicion del valor mas alto)
     *
     * @param numeros Es el arreglo
     * @param indice Tamaño del arreglo
     * @param max Valor mas alto
     * @return max que es el mas alto encontrado en el arreglo
     */
    public static int encontrarMax(int[] numeros, int indice, int max) {
        if (indice != numeros.length) {
            if (numeros[indice] > max) {
                System.out.println("Max: " + max + "\n");
                System.out.println("Numeros Indice: " + numeros[indice] + "\n");
                max = encontrarMax(numeros, indice + 1, numeros[indice]);
            }
        } else {
            max = encontrarMax(numeros, indice + 1, max);
        }
        return max;
    }
}
