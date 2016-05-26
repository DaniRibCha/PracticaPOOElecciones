/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio.Eleccion;

import java.util.Arrays;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import practicapoojunio.Formacion.Formacion;
import practicapoojunio.Eleccion.Circuscripcion;

/**
 *
 * @author Dani
 */

public class Eleccion extends Observable {
    public String nombre;
    public int totalescaños;
    public double participacion;
    public TablaVotos resultados_total_votoselec;
    public TablaEscaños resultados_total_escañoselec;
    public ArrayList<Circuscripcion> circuscripciones;
    public ArrayList<Formacion> formacionesE;

    public Eleccion(String nombre, int totalescaños) {
        this.nombre = nombre;
        this.totalescaños = totalescaños;
    }
    
    public Eleccion(String nombre, int totalescaños, ArrayList<Circuscripcion> circuscripciones, ArrayList<Formacion> formacionesE){
        this.nombre = nombre;
        this.totalescaños = totalescaños;
        this.circuscripciones =new ArrayList<>();
        for (int i = 0; i < circuscripciones.size(); i++) // Recorremos el argumento formacion del constructor asignando valor por valor al atributo
            this.circuscripciones.add(circuscripciones.get(i));
        this.formacionesE = new ArrayList<>();
        for (int i = 0; i < formacionesE.size(); i++)
            this.formacionesE.add(formacionesE.get(i));
    }
    
    public Eleccion(String nombre, int totalescaños, ArrayList<Circuscripcion> circuscripciones){
        this.nombre = nombre;
        this.totalescaños = totalescaños;
        this.circuscripciones =new ArrayList<>();
        for (int i = 0; i < circuscripciones.size(); i++) // Recorremos el argumento formacion del constructor asignando valor por valor al atributo
            this.circuscripciones.add(circuscripciones.get(i));
        ArrayList<Formacion> formations = new ArrayList<>();
        for (int i = 0; i<circuscripciones.size(); i++){
            for (int j = 0; j<circuscripciones.get(i).formacionesC.size(); j++){
                Formacion elem = circuscripciones.get(i).formacionesC.get(j);
                if (!(formations.contains(elem))){
                    formations.add(elem);
                }       
            }
        }
    }
    
    
    public void addCircuscripciones(Circuscripcion c){
        circuscripciones.add(c);
    }
    
    public void addFormacion(Formacion f){
        formacionesE.add(f);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPoblacionTotal(){
        int poblacionTotal = 0;
        for (int i = 0; i<circuscripciones.size(); i++){
            poblacionTotal += circuscripciones.get(i).poblacion;
        }
        return poblacionTotal;
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
        for (int i = 0; i<circuscripciones.size(); i++){
            participacion += circuscripciones.get(i).participacion;
        }
    }

    public ArrayList<Circuscripcion> getCircuscripciones() {
        return circuscripciones;
    }

    public void setCircuscripciones(ArrayList<Circuscripcion> circuscripciones) {
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