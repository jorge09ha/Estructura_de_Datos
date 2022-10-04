package Tarea3;

/**
 *
 * @author jorge.hernandez
 */
public class serieTaylor {
//

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            //System.out.println(n);
            return n * factorial(n - 1);
        }
    }

//Interativo
    public static double calcCosI(int x, int n) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result += (Math.pow(-1, n) / Fact(2 * n)) * Math.pow(x, 2 * n);
        }
        return result;
    }

//Interativo
    public static double Fact(int num) {
        double result = 1.0;
        for (int i = 1; i <= num; i++) {
            //System.out.println(result);
            result = result * i;
        }
        return result;
    }


}
