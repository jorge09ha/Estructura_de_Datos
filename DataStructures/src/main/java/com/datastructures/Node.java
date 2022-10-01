package com.datastructures;

/**
 * El nodo de es generico parta que pueda almacenar cualquier tipo de
 *
 * @author jorge
 * @param <T>
 */
public class Node<T> {

    private T value;
    private Node<T> next;
    private Node<T> back;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getBack() {
        return back;
    }

    public void setBack(Node<T> back) {
        this.back = back;
    }

}
