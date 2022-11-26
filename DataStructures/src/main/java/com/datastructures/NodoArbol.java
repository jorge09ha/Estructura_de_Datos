package com.datastructures;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class NodoArbol {

    private int id;
    private NodoArbol hijoIzq;
    private NodoArbol hijoDer;

    public NodoArbol(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }

}
