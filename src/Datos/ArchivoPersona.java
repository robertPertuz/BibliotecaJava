package Datos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoPersona {

    public static String guardarPrestatario(ArrayList<Persona> persona) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Persona.Biblioteca"));
            escritor.writeObject(persona);
            escritor.close();
            return "OK";
        } catch (IOException e) {
            return "No se pudo guardar en el archivo binario";
        }

    }

    public static ArrayList<Persona> getPrestatario() {
        ArrayList<Persona> persona = null;
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Persona.Biblioteca"));
            persona = (ArrayList<Persona>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }
        return persona;
    }

}
