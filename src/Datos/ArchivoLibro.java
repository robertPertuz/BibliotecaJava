package Datos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoLibro {

    public static String guardarLibro(ArrayList<Libro> libro) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Libro.Biblioteca"));
            escritor.writeObject(libro);
            escritor.close();
            return "OK";
        } catch (IOException e) {
            return "No se pudo guardar en el archivo binario";
        }

    }

    public static ArrayList<Libro> getLibro() {
        ArrayList<Libro> libro = null;
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Libro.Biblioteca"));
            libro = (ArrayList<Libro>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }
        return libro;
    }
}
