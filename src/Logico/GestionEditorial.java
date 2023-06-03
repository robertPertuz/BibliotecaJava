package Logico;

import Datos.ArchivoEditorial;
import Datos.ConexionOracol;
import Datos.Editorial;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GestionEditorial {

    public static String registrarEditorial(String nombre, String correo, String ciudad, String telefono, String codigo) throws SQLException {

        String respuesta = validarEditorial(nombre, correo, ciudad, telefono);
        if (respuesta.equals("OK")) {
            Editorial editorial = new Editorial(nombre, ciudad, correo, telefono, codigo);
            ArrayList<Editorial> lista = ArchivoEditorial.getEditorial();
            if (lista == null) {
                lista = new ArrayList<>();
            }
            lista.add(editorial);
            ArchivoEditorial.guardarEditorial(lista);
            ConexionOracol co = new ConexionOracol();
            co.conectar();
            co.registrarDatosBD(editorial);
            co.close();
        }
        return respuesta;

    }

    private static String validarEditorial(String nombre, String correo, String ciudad, String telefono) {
        if (nombre.trim().length() < 3) {
            return "el nombre es invalido";
        } else if (correo.trim().length() < 3) {
            return "Correo invalido";
        } else if (ciudad.trim().length() < 3) {
            return "ingrese una ciudad valida";
        } else if (telefono.trim().length() < 3) {
            return "digite un telefono valido";
        } else {
            return "OK";
        }
    }

    public static DefaultTableModel getModeloEditorial() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"Codigo", "Nombre", "Ciudad", "Correo", "Telefono"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Editorial> lista = ArchivoEditorial.getEditorial();
        if (lista == null) {

        } else {
            for (Editorial e : lista) {
                String[] fila = {e.getCodigo(), e.getNombre(), e.getCiudad(), e.getCorreo(), e.getTelefono()};
                modelo.addRow(fila);
            }

        }
        return modelo;
    }

}
