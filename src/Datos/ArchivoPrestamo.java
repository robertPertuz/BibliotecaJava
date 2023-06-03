package Datos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoPrestamo {

    public static String guardarLibro(ArrayList<Prestamo> prestamo) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Prestamo.Biblioteca"));
            escritor.writeObject(prestamo);
            escritor.close();
            return "OK";
        } catch (IOException e) {
            return "No se pudo guardar en el archivo binario";
        }

    }

    public static ArrayList<Prestamo> getPrestamo() {
        ArrayList<Prestamo> prestamo = null;
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Prestamo.Biblioteca"));
            prestamo = (ArrayList<Prestamo>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }
        return prestamo;
    }

}
