package Tarea3;

import Tarea3.P3_Nodo;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class P3_Cola {

    private P3_Nodo head;
    private P3_Nodo tail;
    private int cuentaPalco, cuentaSombra, cuentaSol;

    public void enqueue(String sector, int hora, int cedula) {
        P3_Nodo newUsuario = new P3_Nodo(sector, hora, cedula);
        if (head == null) {
            head = newUsuario;
            tail = newUsuario;
        } else {
            tail.setNext(newUsuario);
            tail = newUsuario;
        }
    }

    public void colaOriginal() {

        P3_Nodo aux = head;
        String cadena = "\nCola original\n";

        while (aux != null) {
            cadena += "{" + "\"Sector:\": " + aux.getSector()
                    + " \"Hora:\" " + aux.getHora()
                    + " \"Cedula:\" " + aux.getCedula() + " }\n";
            if ("Palco".equals(aux.sector)) {
                cuentaPalco++;
            }
            if ("Sombra".equals(aux.sector)) {
                cuentaSombra++;
            }
            if ("Sol".equals(aux.sector)) {
                cuentaSol++;
            }
            aux = aux.getNext();
        }
        System.out.println("*".repeat(70) + cadena + "*".repeat(70));
        System.out.println("Palco: " + cuentaPalco + " Sombra: " + cuentaSombra + " Sol: " + cuentaSol);
    }

    public void ordenar() {

        P3_Nodo aux = head;
        String cadena = "\nCola de entrada\n";

        while (aux != null) {
            if ("Palco".equalsIgnoreCase(aux.sector)) {
                cadena += "{" + "\"Sector:\": " + aux.getSector()
                        + " \"Hora:\" " + aux.getHora()
                        + " \"Cedula:\" " + aux.getCedula() + " }\n";
                aux = aux.getNext();
            } else {
                aux = aux.getNext();
            }
        }
        aux = head;
        while (aux != null) {
            if ("Sombra".equalsIgnoreCase(aux.sector)) {
                cadena += "{" + "\"Sector:\": " + aux.getSector()
                        + " \"Hora:\" " + aux.getHora()
                        + " \"Cedula:\" " + aux.getCedula() + " }\n";
                aux = aux.getNext();
            } else {
                aux = aux.getNext();
            }
        }
        aux = head;
        while (aux != null) {
            if ("Sol".equalsIgnoreCase(aux.sector)) {
                cadena += "{" + "\"Sector:\": " + aux.getSector()
                        + " \"Hora:\" " + aux.getHora()
                        + " \"Cedula:\" " + aux.getCedula() + " }\n";
                aux = aux.getNext();
            } else {
                aux = aux.getNext();
            }
        }
        System.out.println("*".repeat(70) + cadena + "*".repeat(70));
    }

}
