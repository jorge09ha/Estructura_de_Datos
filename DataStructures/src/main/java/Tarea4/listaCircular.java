package Tarea4;

import java.util.Scanner;

/**
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class listaCircular {

    private Node<Integer> head;
    private Node<Integer> tail;
    private final Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        try {
            System.out.print("\n" + "-".repeat(30) + "\n^^^ Menu Ejercicio 2 ^^^\n\n"
                    + "1. Insertar valor\n"
                    + "2. Eliminar ultimo nodo\n"
                    + "3. Ver lista actual\n"
                    + "4. Salir\n"
                    + "\nDigite su opcion:");

            byte opc = Byte.parseByte(sc.nextLine());

            switch (opc) {
                case 1: {
                    System.out.print("\nAgrege el nuevo valor a la lista.\nValor: ");
                    insert();
                    mostrarMenu();
                    break;
                }
                case 2: {
                    System.out.print("\nValor a eliminar: ");
                    delete();
                    mostrarMenu();
                    break;
                }
                case 3: {
                    verLista();
                    mostrarMenu();
                    break;
                }
                case 4: {
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

    public void insert() {
        int value = Integer.parseInt(sc.nextLine());

        Node<Integer> nuevoNodo = new Node<Integer>(value);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);

        } else {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);

        }
    }

    public void verLista() {

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
            System.out.println("Head: " + head.getValue() + " Tail: " + tail.getValue());
            System.out.println("~".repeat(30));
        }
    }

    public void delete() {
        int value = Integer.parseInt(sc.nextLine());
        Node<Integer> aux = head;
        int contador = 0;

        if (head != null) {
            if (value == tail.getValue()) {

                while (aux != tail) {
                    contador++;
                    aux = aux.getNext();
                }

                for (int i = 0; i < contador; i++) {
                    aux = aux.getNext();
                }

                aux.setNext(head);
                tail = aux;

                if (contador == 0) {
                    tail = null;
                    head = null;
                }
                verLista();
                System.out.println("\n***Se elimino el ultimo nodo.");

            } else {
                System.out.println("\n***El valor ingresado no es el ultimo en la lista.");
                System.out.println("***El ultimo valor es: " + tail.getValue());
                System.out.println("***NO SE BORRA NADA.");
            }

        } else {
            System.out.println("\n***NO hay datos en la lista. Inserte datos primero");
        }

    }

}
