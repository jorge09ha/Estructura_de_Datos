package Tarea3;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class P3_Nodo {

    String sector;
    int cedula, hora;
    P3_Nodo next;
    P3_Nodo back;

    public P3_Nodo(String sector, int cedula, int hora) {
        this.sector = sector;
        this.cedula = cedula;
        this.hora = hora;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public P3_Nodo getNext() {
        return next;
    }

    public void setNext(P3_Nodo next) {
        this.next = next;
    }

    public P3_Nodo getBack() {
        return back;
    }

    public void setBack(P3_Nodo back) {
        this.back = back;
    }

}
