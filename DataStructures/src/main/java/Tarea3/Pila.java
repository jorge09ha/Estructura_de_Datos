package Tarea3;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class Pila {

    private Nodo top;

    //me permite agregar un objeto a la pila
    public void push(String talla, String color, String marca, String lugar_confeccion, String tipo) {

        Nodo newCamisa = new Nodo(talla, color, marca, lugar_confeccion, tipo);
        newCamisa.setTalla(talla);
        newCamisa.setColor(color);
        newCamisa.setMarca(marca);
        newCamisa.setLugar_confeccion(lugar_confeccion);
        newCamisa.setTipo(tipo);

        if (top == null) {

            top = newCamisa;

        } else {

            if (top.getTalla().equalsIgnoreCase(newCamisa.getTalla()) || top.getColor().equalsIgnoreCase(newCamisa.getColor())) {
                System.err.println("\nLa talla o el color de la camisa no debe ser igual a la camisa anterior");
                System.err.println("NO SE AGREGO LA CAMISA");

            } else {

                if (newCamisa.getMarca().equalsIgnoreCase("bunny")) {
                    System.out.println("\nLa camisa es Bunny. Se coloda debajo de TOP.");
                    Nodo tempTop = new Nodo(top.getTalla(), top.getColor(), top.getMarca(), top.getLugar_confeccion(), top.getTipo());
                    pop();
                    newCamisa.setNext(top);
                    top = newCamisa;
                    tempTop.setNext(top);
                    top = tempTop;
                } else {
                    newCamisa.setNext(top);
                    top = newCamisa;
                }
            }
        }

    }

    public void pop() {
        Nodo poppedValue = top;
        if (top != null) {
            top = top.getNext();
        }
    }

    //me permite mostrar todos los datos de la pila
    public void mostrarPila() {
        Nodo aux = top;
        String cadena = "\nPila de camisas\n";

        while (aux != null) {
            cadena += "{" + "\"Talla:\": " + aux.getTalla()
                    + " \"Color:\" " + aux.getColor()
                    + " \"Marca:\" " + aux.getMarca()
                    + " \"Lugar:\" " + aux.getLugar_confeccion()
                    + " \"Tipo:\" " + aux.getTipo() + " }\n";
            aux = aux.getNext();
        }
        System.out.println("*".repeat(70) + cadena + "*".repeat(70));
    }

    public void tallaMasRepetida() {
        Nodo aux = top;
        
        int indexMayor = 0;
        String masRepetida = null;
        
        int[] iArr = {0, 0, 0, 0, 0, 0, 0};
        String[] tallas = {"XS", "S", "M", "L", "XL", "XXL", "Otras"};

        while (aux != null) {
            if (aux.getTalla().equalsIgnoreCase("xs")) {
                iArr[0]++;
                aux = aux.getNext();
            } else if (aux.getTalla().equalsIgnoreCase("s")) {
                iArr[1]++;
                aux = aux.getNext();
            } else if (aux.getTalla().equalsIgnoreCase("m")) {
                iArr[2]++;
                aux = aux.getNext();
            } else if (aux.getTalla().equalsIgnoreCase("l")) {
                iArr[3]++;
                aux = aux.getNext();
            } else if (aux.getTalla().equalsIgnoreCase("xl")) {
                iArr[4]++;
                aux = aux.getNext();
            } else if (aux.getTalla().equalsIgnoreCase("xxl")) {
                iArr[5]++;
                aux = aux.getNext();
            } else {
                iArr[6]++;
                aux = aux.getNext();
            }
        }

        for (int i = 0; i < iArr.length; i++) {
            if (indexMayor < iArr[i]) {
                indexMayor = i;
                masRepetida = tallas[i];
            }
        }
        System.out.println("\nLa talla mas repetida es: " + masRepetida);
    }
}
