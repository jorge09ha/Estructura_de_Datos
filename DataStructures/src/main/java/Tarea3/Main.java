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
 * P3_Cola = Es el nodo de camisas del ejercicio #3. P3_Nodo = Tiene una metodo
 * para encolar a las personas del ejercicio #3. Y imprime el orden de
 * prioridad,
 *
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //------------------------------Ejercicio 1 --------------------
//        int x = 10;
//        int n = 6;
//        System.out.println(P1.calcCosI(x, n)); //
//        System.out.println(P1.serieTaylor(x, n, 0, 0)); //
        //------------------------------Ejercicio 2 --------------------
//        P2_Menu ejercicio2 = new P2_Menu();
//        ejercicio2.camisasPrueba(); //Son una serie de camisas agregadas de forma inicial.
//        ejercicio2.mostrarMenu();
        //------------------------------Ejercicio 3
        P3_Cola colaD = new P3_Cola();

        colaD.enqueue("Sol", 15, 4321);
        colaD.enqueue("Sombra", 15, 3456);
        colaD.enqueue("Sombra", 19, 2222);
        colaD.enqueue("Palco", 10, 2356);
        colaD.enqueue("Sol", 14, 7456);
        colaD.enqueue("Sombra", 19, 2220);
        colaD.enqueue("Palco", 12, 1232);
        colaD.enqueue("Palco", 13, 3498);
        colaD.enqueue("Sol", 15, 3333);
        colaD.enqueue("Sol", 15, 2118);
        colaD.enqueue("Palco", 12, 1111);

        colaD.colaOriginal();
        colaD.ordenar();

    }

}
