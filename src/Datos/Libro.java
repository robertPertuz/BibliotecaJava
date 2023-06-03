package Datos;

import java.io.Serializable;

public class Libro implements Serializable {

    private String titulo, categoria, isbn;
    private int añoPublicacion, cantidad;
    private double precio;
    private Editorial editorial;
    private Autor autor;
    private Proveedor proveedor;

    public Libro(String titulo, String categoria, String isbn, int añoPublicacion, int cantidad, double precio, Editorial editorial, Autor autor, Proveedor proveedor) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.editorial = editorial;
        this.autor = autor;
        this.proveedor = proveedor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

}
