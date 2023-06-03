package Datos;

import java.io.Serializable;

public class Editorial implements Serializable {

    private String nombre, ciudad, correo, telefono, codigo;

    public Editorial(String nombre, String ciudad, String correo, String telefono, String codigo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.codigo = codigo;
    }

    public Editorial() {
    }

    ;
    
    
    
    
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
