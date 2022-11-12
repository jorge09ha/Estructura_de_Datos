package com.datastructures;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class ListaDobleCircular {

    private Node<Persona> head;
    private Node<Persona> tail;

    public void insertar(Persona value) {

        Node<Persona> nuevoNodo = new Node<Persona>(value);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
            head.setBack(tail);//

        } else if (head.getValue().getId() > value.getId()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);//

        } else if (tail.getValue().getId() <= value.getId()) {
            nuevoNodo.setBack(tail);//
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);//

        } else {

            Node<Persona> aux = head;
            while (aux.getNext().getValue().getId() < value.getId()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
            nuevoNodo.setBack(aux);//

            aux.getNext().setBack(nuevoNodo);//
            nuevoNodo.setBack(aux);//
        }
    }

    public void printList() {

        if (head != null) {
            Node<Persona> aux = head;
            while (aux != tail) {
                System.out.println(aux.getValue().toString());
                aux = aux.getNext();
            }
            System.out.println(tail.getValue().toString());
        } else {
            System.out.println("\nNo hay nada en la lista.");
        }
    }

    public boolean existe(int id) {
        boolean e = false;
        if (head != null) {
            Node<Persona> aux = head;
            while (aux.getNext().getValue().getId() == id || aux.getNext() != head) {
                aux = aux.getNext();
            }
            if (id == aux.getValue().getId()) {
                e = true;
            }
        } else {
            System.out.println("\nNo hay nada en la lista.");
        }
        return e;
    }

    public void modifica(Persona p) {
        Node<Persona> aux = head;
        if (head != null) {
            while (aux.getValue().getId() != p.getId() && aux.getNext() != head) {
                aux = aux.getNext();
                if (p.getId() == aux.getValue().getId()) {
                    aux.getValue().setNombre(p.getNombre());
                } else {
                    System.out.println("El id no esta en la lista.");
                }
            }
        } else {
            System.out.println("\nNo hay nada en la lista.");
        }
    }

    public void elimina(int id) {
        Node<Persona> aux = head;
        if (head != null) {
            while (aux.getValue().getId() != id && aux.getNext() != head) {
                aux = aux.getNext();
            }
            if (aux.getValue().getId() == id) {
                aux = aux.getNext();
                aux.setBack(aux.getBack().getBack());
                aux = aux.getBack();
                aux.setNext(aux.getNext().getNext());
            } else {
                System.out.println("\nNo existela persona id " + id + " en la lista.");
            }
        } else {
            System.out.println("\nNo hay nada en la lista.");
        }
    }

    public Persona extrae(int id) {
        String nombre = null;

        if (head != null) {
            Node<Persona> aux = head;
            while (aux.getValue().getId() != id && aux.getNext() != head) {
                aux = aux.getNext();
            }
            if (id == aux.getValue().getId()) {
                nombre = aux.getValue().getNombre();
                System.out.print("\nLa persona es id "+id+" es: ");
            }
            if (nombre == null) {
                System.out.println("\nNo existela persona id " + id + " en la lista.");
            }
        } else {
            System.out.println("\nNo hay nada en la lista.");
        }
        
        return new Persona(id, nombre);
    }

}
