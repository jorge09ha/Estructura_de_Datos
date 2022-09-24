/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author jorge
 */
public class Aguila extends Animal implements Volador {

    static void queSoy(String yoSoy) {
        System.out.println("Yo soy un animal y mi nombre es: " + yoSoy);
    }

    protected String color;

    public Aguila(String color, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String SoyVolador() {
        String msj = "Soy un animal volador";
        return msj;
    }

}
