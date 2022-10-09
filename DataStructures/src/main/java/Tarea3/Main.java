package Tarea3;

/**
 * Tarea #3 Grupo1
 *
 * P1 = Es el ejercicio #1 de la tarea.
 *
 * P2_Menu = Menu para interactuar con los puntos solicitados del ejercicio #2.
 * P2_Nodo = Es el nodo de camisas del ejercicio #2. P2_Funciones = Es la pila
 * de camisas y la funcion buscar la que se repite mas del ejercicio #2.
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //------------------------------Ejercicio 1 --------------------
        int x = 10;
        int n = 6;
        System.out.println(P1.calcCosI(x, n)); //
        System.out.println(P1.serieTaylor(x, n, 0, 0)); //
        //------------------------------Ejercicio 2 --------------------
        P2_Menu ejercicio2 = new P2_Menu();
        ejercicio2.camisasPrueba(); //Son una serie de camisas agregadas de forma inicial.
        ejercicio2.mostrarMenu();
        //------------------------------Ejercicio 3--------------------
        
        
    }

}
