package com.datastructures;

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
        //------------------------------Semana 2 Recursividad--------------------
        //        int arr[] = {12, 34, 64, 2, 65};
        //        //System.out.println(Recursion.factorial(5));
        //        System.out.println(Recursion.encontrarMax(arr, 1, arr[0]));

        //------------------------------Semana 3 Pilas-------------------------------
        //        Stack<Integer> Pila = new Stack<>();
        //        Pila.push(1);
        //        Pila.push(2);
        //        Pila.push(4);
        //        System.out.println(Pila.pop());
        //        System.out.println(Pila.pop());
        //        System.out.println(Pila.pop());
        //        System.out.println(Pila.pop());
        //------------------------------Semana 3 Ejemplos en clase-------------------------------
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        boolean encontrado = false;

        Stack<Integer> Pila1 = new Stack<>();
        Pila1.push(17);
        Pila1.push(20);
        Pila1.push(3);
        Pila1.push(4);

        System.out.println(Pila1.buscar(x));

        //------------------------------Semana 4 Colas-------------------------------
    }

}
