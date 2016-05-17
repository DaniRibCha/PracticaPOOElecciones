/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio.Eleccion;

import java.util.Arrays;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Ruben
 */
public class Eleccion extends Observable {
    public String nombre;
    public int totalescaños;
    public double participacion;
    public TablaVotos resultados_total_votoselec;
    public TablaEscaños resultados_total_escañoselec;
    public ArrayList<Circuscripcion> circuscripciones;

    public Eleccion(String nombre, int totalescaños, double participacion, TablaVotos resultados_total_votoselec, TablaEscaños resultados_total_escañoselec, ArrayList<Circuscripcion> circuscripciones) {
        this.nombre = nombre;
        this.totalescaños = totalescaños;
        this.participacion = participacion;
        this.resultados_total_votoselec = resultados_total_votoselec;
        this.resultados_total_escañoselec = resultados_total_escañoselec;
        this.circuscripciones = circuscripciones;
    }

  

    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalescaños() {
        return totalescaños;
    }

    public void setTotalescaños(int totalescaños) {
        this.totalescaños = totalescaños;
    }

    public double getParticipacion() {
        return participacion;
    }

    public void setParticipacion(double participacion) {
        this.participacion = participacion;
    }

   

    public ArrayList<Circuscripcion> getCircuscripciones() {
        return circuscripciones;
    }

    public void setCircuscripciones(ArrayList<Circuscripcion> circuscripsiones) {
        this.circuscripciones = circuscripciones;
    }
    
    public void AsignarEscaños(Circuscripcion circ){
        int poblaciontotal = 0;
        int a = 0;
        for (int i = 0; i<circuscripciones.size(); i++)
            poblaciontotal = (circuscripciones.get(i).poblacion + poblaciontotal);
        if (circuscripciones.contains(circ))
            a = circuscripciones.indexOf(circ);
        circuscripciones.get(a).escaños = (totalescaños*(circuscripciones.get(a).poblacion/poblaciontotal));
    }
    
    
    public void ImprimirTablaGlobalDeVotos(){

    }

    public void ImprimirTablaGlobalDeEsaños(){

    }

    public void ImprimirListasElectos(){

    }

    public void ImprimirMayorias(){

    }
}    
    

