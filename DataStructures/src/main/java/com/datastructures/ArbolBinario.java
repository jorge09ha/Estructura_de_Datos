package com.datastructures;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class ArbolBinario {

    private NodoArbol raiz;
    private int altura;

    public void inserta(int value) {
        if (raiz == null) {
            raiz = new NodoArbol(value);
        } else {
            insertar(raiz, value);
        }
    }

    public void insertar(NodoArbol nodo, int value) {
        if (value <= nodo.getId()) {
            if (nodo.getHijoIzq() == null) {
                nodo.setHijoIzq(new NodoArbol(value));
            } else {
                insertar(nodo.getHijoIzq(), value);
            }
        } else {
            if (nodo.getHijoDer() == null) {
                nodo.setHijoDer(new NodoArbol(value));
            } else {
                insertar(nodo.getHijoDer(), value);
            }
        }
    }

    public void inOrden() {
        if (raiz != null) {
            inOrdenRecorrer(raiz);
        } else {
            System.out.println("Arbol esta vacio");
        }
    }

    private void inOrdenRecorrer(NodoArbol nodo) {
        if (nodo != null) {
            inOrdenRecorrer(nodo.getHijoIzq());
            System.out.print(nodo.getId() + ",");
            inOrdenRecorrer(nodo.getHijoDer());
        }
    }

    public void retornarAltura(NodoArbol nodo, int nivel) {
        if (nodo != null) {
            retornarAltura(nodo.getHijoIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            System.out.println("Giro a la derecha" + nodo.getId());
            retornarAltura(nodo.getHijoDer(), nivel + 1);
        }
    }

    public int getAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        System.out.println("Altura: " + altura);
        return altura;
    }
}
