package Tarea5;

import java.util.Scanner;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class ListaDobleCircular {

    private Node<Integer> head;
    private Node<Integer> tail;
    private final Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        try {
            System.out.print("\n" + "-".repeat(30) + "\n^^^ Menu ^^^\n\n"
                    + "1. Insertar valor\n"
                    + "2. Ver lista actual\n"
                    + "00. Salir\n"
                    + "\nDigite su opcion:");

            byte opc = Byte.parseByte(sc.nextLine());

            switch (opc) {
                case 1: {
                    System.out.print("\nAgrege el nuevo valor a la lista.\nValor: ");
                    insertar();
                    mostrarMenu();
                    break;
                }
                case 2: {
                    printList();
                    mostrarMenu();
                    break;
                }
                case 00: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("\n***Opcion incorrecta, favor revisar!");
                    mostrarMenu();
                }
            }
        } catch (Exception e) {
            System.out.println("\n***Opcion incorrecta, favor revisar!");
            mostrarMenu();
        }
    }

    public void insertar() {

        int value = Integer.parseInt(sc.nextLine());
        Node<Integer> nuevoNodo = new Node<Integer>(value);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
            head.setBack(tail);//

        } else {
            nuevoNodo.setBack(tail);//
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);//

        }
    }

    public void printList() {

        Node<Integer> aux = head;
        System.out.println("\n" + "~".repeat(30));
        if (head == null) {
            System.out.println("No hay nada en la lista.");
            System.out.println("~".repeat(30));
        } else {
            System.out.println("Esta es la lista circular actual.");
            while (aux != tail) {
                System.out.println(aux.getValue().toString());
                aux = aux.getNext();
            }
            System.out.println(tail.getValue().toString());
            System.out.println("~".repeat(30));
        }
    }

}
