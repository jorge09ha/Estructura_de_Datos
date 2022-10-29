package com.datastructures;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class ListCircular {

    private Node<Persona> head;
    private Node<Persona> tail;

    public void insertar(Persona value) {

        Node<Persona> nuevoNodo = new Node<Persona>(value);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);

        } else if (head.getValue().getId() > value.getId()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);

        } else if (tail.getValue().getId() <= value.getId()) {
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);

        } else {

            Node<Persona> aux = head;
            while (aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void printList() {
        Node<Persona> aux = head;
        while (aux != tail) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
        System.out.println(tail.getValue().toString());
    }

}
