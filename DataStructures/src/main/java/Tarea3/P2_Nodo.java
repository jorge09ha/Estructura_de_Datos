package Tarea3;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class P2_Nodo {

    String talla, color, marca, lugar_confeccion, tipo;
    P2_Nodo next;
    P2_Nodo back;

    public P2_Nodo(String talla, String color, String marca, String lugar_confeccion, String tipo) {
        this.talla = talla;
        this.color = color;
        this.marca = marca;
        this.lugar_confeccion = lugar_confeccion;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLugar_confeccion() {
        return lugar_confeccion;
    }

    public void setLugar_confeccion(String lugar_confeccion) {
        this.lugar_confeccion = lugar_confeccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public P2_Nodo getNext() {
        return next;
    }

    public void setNext(P2_Nodo next) {
        this.next = next;
    }

    public P2_Nodo getBack() {
        return back;
    }

    public void setBack(P2_Nodo back) {
        this.back = back;
    }

    
}
