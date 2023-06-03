package Datos;

import java.util.ArrayList;

public class HistorialPrestamos extends Prestamo {

    private Prestamo prestamo;

    public HistorialPrestamos(Prestamo prestamos, String fechaDevolucion) {
        super(prestamos.getPersona(), prestamos.getLibro(), prestamos.getFechaEntrega(), fechaDevolucion);
    }

    public HistorialPrestamos() {
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    /**
     * @param prestamo the prestamo to set
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

}
