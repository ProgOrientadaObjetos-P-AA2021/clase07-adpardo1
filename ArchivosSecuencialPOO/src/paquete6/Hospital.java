package paquete6;

/**
 *
 * @author 0zzda
 */
public class Hospital {
    
    String nombre;
    int numeroCamas;
    double presupuesto;
    public Hospital(String nom, int numCa, double presu){
        nombre=nom;
        numeroCamas=numCa;
        presupuesto=presu;
    }
    public void establecerNombre(String n){
        nombre=n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void establecerNumeroCamas(int n){
        numeroCamas=n;
    }
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    public void establecerPresupuesto(double n){
        presupuesto=n;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}

/* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
*/
    

