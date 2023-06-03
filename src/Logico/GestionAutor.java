package Logico;

import Datos.ArchivoAutor;
import Datos.Autor;
import Datos.ConexionOracol;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GestionAutor {

    public static String registrarAutor(String id, String nombre, String apellido, String pais) throws SQLException {
        String respuesta = validarAutor(id, nombre, apellido, pais);
        if (respuesta.equals("OK")) {
            Autor autor = new Autor(id, nombre, apellido, pais);
            ArrayList<Autor> lista = ArchivoAutor.getAutor();
            if (lista == null) {
                lista = new ArrayList<>();
            }

            lista.add(autor);
            ArchivoAutor.guardarAutor(lista);

            ConexionOracol co = new ConexionOracol();
            co.conectar();
            co.registrarDatosBD(autor);
            co.close();
        }
        return respuesta;

    }

    private static String validarAutor(String id, String nombre, String apellido, String pais) {
        if (id.trim().length() < 3) {
            return "identificación invalida";
        }
        if (nombre.trim().length() < 3) {
            return "ingrese un nombre valido";
        }
        if (apellido.trim().length() < 3) {
            return "Apellido invalido";
        }
        if (pais.trim().length() < 3) {
            return "ingrese un pais valido";
        } else {
            return "OK";
        }

    }

    public static String eliminarAutor(String id) {
        ArrayList<Autor> listaAutor = ArchivoAutor.getAutor();
        for (Autor a : listaAutor) {
            if (a.getIdentificacion().equals(id)) {
                listaAutor.remove(a);
                ArchivoAutor.guardarAutor(listaAutor);
                return "ELiminado correctamente";
            }

        }
        return "no encontrado";

    }

    public static DefaultTableModel getModeloAutor() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"Identificacion", "Nombre", "Apellido", "Pais de origen"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Autor> lista = ArchivoAutor.getAutor();
        if (lista != null) {
            for (Autor a : lista) {
                String[] fila = {a.getIdentificacion(), a.getNombre(), a.getApellido(), a.getPaisOrigen()};
                modelo.addRow(fila);
            }
        }

        return modelo;
    }

}
