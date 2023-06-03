package Datos;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre, apellido, sNombre, sApellido, identificacion, direccion, fechaNacimiento, cargo, telefono;

    public Persona(String nombre, String apellido, String sNombre, String sApellido, String identificacion, String direccion, String fechaNacimiento, String cargo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.cargo = cargo;
        this.telefono = telefono;
    }

    public Persona(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    public Persona(String nombre, String apellido, String identificacion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
