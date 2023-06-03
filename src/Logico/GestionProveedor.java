package Logico;

import Datos.ArchivoProveedor;
import Datos.ConexionOracol;
import Datos.Proveedor;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GestionProveedor {

    public static String registrarProveedor(String nombre, String apellido, String identificacion, String telefono) throws SQLException {
        String respuesta = validarProveedor(nombre, apellido, identificacion, telefono);
        if (respuesta.equals("OK")) {
            Proveedor p = new Proveedor(nombre, apellido, identificacion, telefono);
            ArrayList<Proveedor> lista = ArchivoProveedor.getProveedor();
            if (lista == null) {
                lista = new ArrayList<>();
            }
            lista.add(p);
            ArchivoProveedor.guardarProveedor(lista);
            ConexionOracol co = new ConexionOracol();
            co.conectar();
            co.registrarDatosBD(p);
            co.close();
        }
        return respuesta;
    }

    private static String validarProveedor(String nombre, String apellido, String identificacion, String telefono) {
        if (nombre.trim().length() < 3) {
            return "Nombre invalido";
        }
        if (apellido.trim().length() < 3) {
            return "Apellido invalido";
        }
        if (identificacion.trim().length() < 3) {
            return "Identificacion invalida";
        }
        if (telefono.trim().length() < 5) {
            return "Ingrese in telefono valido";
        } else {
            return "OK";
        }
    }

    public static DefaultTableModel getModeloProveedor() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"identificacion", "Nombre", "apellido", "Telefono"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Proveedor> lista = ArchivoProveedor.getProveedor();
        if (lista == null) {
            System.out.println("ERROR");
        } else {
            for (Proveedor e : lista) {
                String[] fila = {e.getIdentificacion(), e.getNombre(), e.getApellido(), e.getTelefono()};
                modelo.addRow(fila);
            }
        }
        return modelo;
    }
}
