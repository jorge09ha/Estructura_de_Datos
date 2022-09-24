package Tarea1;

/**
 * @Clase
 */
public abstract class Vehiculo {

    /**
     * @private: El campo o metodo solo es visible dentro de la clase donde se
     * define.
     * @protected: El campo o metodo es visible en la clase en donde se define y
     * en cualquiera de sus subclases.
     * @public: El campo o metodo es visible en cualquier clase.
     * @Ningunadelasanteriores: El campo o metodo es visible en cualquiera de
     * las clases pertenecientes al paquete en donde se define.
     */
    public String nombre;
    protected double peso;
    private String matricula;

    /**
     * @Constructores
     *
     */
    public Vehiculo(String nombre, double peso, String matricula) {
        this.nombre = nombre;
        this.peso = peso;
        this.matricula = matricula;
    }

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo() {
    }

    /**
     * @get @set
     */
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
