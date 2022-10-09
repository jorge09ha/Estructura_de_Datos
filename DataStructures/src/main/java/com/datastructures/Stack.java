package com.datastructures;

/**
 *
 * @author jorge.hernandez
 * @param <T>
 */
public class Stack<T> {

    /**
     *
     */
    private Node<T> top;

    /**
     * En valor de entrada es generico. Saca un elemeno del stack.
     *
     * @param value
     */
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        
    }

    /**
     * Pop agrega un elemento nuevo al stack. poppedValue en un valor de
     * referencia para no perder el valor de top
     *
     * @return un objeto de tipo T
     */
    public T pop() {
        Node<T> poppedValue = top;
        if (top != null) {
            top = top.getNext();
            return poppedValue.getValue();
        } else {
            return null;
        }
    }
    
    /**
     * Ejemplo numero 3 
     * @param x
     * @return 
     */
     public boolean buscar(T x) {
        
        boolean existe = false;
        
        if (top == null) {
            return false;
        }
        
        while (existe != true && top != null) {
            if (x == top.getValue()) {
                existe = true;
            } else {
                top = top.getNext();
            }
        }
        return existe;
    }
}
