package Tarea3;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class P1 {

//Iterativo ----------------------------------------------------------------------------------------------
    public static double Fact(int num) {
        double result = 1.0;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static double calcCosI(int x, int n) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result += (Math.pow(-1, n) / Fact(2 * n)) * Math.pow(x, 2 * n);
        }
        return result;
    }

//Recursivo----------------------------------------------------------------------------------------------
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double serieTaylor(int x, int n, int i, double result) {
        if (i < n) {
            result += (Math.pow(-1, n) / factorial(2 * n)) * Math.pow(x, 2 * n);
            System.out.println(i+" "+result);
            result = serieTaylor(x, n, i + 1, result);
        } 
        return result;
    }
}
