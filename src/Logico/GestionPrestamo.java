package Logico;

import Datos.ArchivoAutor;
import Datos.ArchivoHistorial;
import Datos.ArchivoPrestamo;
import Datos.Autor;
import Datos.ConexionOracol;
import Datos.HistorialPrestamos;
import Datos.Prestamo;
import Formularios.FPrestamo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionPrestamo {

    static ArrayList<Prestamo> listaHistorial = ArchivoHistorial.getHistorial();

    public static DefaultTableModel getModeloPrestamo() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"Identificacion", "NOMBRE", "ISBN", "Titulo", "Fecha de entrega", "Fecha Llimite"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Prestamo> listaPrestamo = ArchivoPrestamo.getPrestamo();
        if (listaPrestamo != null) {
            for (Prestamo prestamo : listaPrestamo) {
                String[] fila = {prestamo.getPersona().getIdentificacion(), prestamo.getPersona().getNombre(),
                    "" + prestamo.getLibro().getIsbn(), "" + prestamo.getLibro().getTitulo(), "" + prestamo.getFechaEntrega(),
                    "" + prestamo.getFechaDevolucion()};
                modelo.addRow(fila);
            }
        }
        return modelo;
    }

    public static String registrarPrestamo(Prestamo prestamo) {
        try {
            ArrayList<Prestamo> listaPrestamo = ArchivoPrestamo.getPrestamo();
            if (listaPrestamo == null) {
                listaPrestamo = new ArrayList<>();
            }
            listaPrestamo.add(prestamo);
            ver(listaPrestamo);
            ArchivoPrestamo.guardarLibro(listaPrestamo);
            ConexionOracol co = new ConexionOracol();
            co.conectar();
            co.registrarDatosBD1(prestamo);
            co.close();
            return "Se ha guardado correctamente";
        } catch (Exception e) {
            return "Ha ocurrido un error " + e;
        }
    }

    public static void ver(ArrayList<Prestamo> listaPrestamo) {
        for (Prestamo prestamo : listaPrestamo) {
            System.out.println(prestamo.getPersona().getIdentificacion());
        }

    }

    public static String validarDevolucion(String dia, String mes, String año) {
        if (dia.equals("Dia")) {
            return "Ingrese la fecha correctamente";
        } else if (mes.equals("Mes")) {
            return "Ingrese la fecha correctamente";
        } else if (año.equals("Año")) {
            return "Ingrese la fecha correctamente";
        } else {
            return "OK";
        }
    }

    public static void devolucion(String identificacion, String fecha, String isbn) {
        try {
            HistorialPrestamos h = new HistorialPrestamos();
            ArrayList<Prestamo> lista = ArchivoPrestamo.getPrestamo();
            int indice = 0;
            if (listaHistorial == null) {
                listaHistorial = new ArrayList<>();
            }
            for (Prestamo p : lista) {
                if (p.getPersona().getIdentificacion().equals(identificacion) && p.getLibro().getIsbn().equals(isbn)) {
                    h = new HistorialPrestamos(p, fecha);
                    listaHistorial.add(h);
                    break;
                }
                indice++;
            }
            if (listaHistorial.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Algo ha ocurrido mal... :c");
            } else {
                ArchivoHistorial.guardarHistorial(listaHistorial);
                lista.remove(indice);
                ArchivoPrestamo.guardarLibro(lista);
                ConexionOracol co = new ConexionOracol();
                co.conectar();
                co.registrarDatosBD(h);
                co.close();
                JOptionPane.showMessageDialog(null, "Devolucion concretada");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ALGO HA OCURRIDO MAL..." + e);

        }
    }

    public static DefaultTableModel getModeloHistorial() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] nombreColumnas = {"Identificacion", "NOMBRE", "ISBN", "Titulo", "Fecha de entrega", "Fecha devolucion"};
        modelo.setColumnIdentifiers(nombreColumnas);
        ArrayList<Prestamo> listaHistorial = ArchivoHistorial.getHistorial();
        if (listaHistorial != null) {
            for (Prestamo prestamo : listaHistorial) {
                String[] fila = {prestamo.getPersona().getIdentificacion(), prestamo.getPersona().getNombre(),
                    "" + prestamo.getLibro().getIsbn(), "" + prestamo.getLibro().getTitulo(), "" + prestamo.getFechaEntrega(),
                    "" + prestamo.getFechaDevolucion()};
                modelo.addRow(fila);
            }
        }
        return modelo;
    }

}
