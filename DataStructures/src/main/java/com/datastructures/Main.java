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
//                int arr[] = {12, 34, 64, 2, 65};
//                //System.out.println(Recursion.factorial(5));
//                System.out.println(Recursion.encontrarMax(arr, 1, arr[0]));
        //------------------------------Semana 3 Pilas-------------------------------
//                Stack<Integer> Pila = new Stack<>();
//                Pila.push(1);
//                Pila.push(2);
//                Pila.push(4);
//                System.out.println(Pila.pop());
//                System.out.println(Pila.pop());
//                System.out.println(Pila.pop());
//                System.out.println(Pila.pop());
        //------------------------------Semana 3 Ejemplos en clase-------------------------------
//        Scanner sc = new Scanner(System.in);
//        int x = Integer.parseInt(sc.nextLine());
//        boolean encontrado = false;
//
//        Stack<Integer> Pila1 = new Stack<>();// [17,20,3,4]
//        Pila1.push(17);
//        Pila1.push(20);
//        Pila1.push(3);
//        Pila1.push(4);
//
//        System.out.println(Pila1.buscar(x));
        //------------------------------Semana 4 Colas-------------------------------
//        Queue<Integer> Cola = new Queue<>();
//        Cola.enqueue(1);
//        Cola.enqueue(6);
//        Cola.enqueue(4);
//        
//        System.out.println(Cola.denqueue());
//        System.out.println(Cola.denqueue().getValueP
        //------------------------------Semana 4 Ejemplo en clase----------------

//        //LLenar una cola con 100 int
//        Queue<Integer> prueba = new Queue<>();
//        for (int i = 0; i < 101; i++) {
//            prueba.enqueue(i);
//        }
//
//        //Nuevo Head para la nueva cola
//        int temp = prueba.findByIndex(28).getValue();
//        System.out.println(temp);
//
//        //Nueva cola
//        Queue<Integer> prueba2 = new Queue<>();
//        prueba2.enqueue(temp);
//
//        //Lleno la cola a partir del nuevo head
//        for (int i = temp; i <= 101; i++) {
//            prueba2.enqueue(i);
//        }
//        //Busco el segundo elemeto de la cola
//        temp = prueba2.findByIndex(2).getValue();
//        System.out.println(temp);
        //------------------------------Semana 7 Listas----------------
//        List Lista = new List();
//        Lista.insertar(new Persona(1, "P"));
//        Lista.insertar(new Persona(7, "P"));
//        Lista.insertar(new Persona(45, "P"));
//        Lista.insertar(new Persona(4, "P"));
//        Lista.printList();
//        System.out.println("\nElimino al 8");
//        Lista.eliminar(8);
//        System.out.println("\nElimino al 7");
//        Lista.eliminar(7);
//        System.out.println("\nElimino al 7");
//        Lista.eliminar(7);
//        System.out.println("");
//        Lista.printList();
        //------------------------------Semana 7 Listas simple circular----------------
//        ListCircular ListaC = new ListCircular();
//        ListaC.insertar(new Persona(1, "A"));
//        ListaC.insertar(new Persona(2, "B"));
//        ListaC.insertar(new Persona(4, "D"));
//        ListaC.insertar(new Persona(3, "C"));
//        ListaC.printList();
        //------------------------------Semana 9 Listas doble circular----------------
//        ListaDobleCircular ListaDC = new ListaDobleCircular();
//        ListaDC.insertar(new Persona(1, "Roberto"));
//        ListaDC.insertar(new Persona(2, "Jorge"));
//        ListaDC.insertar(new Persona(4, "Julian"));
//        ListaDC.insertar(new Persona(3, "Axel"));
//        ListaDC.printList();
//
//        //Existe
//        int id1 = 4;
//        System.out.println("\nExiste el id " + id1 + ": " + ListaDC.existe(id1));
//
//        //Modifica
//        Persona p = new Persona(2, "Andres");
//        ListaDC.modifica(p);
//        System.out.println("\n");
//        ListaDC.printList();
//        
//        //Elimina
//        int id2 = 2;
//        ListaDC.elimina(id2);
//        System.out.println("\n");
//        ListaDC.printList();
//        
//        //Extrae
//        int id3 = 2;
//        Persona persona = new Persona();
//        persona = ListaDC.extrae(id3);
//        System.out.println(persona.toString());
        //------------------------------Semana 11 Arbol binario----------------
        ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.inserta(50);
        arbolBinario.inserta(20);
        arbolBinario.inserta(80);
        arbolBinario.inserta(15);
        arbolBinario.inserta(30);
        arbolBinario.inserta(60);
        arbolBinario.inserta(40);
        arbolBinario.inserta(90);
        arbolBinario.inserta(75);
        arbolBinario.inserta(33);
        arbolBinario.inserta(82);
        arbolBinario.inOrden();
        System.out.println("\n");
        arbolBinario.getAltura();
    }
}
