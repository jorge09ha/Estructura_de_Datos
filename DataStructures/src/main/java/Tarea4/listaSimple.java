package Tarea4;

import java.util.Scanner;

/**
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class listaSimple {

    private Node<Integer> head;
    private final Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        try {
            System.out.print("\n" + "-".repeat(30) + "\n^^^ Menu Ejercicio 1 ^^^\n\n"
                    + "1. Insertar valor \n"
                    + "2. Buscar valor \n"
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
                    System.out.print("\nValor a buscar: ");
                    buscar();
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

        Node<Integer> nuevoNodo = new Node<>(value);
        if (head == null) {
            head = nuevoNodo;
        } else if (head.getValue() > nuevoNodo.getValue()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
        } else if (head.getValue() < nuevoNodo.getValue() && head.getNext() == null) {
            head.setNext(nuevoNodo);
        } else {
            Node<Integer> aux = head;
            while (aux.getNext() != null && aux.getNext().getValue() < nuevoNodo.getValue()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void verLista() {
        System.out.println("\n" + "~".repeat(30));
        Node<Integer> aux = head;
        if (head == null) {
            System.out.println("No hay nada en la lista.");
            System.out.println("~".repeat(30));
        } else {
            System.out.println("Esta es la lista simple actual.");
            while (aux != null) {
                System.out.println(aux.getValue().toString());
                aux = aux.getNext();
            }
            System.out.println("~".repeat(30));
        }
    }

    public void buscar() {

        int value = Integer.parseInt(sc.nextLine());
        boolean searchOK = false;
        String valorAnterior = null;
        int posicion = 0;

        if (head != null) {
            Node<Integer> aux = head;
            while (aux != null) {
                posicion++;
                if (value == aux.getValue()) {
                    searchOK = true;
                    aux = null;
                } else {
                    valorAnterior = aux.getValue().toString();
                    aux = aux.getNext();
                }
            }
            if (searchOK) {
                 System.out.println("\n" + "~".repeat(30));
                System.out.println("El valor " + value + " esta en la posición : " + posicion);
                System.out.println("El valor anterior es: " + valorAnterior);
                 System.out.println( "~".repeat(30));
            } else {
                
                System.out.println("\n***NO existe el valor ingresado en la lista.");
            }
        } else {
            System.out.println("\n***NO hay datos en la lista. Inserte datos primero");
        }

    }
}
