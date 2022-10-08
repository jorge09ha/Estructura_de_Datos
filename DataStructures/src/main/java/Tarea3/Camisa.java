package Tarea3;

import java.util.Scanner;

/**
 *
 * @author jorge.hernandez
 */
public class Camisa {

    protected String talla, color, marca, lugar_confeccion, tipo;

    public Camisa(String talla, String color, String marca, String lugar_confeccion, String tipo) {
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

}
