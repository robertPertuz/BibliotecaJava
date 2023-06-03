package Datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoAutor {

    public static String guardarAutor(ArrayList<Autor> autor) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Autor.Biblioteca"));
            escritor.writeObject(autor);
            escritor.close();
            return "OK";
        } catch (IOException e) {
            return "No se pudo guardar en el archivo binario";
        }

    }

    public static ArrayList<Autor> getAutor() {
        ArrayList<Autor> autor = null;
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Autor.Biblioteca"));
            autor = (ArrayList<Autor>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }
        return autor;
    }

}
