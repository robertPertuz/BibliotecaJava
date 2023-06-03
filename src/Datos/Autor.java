package Datos;

import java.io.Serializable;

public class Autor extends Persona implements Serializable {

    private String paisOrigen;

    public Autor(String identificacion, String nombre, String apellido, String paisOrigen) {
        super(nombre, apellido, identificacion);
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

}
