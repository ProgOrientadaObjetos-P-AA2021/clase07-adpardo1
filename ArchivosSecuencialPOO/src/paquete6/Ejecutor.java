package paquete6;
import paquete6.Hospital;
import paquete6.ArchivoEscritura;
import paquete6.ArchivoLectura;
/**
 *
 * @author 0zzda
 */
public class Ejecutor {
    public static void main(String[] args) {
    Hospital h1 = new Hospital("Hospital Puyo", 5, 20);
    String nombreArchivo = "Hospitales.txt";

    Hospital h2 = new Hospital("Hisidro IESS", 10, 50.99);
    Hospital h3 = new Hospital("Hospital Militar", 15, 80.90);

    Hospital[] lista = {h1, h2, h3};

    ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

    for (int i = 0; i <lista.length ; i++) {      
            archivo.establecerRegistro(lista[i]);
        archivo.establecerSalida();
    }

    archivo.cerrarArchivo ();

    ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);

    lectura.establecerLista ();

    System.out.println (lectura);

    lectura.cerrarArchivo ();
    }
}
