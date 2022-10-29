/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructures;

/**
 * Una lista enlazada simple es una estructuras de datos que permite almacenar
 * elementos de forma ordenada y en donde se puede agregar y extraer nodos en
 * cualquier lugar de la estructura
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class List {

    private Node<Persona> cabeza;

    public void insertar(Persona value) {

        Node<Persona> nuevoNodo = new Node<>(value);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
        } else if (cabeza.getValue().getId() < nuevoNodo.getValue().getId() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);
        } else {
            Node<Persona> aux = cabeza;
            while (aux.getNext() != null && aux.getNext().getValue().getId() < nuevoNodo.getValue().getId()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void eliminar(int idEliminar) {

        if (cabeza == null) {
            System.out.println("No hay datos");
        } else {
            Node<Persona> aux = cabeza;
            boolean encontrado = false;
            
            while (aux.getNext() != null) {
                if (aux.getNext().getValue().getId() == idEliminar) {
                    System.out.println("Se elimino a: " + aux.getNext().getValue().toString());
                    aux.setNext(aux.getNext().getNext());
                    encontrado = true;
                } else {
                    aux = aux.getNext();
                }
            }

            if (!encontrado) {
                System.out.println("No existe el id:" + idEliminar + " en la lista.");
            }

        }
    }

    public void printList() {
        Node<Persona> aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }

    }

}
