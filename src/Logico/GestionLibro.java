package Logico;

import Datos.ArchivoAutor;
import Datos.ArchivoEditorial;
import Datos.ArchivoLibro;
import Datos.ArchivoProveedor;
import Datos.Autor;
import Datos.ConexionOracol;
import Datos.Editorial;
import Datos.Libro;
import Datos.Proveedor;
import Formularios.FLibros;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionLibro {

    //registto de libros el listas
    public static String registrarLibro(String titulo, String categoria, String isbn, String añoPublicacion, String cantidad, String precio, Editorial editorial, Autor autor, Proveedor proveedor) {
        String resultado = validarLibro(titulo, categoria, isbn, añoPublicacion, cantidad, precio, editorial, autor, proveedor);

        return resultado;
    }

    //validacion de los datos 
    private static String validarLibro(String titulo, String categoria, String isbn, String añoPublicacion, String cantidad, String precio, Editorial editorial, Autor autor, Proveedor proveedor) {

        if (titulo.trim().length() < 3) {
            return "Titulo invalido";
        } else if (categoria.trim().length() < 3) {
            return "Categoria invalida";
        } else if (isbn.trim().length() < 1) {
            return "ISBN invalido";
        } else if (añoPublicacion.trim().length() < 3) {
            return "El año es invalido";

        } else if (cantidad.trim().length() < 1) {
            return "La cantidad es invalidad";
        } else if (precio.trim().length() < 1) {
            return "El precio es invalido";
        }
        int añoN, cantidadN, precioN;
        try {
            añoN = Integer.parseInt(añoPublicacion);
            if (añoN < 1) {
                return "El año es invalido";
            }
        } catch (NumberFormatException e) {
            return "Solo numero en el año";
        }
        try {
            cantidadN = Integer.parseInt(cantidad);
            if (cantidadN < 1) {
                return "Cantidad invalida";
            }
        } catch (NumberFormatException e) {
            return "Solo numero";
        }
        try {
            precioN = Integer.parseInt(precio);
            if (precioN < 1) {
                return "Precio invalido";
            }
        } catch (NumberFormatException e) {
            return "solo numero";
        }

        return "OK";

    }

    //se llena los datos de una editorial 
    public static Editorial asignarEditorial(int posicion) {
        ArrayList<Editorial> listaEditorial = ArchivoEditorial.getEditorial();
        int contador = 0;
        for (Editorial e : listaEditorial) {
            if (contador == posicion) {
                return e;
            } else {
                contador++;
            }
        }
        return null;
    }

    public static Autor asignarAutor(int posicion) {
        ArrayList<Autor> listaAutores = ArchivoAutor.getAutor();
        int contador = 0;
        for (Autor e : listaAutores) {
            if (contador == posicion) {
                return e;
            } else {
                contador++;
            }
        }
        return null;
    }

    //Se llenan los datos de un proveedor
    public static Proveedor asignarProveedor(int posicion) {
        ArrayList<Proveedor> listaProveedores = ArchivoProveedor.getProveedor();
        int contador = 0;
        for (Proveedor e : listaProveedores) {
            if (contador == posicion) {
                return e;
            } else {
                contador++;
            }
        }
        return null;
    }

    public static DefaultTableModel getModeloLibro(ArrayList<Libro> listaLibros) {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"ISBN", "Titulo", "Categoria", "Editorial", "Autor", "Año Publicacion", "Precio", "Cantidad", "Proveedor"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Libro> lista = ArchivoLibro.getLibro();
        if (lista == null) {

        } else {
            for (Libro l : lista) {

                String[] fila = {l.getIsbn(), l.getTitulo(), l.getCategoria(), l.getEditorial().getNombre(), l.getAutor().getNombre() + " " + l.getAutor().getApellido(),
                    "" + l.getAñoPublicacion(), "" + l.getPrecio(), "" + l.getCantidad(), l.getProveedor().getNombre()};
                modelo.addRow(fila);

            }
        }
        return modelo;
    }

    public static String AgregarLibro(Libro libro) {

        try {
            ArrayList<Libro> listaAgregarLibro = ArchivoLibro.getLibro();
            if (listaAgregarLibro == null) {
                listaAgregarLibro = new ArrayList<>();
            }
            listaAgregarLibro.add(libro);
            ArchivoLibro.guardarLibro(listaAgregarLibro);
            ConexionOracol co = new ConexionOracol();
            co.conectar();
            co.registrarDatosBD(libro);
            co.close();
            return "REGISTRADO CORRECTAMENTE";
        } catch (Exception e) {
            return e + "";
        }
    }

}
