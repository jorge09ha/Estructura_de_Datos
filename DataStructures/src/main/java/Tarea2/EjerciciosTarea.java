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
     * sumatoria.
     *
     * @param numeros Arrelo con los numeros
     * @param i Indice
     * @param sumatoria sumatoria de la sumatoria
     * @return se retorna el sumatoria
     */
    public static int ejercicio4(int[] numeros, int i, int sumatoria) {
        if (i < numeros.length) {
            sumatoria = numeros[i] + sumatoria;
            sumatoria = ejercicio4(numeros, i + 1, sumatoria);
            return sumatoria;
        }
        return sumatoria;
    }

    /**
     * 5.Escriba un programa que permita, mediante la utilización de
     * recursividad, mostrar las tablas de multiplicar.
     *
     * @param multiplicando
     * @param multiplicador
     */
    public static void ejercicio5(int multiplicando, int multiplicador) {
        int resultado;
        if (multiplicador <= 10) {
            resultado = multiplicando * multiplicador;
            System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);
            ejercicio5(multiplicando, multiplicador + 1);
        }
    }

    /**
     * Variante del ejercicio 5, en este caso imprime las maximo hasta la del 9.
     *
     * @param factor1 es multiplicando
     * @param factor2 es multiplicador
     */
    public static void ejercicio5_Ej2(int factor1, int factor2) {
        int resultado;

        if (factor1 < 10) {
            if (factor2 <= 10) {
                resultado = factor1 * factor2;
                System.out.println(factor1 + " x " + factor2 + " = " + resultado);//PRINT---------------------
                ejercicio5_Ej2(factor1, factor2 + 1);
            } else {
                factor2 = 0;
                factor1 = factor1 + 1;
                if (factor1 < 10) {
                    System.out.println("\nTabla del " + factor1);
                }
                ejercicio5_Ej2(factor1, factor2);
            }
        } else {
            System.out.println("FIN");
        }
    }

}
