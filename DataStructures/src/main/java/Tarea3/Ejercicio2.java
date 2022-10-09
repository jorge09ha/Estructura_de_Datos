package Tarea3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio2 {

    Pila mipila = new Pila();
    String talla, color, marca, lugar_confeccion, tipo;

    public void camisasPrueba() {
        mipila.push("M", "Roja", "Nike", "USA", "Sport");
        mipila.push("L", "Verde", "Puma", "China", "Sport");
    }

    public void mostrarMenu() {

        System.out.print("\n***Menu Lavanderia***\n\n"
                + "1. Agregar una camisa\n"
                + "2. Sacar la ultima camisa\n"
                + "3. Mostrar la pila de camisas\n"
                + "4. Mostrar talla que mas se repite\n"
                + "5. Salir\n"
                + "\nDigite su opcion:");

        Scanner sc = new Scanner(System.in);
        byte opc = Byte.parseByte(sc.nextLine());

        switch (opc) {
            case 1: {
                System.out.print("\nAgrege los detalles de la camisa.\nTalla: ");
                talla = sc.nextLine();
                System.out.print("Color: ");
                color = sc.nextLine();
                System.out.print("Marca: ");
                marca = sc.nextLine();
                System.out.print("Lugar: ");
                lugar_confeccion = sc.nextLine();
                System.out.print("Tipo: ");
                tipo = sc.nextLine();

                mipila.push(talla, color, marca, lugar_confeccion, tipo);
                mostrarMenu();
                break;
            }
            case 2: {
                mipila.pop();
                mostrarMenu();
                break;
            }
            case 3: {
                mipila.mostrarPila();
                mostrarMenu();
                break;
            }
            case 4: {
                //mipila.mayorDeEdad();
                mostrarMenu();
                break;
            }
            case 5: {
                //nombre = sc.nextLine();
                //mipila.buscarPorNombre(nombre);
                mostrarMenu();
                break;
            }
            case 6: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("\nOpcion incorrecta, favor revisar!");
                mostrarMenu();
            }
        }
    }

}
