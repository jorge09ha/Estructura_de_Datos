package com.datastructures;

/**
 *
 * @author jorge
 * @param <T>
 */
public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    /**
     * Enqueue agrega a la cola.
     *
     * @param value
     */
    public void enqueue(T value) {
        Node<T> newNode = new Node<T>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * Denqueue saca a la cola.
     *
     * @param value
     */
    public Node<T> denqueue() {
        if (head == null) {
            System.out.println("La cola esta vacia");
            return null;
        } else {
            Node<T> firsInQueue = head;
            head = head.getNext();
            return firsInQueue;
        }
    }

    public Node<T> findByIndex(int i) {
        if (head == null) {
            System.out.println("La cola esta vacia");
            return null;
        } else {
            Node<T> temp = head;

            while (!temp.getNext().equals(null) && i != 0) {
                temp = temp.getNext();
                i--;
            }
            if (i == 0) {
                return temp;
            } else {
                System.err.println("La cola no tiene " + i + " elementos");
                return null;
            }
        }
    }
}
