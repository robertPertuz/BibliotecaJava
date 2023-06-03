package Datos;

import java.io.Serializable;

public class Proveedor extends Persona implements Serializable {

    public Proveedor(String nombre, String apellido, String identificacion, String teelefono) {
        super(nombre, apellido, identificacion, teelefono);
    }

}
