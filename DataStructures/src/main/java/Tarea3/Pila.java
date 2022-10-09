package Tarea3;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Pila {

    private Nodo top;
    int tamanio;

    public Pila() {
        top = null;
        tamanio = 0;

    }

    public boolean esVacia() {
        return top == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    //me permite agregar un objeto a la pila
    public void push(String talla, String color, String marca, String lugar_confeccion, String tipo) {

        Nodo newCamisa = new Nodo(talla, color, marca, lugar_confeccion, tipo);
        newCamisa.setTalla(talla);
        newCamisa.setColor(color);
        newCamisa.setMarca(marca);
        newCamisa.setLugar_confeccion(lugar_confeccion);
        newCamisa.setTipo(tipo);

        if (top == null) {
            top = newCamisa;
        } else {
            if (top.getTalla().equals(newCamisa.getTalla()) || top.getColor().equals(newCamisa.getColor())) {
                System.err.println("La talla o el color de la camisa no debe ser igual a la camisa anterior");
                System.err.println("NO SE AGREGO LA CAMISA");
            } else {
                if (top.getMarca().equals(newCamisa.getMarca())) {
                    Nodo tempTop = new Nodo(top.getTalla(), top.getColor(), top.getMarca(), top.getLugar_confeccion(), top.getTipo());
                    newCamisa.setNext(top);
                    tempTop.setNext(top);
                    top = tempTop;
                } else {
                    newCamisa.setNext(top);
                    top = newCamisa;
                }
            }
        }

    }

    public void pop() {
        Nodo poppedValue = top;
        if (top != null) {
            top = top.getNext();
        }
    }
    //me permite mostrar todos los datos de la pila

    public void mostrarPila() {
        Nodo camisa = top;
        String cadena = "\nPila de camisas\n";

        while (camisa != null) {
            cadena += "{" + "\"Talla:\": " + camisa.getTalla()
                    + " \"Color:\" " + camisa.getColor()
                    + " \"Marca:\" " + camisa.getMarca()
                    + " \"Lugar:\" " + camisa.getLugar_confeccion()
                    + " \"Tipo:\" " + camisa.getTipo() + " }\n";
            camisa = camisa.getNext();
        }
        System.out.println("*".repeat(70)+cadena+"*".repeat(70));
    }

    public void buscarPorNombre(String nombre) {
//        Nodo aux = top;
//        String cadena = "pila\n";
//
//        while (aux != null) {
//            if (aux.getNombre().equals(nombre)) {
//                cadena += "{" + "\"nombre\": " + aux.getNombre() + " \"edad:\" " + aux.getEdad() + " }\n";
//            }
//
//            aux = aux.getSiguiente();
//        }
//        System.out.println(cadena);
    }

}
