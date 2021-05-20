package paquete4;

import paquete4.Hospital;

/**
 *
 * @author 0zzda
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.txt";
        Hospital h1 = new Hospital("Hospital Puyo", 5, 20);
        Hospital h2 = new Hospital("Hospital IESS", 10, 50.99);
        Hospital h3 = new Hospital("Hospital Militar", 15, 80.90);

        Hospital[] lista = {h1, h2, h3};

        EscrituraArchivosSecuencial archivo = new EscrituraArchivosSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
    }
}
