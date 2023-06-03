package Datos;

import java.io.Serializable;
import java.util.ArrayList;

public class Prestamo implements Serializable {

    private Persona persona;
    private Libro libro;
    private String fechaEntrega, fechaDevolucion;

    public Prestamo(Persona persona, Libro libro, String fechaEntrega, String fechaDevolucion) {
        this.persona = persona;
        this.libro = libro;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Prestamo() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

}
