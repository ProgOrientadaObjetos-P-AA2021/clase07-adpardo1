package paquete4;

import java.io.Serializable;

/**
 *
 * @author 0zzda
 */
public class Hospital implements Serializable {
    String nombre;
    int numCamas;
    double presupuesto;
    
    public Hospital(String nom, int numCam, double presu){
        nombre=nom;
        numCamas = numCam;
        presupuesto = presu;
    }
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNumeroCamas(int n){
        numCamas=n;
    }
    public int getNumeroCamas(){
        return numCamas;
    }
    public void setPresupuesto(double n){
        presupuesto=n;
    }
    public double getPresupuesto(){
        return presupuesto;
    }
    
}
