package Tarea1;

/**
 *
 * @author jorge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Las clases son plantillas para la creación de objetos. Para este
         * ejemplo tengo varias clases. Animal--->Aguila (Implementa Volador).
         * Vehiculo-->Avion (Implementa Volador).
         */

        //Instanciar es cuando creamos un nuevo objeto. 
        //En este caso se crean dos nuevos uno de clase Avion y la variable aquila1 y otro de clase Aguila y la variable avion1.
        Aguila aguila1 = new Aguila("Blanco", "Harpía ", 15);
        Avion avion1 = new Avion(320, "Boeing 747", 183500, "TRH023Q");

        /**
         * Una interfaz es una colección de métodos abstractos y propiedades
         * constantes. En las interfaces se especifica qué se debe hacer pero no
         * su implementación. El metodo SoyVolador es la implemantacion de
         * Volador. Al ser un metodo vacio, en cada una de las clases que se
         * implementa se puede modificar segun la nesesidad.
         */
        System.out.println(aguila1.SoyVolador());
        System.out.println(avion1.SoyVolador());

        /**
         * Para este caso queSoy en un metodo estatico de las clases Avion y
         * Aguila la cual resive un parametro de tipo String y lo pasa al meto.
         */
        String nomAvion = avion1.getNombre();
        String nomAguila = aguila1.getNombre();
        Aguila.queSoy(nomAguila);
        Avion.queSoy(nomAvion);

    }

}
