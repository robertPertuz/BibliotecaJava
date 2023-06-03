package Datos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoProveedor {

    public static String guardarProveedor(ArrayList<Proveedor> proveedor) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Proveedor.Biblioteca"));
            escritor.writeObject(proveedor);
            escritor.close();
            return "OK";
        } catch (IOException e) {
            return "No se pudo guardar en el archivo binario";
        }

    }

    public static ArrayList<Proveedor> getProveedor() {
        ArrayList<Proveedor> proveedor = null;
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Proveedor.Biblioteca"));
            proveedor = (ArrayList<Proveedor>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }
        return proveedor;

    }

}
