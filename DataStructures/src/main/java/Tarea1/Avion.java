/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author jorge
 */
public class Avion extends Vehiculo implements Volador {

    /**
     * @static No es necesario instanciar la clase.
     * @param yoSoy
     */
    static void queSoy(String yoSoy) {
        System.out.println("Yo soy un Vehiculo y mi nombre es: " + yoSoy);
    }

    protected double velocidadVuelo;

    public Avion(double velocidadVuelo, String nombre, double peso, String matricula) {
        super(nombre, peso, matricula);
        this.velocidadVuelo = velocidadVuelo;
    }

    public double getVelocidadVuelo() {
        return velocidadVuelo;
    }

    public void setVelocidadVuelo(double velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String SoyVolador() {
        String msj = "Soy un vehiculo volador";
        return msj;
    }
    /**
     * SoyVolador en implementado de la interface Volador.
     *
     */

}
