package Datos;

import java.awt.HeadlessException;
import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nemer Velandia
 */
public class ConexionOracol {

    String user;
    String pass;
    String url;
    Connection conexion;
    Statement stm;
    CallableStatement cst;

    public ConexionOracol() {
        user = "nvelandia";
        pass = "7710";
        url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
        conexion = null;
        stm = null;
        cst = null;

    }

    public void registrarDatosBD(Autor autor) throws SQLException {

        try {

            conectar();
            cst = getConexion().prepareCall("{call package_insertar_registros.registro_autor(?,?,?,?)}");
            if (cst != null) {
                cst.setString(1, autor.getIdentificacion());
                cst.setString(2, autor.getNombre());
                cst.setString(3, autor.getApellido());
                cst.setString(4, autor.getPaisOrigen());
                cst.execute();
                cst.close();
                getConexion().close();
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "NULL registro NO agregado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void registrarDatosBD(Editorial editorial) throws SQLException {

        try {

            conectar();
            cst = getConexion().prepareCall("{call package_insertar_registros.registro_editorial(?,?,?,?,?)}");
            if (cst != null) {
                cst.setString(1, editorial.getCodigo());
                cst.setString(2, editorial.getNombre());
                cst.setString(3, editorial.getCiudad());
                cst.setString(4, editorial.getTelefono());
                cst.setString(5, editorial.getCorreo());
                cst.execute();
                cst.close();
                getConexion().close();
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "NULL registro NO agregado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void registrarDatosBD(HistorialPrestamos historial) throws SQLException {

        try {

            conectar();
            cst = getConexion().prepareCall("{call package_insertar_registros.registro_historial(?,?,?,?)}");
            if (cst != null) {
                cst.setString(1, historial.getFechaEntrega());
                cst.setString(2, historial.getFechaDevolucion());
                cst.setString(3, historial.getLibro().getIsbn());
                cst.setString(4, historial.getPersona().getIdentificacion());

                cst.execute();
                cst.close();
                getConexion().close();
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "NULL registro NO agregado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void registrarDatosBD(Libro libro) throws SQLException {

        try {

            conectar();
            cst = getConexion().prepareCall("{call package_insertar_registros.registro_libro(?,?,?,?,?,?,?)}");
            if (cst != null) {
                cst.setString(1, libro.getIsbn());
                cst.setString(2, libro.getTitulo());
                cst.setInt(3, libro.getCantidad());
                cst.setString(4, libro.getAñoPublicacion() + "");
                cst.setString(5, libro.getEditorial().getCodigo());
                cst.setString(6, libro.getAutor().getIdentificacion());
                cst.setString(7, libro.getCategoria());

                cst.execute();
                cst.close();
                getConexion().close();
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "NULL registro NO agregado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void registrarDatosBD(Persona persona) throws SQLException {

        try {

            conectar();
            cst = getConexion().prepareCall("{call package_insertar_registros.registro_usuario(?,?,?,?,?,?,?,?,?)}");
            if (cst != null) {
                cst.setString(1, persona.getIdentificacion());
                cst.setString(2, persona.getNombre());
                cst.setString(3, persona.getsNombre());
                cst.setString(4, persona.getApellido());
                cst.setString(5, persona.getsApellido());
                cst.setString(6, persona.getFechaNacimiento());
                cst.setString(7, persona.getCargo());
                cst.setString(8, persona.getDireccion());
                cst.setString(9, persona.getTelefono());

                cst.execute();
                cst.close();
                getConexion().close();
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "NULL registro NO agregado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void registrarDatosBD1(Prestamo prestamo) throws SQLException {

        try {

            conectar();
            cst = getConexion().prepareCall("{call package_insertar_registros.registro_prestamos(?,?,?,?)}");
            if (cst != null) {
                cst.setString(1, prestamo.getFechaEntrega());
                cst.setString(2, prestamo.getFechaDevolucion());
                cst.setString(3, prestamo.getPersona().getIdentificacion());
                cst.setString(4, prestamo.getLibro().getIsbn());

                cst.execute();
                cst.close();
                getConexion().close();
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "NULL registro NO agregado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void registrarDatosBD(Proveedor proveedor) throws SQLException {

        try {

            conectar();
            cst = getConexion().prepareCall("{call package_insertar_registros.registro_proveedor(?,?,?,?)}");
            if (cst != null) {
                cst.setString(1, proveedor.getIdentificacion());
                cst.setString(2, proveedor.getNombre());
                cst.setString(3, proveedor.getApellido());
                cst.setString(4, proveedor.getTelefono());

                cst.execute();
                cst.close();
                getConexion().close();
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "NULL registro NO agregado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void close() throws SQLException {
        conexion.close();
    }

    public Connection getConexion() {
        return conexion;
    }

    public void conectar() throws SQLException {

        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conexion = DriverManager.getConnection(url, user, pass);
            // JOptionPane.showMessageDialog(null, "Conexion realizada");
        } catch (HeadlessException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se realizo la conexion");
        }

    }

}
