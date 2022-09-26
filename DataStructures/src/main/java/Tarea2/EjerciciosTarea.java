package Tarea2;

/**
 *
 * @author jorge.hernandez
 */
public class EjerciciosTarea {

    /**
     * 1. Escriba un programa que, utilizando recursividad, permita invertir las
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
     * 2. Escriba un programa que imprima recursivamente un String letra por
     * letra.
     *
     * @param data Palabra o frace
     * @param indice Pocicion de referencia
     */
    public static void ejercicio2(String data, int indice) {

        if (indice != data.length()) {
            System.out.print(data.charAt(indice) + " ");
            ejercicio2(data, indice + 1);
        } else {
            System.out.println("\n**Fin**");
        }
    }

    /**
     * 3. Escriba un programa que permita llenar un vector recursivamente y de
     * la misma forma mostrar su contenido y calcular el mayor valor almacenado
     * también recursivamente.
     */
    /**
     * 4.Escriba un programa que sume N números recursivamente y muestre el
     * resultado.
     *
     * @param numeros Arrelo con los numeros
     * @param i Indice
     * @param resultado resultado de la sumatoria
     * @return se retorna el resultado
     */
    public static void ejercicio4(int[] numeros, int i, int resultado) {
        if (i < numeros.length) {
            resultado = numeros[i] + resultado;
            System.out.println(numeros[i]+"+"+resultado);
            ejercicio4(numeros, i + 1, resultado);
        } else {
            System.out.println("El resultado es: " + resultado);
        }
    }
    /**
     * 5. Escriba un programa que permita, mediante la utilización de
     * recursividad, mostrar las tablas de multiplicar.
     */

}
