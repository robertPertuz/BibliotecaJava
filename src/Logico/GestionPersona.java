package Logico;

import Datos.ArchivoAutor;
import Datos.ArchivoPersona;
import Datos.Autor;
import Datos.ConexionOracol;
import Datos.Persona;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GestionPersona {

    public static String procesar(String usuario, String pass, String cargo) {

        String resultado = validar(usuario, pass, cargo);
        if (resultado.equals("OK")) {
            return resultado;
        } else {
            return resultado;
        }

    }

    private static String validar(String usuario, String pass, String cargo) {

        if (usuario.length() < 3 || !usuario.equals("NVELANDIA")) {
            return "Usuario invalido";
        } else if (pass.length() < 3 || !pass.equals("12345")) {
            return "La contraseña es invalida";
        }
        return "OK";
    }

    public static String registrarPrestatario(String id, String Pnombre, String Snombre, String Papellido, String Sapellido, String direccioin,
            String Fnacimiento, String cargo, String telefono) throws SQLException {
        String resultado = validarPrestatario(id, Pnombre, Snombre, Papellido, Sapellido, direccioin, Fnacimiento, cargo, telefono);
        ArrayList<Persona> lista = ArchivoPersona.getPrestatario();
        if (lista == null) {
            lista = new ArrayList<>();
        }
        if (resultado.equals("OK")) {
            Persona p = new Persona(Pnombre, Papellido, Snombre, Sapellido, id, direccioin, Fnacimiento, cargo, telefono);
            lista.add(p);
            ArchivoPersona.guardarPrestatario(lista);
            ConexionOracol co = new ConexionOracol();
            co.conectar();
            co.registrarDatosBD(p);
            co.close();
        }

        return resultado;
    }

    private static String validarPrestatario(String id, String Pnombre, String Snombre, String Papellido, String Sapellido, String direccioin,
            String Fnacimiento, String cargo, String telefono) {
        if (id.trim().length() < 3) {
            return "La identificacion es invalida";
        } else if (Pnombre.trim().length() < 3) {
            return "El nombre es invalido ";
        } else if (Snombre.trim().length() < 3) {
            return "El nombre es invalido ";
        } else if (Papellido.trim().length() < 3) {
            return "El nombre es invalido ";
        } else if (Sapellido.trim().length() < 3) {
            return "El nombre es invalido ";
        } else if (direccioin.equals("")) {
            return "Debe ingresar una direccion";
        } else if (Fnacimiento.equals("")) {
            return "Falta la fecha webon";
        } else if (cargo.trim().equals("Seleccionar")) {
            return "Debe seleccionar un cargo";
        } else if (telefono.trim().equals("")) {
            return "Ingrese un telefono";
        } else {
            return "OK";
        }

    }

    public static DefaultTableModel getModeloPersona(ArrayList<Persona> listaPersona) {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"Identificacion", "Nombres", "Apellidos", "Direccion", "Fecha de nacimiento", "cargo", "Telefono"};
        modelo.setColumnIdentifiers(nombreColumnas);

        for (Persona p : listaPersona) {
            String[] fila = {p.getIdentificacion(), p.getNombre() + " " + p.getsNombre(),
                p.getApellido() + " " + p.getsApellido(), p.getDireccion(),
                p.getFechaNacimiento(), p.getCargo(), p.getTelefono()};
            modelo.addRow(fila);
        }
        return modelo;
    }

}
