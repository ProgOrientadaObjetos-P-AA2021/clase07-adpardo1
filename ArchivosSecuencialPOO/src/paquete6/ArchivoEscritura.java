package paquete6;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import paquete6.Hospital;

/**
 *
 * @author 0zzda
 */
public class ArchivoEscritura {
    private String nombreArchivo;
    private String rutaArchivo;
    private Hospital registro;
    private Formatter salidaArchivo;

    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s",
                obtenerNombreArchivo());
        
        // sacar la información del archivo, previo a volver 
        // a trabajar con el mimso.
        establecerInformacionAnterior();
        
        
    }

    public void establecerInformacionAnterior() {
        
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        ArrayList<Hospital> lista = lectura.obtenerLista();
        
        try {
            salidaArchivo = new Formatter(rutaArchivo);
            if (lista != null) {
                
                if (lista.size() > 0) {
                    for (int i = 0; i < lista.size(); i++) {
                        Hospital h1 = lista.get(i);
                        establecerRegistro(h1);
                        establecerSalida();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer del archivo: " + e);

        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());;
    }

    public void establecerRegistro(Hospital n) {
        registro = n;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public Hospital obtenerRegistro() {
        return registro;
    }
    public void establecerSalida() {
        try {
            Hospital h1 = obtenerRegistro();
            String cadenaRegistro = String.format("%s;%d;%f",
                    h1.obtenerNombre(), h1.obtenerNumeroCamas(),
                    h1.obtenerPresupuesto());
            salidaArchivo.format("%s\n", cadenaRegistro);

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.err.println(e);

        }
    }
    public void cerrarArchivo() {
        if (salidaArchivo != null) {
            salidaArchivo.close();
        }
    }
}
