package Tarea1;

/**
 * @Clase
 * Una clase abstracta no es más que una clase común la cual posee atributos,
 * métodos, constructores y por lo menos un método abstracto. Una clase
 * abstracta no puede ser instanciada, solo heredada.
 *
 * @author jorge
 */
public abstract class Animal {

    /**
     * @Atributos
     * Los atributos, también llamados datos o variables miembro son porciones
     * de información que un objeto posee o conoce de sí mismo.
     */
    protected String nombre;
    protected int edad;

    /**
     * @Constructor
     * Un constructor es un elemento de una clase cuyo identificador coincide
     * con el de la clase correspondiente y que tiene por objetivo obligar a y
     * controlar cómo se inicializa una instancia de una determinada clase.
     *
     * @param nombre
     * @param edad
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * @SobrecargaDeConstructores El método get y set, es un método público,
     * pero el get se encarga de mostrar un valor a una propiedad o atributo de
     * un objeto, el cual está encapsulado en la clase correspondiente. y set el
     * cual se encarga de darle un valor a una propiedad o atributo de un objeto
     * (private o protected).
     *
     * @return
     */
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

}
