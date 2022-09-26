package Tarea2;

/**
 *
 * @author jorge.hernandez
 */
public class EjerciciosTarea {

    /**
     * Escriba un programa que, utilizando recursividad, permita invertir las
     * cifras de un número.Muestre el número con sus cifras invertidas.
     *
     * @param a Es el valor de referencia
     * @return
     */
    public static String ejercicio1(int a) { //regresa String
        if (a == 0) {
            return "";
        } else {
            String invertir = (a % 10) + ejercicio1(a / 10);
            //System.out.println(a + " " + invertir);
            return invertir;
        }
    }

    /**
     * Escriba un programa que imprima recursivamente un String letra por letra.
     *
     * @param data
     * @param indice
     */
    public static void ejercicio2(String data, int indice) {

        if (indice != data.length()) {
            System.out.print(data.charAt(indice)+" ");
            ejercicio2(data, indice + 1);
        }else{
            System.out.println("\n**Fin**");
        }
    }

}
