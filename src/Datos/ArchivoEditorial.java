package Datos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoEditorial {

    public static String guardarEditorial(ArrayList<Editorial> listaEditorial) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Editorial.Biblioteca"));
            escritor.writeObject(listaEditorial);
            escritor.close();
            return "OK";
        } catch (IOException e) {
            return "No se pudo guardar en el archivo binario";
        }

    }

    public static ArrayList<Editorial> getEditorial() {
        ArrayList<Editorial> editorial = null;
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Editorial.Biblioteca"));
            editorial = (ArrayList<Editorial>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }
        return editorial;

    }

}
