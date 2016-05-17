/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio.Eleccion;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Dani
 */
public class Circuscripcion{
   
    public int poblacion;
    public int escaños;
    public TablaVotos resultados_total_votos;
    public TablaEscaños resultados_total_escaños;

    public Circuscripcion(int poblacion, int escaños, TablaVotos resultados_total_votos, TablaEscaños resultados_total_escaños) {
        this.poblacion = poblacion;
        this.escaños = escaños;
        this.resultados_total_votos = resultados_total_votos;
        this.resultados_total_escaños = resultados_total_escaños;
    }


    
    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getEscaños() {
        return escaños;
    }

    public void setEscaños(int escaños) {
        this.escaños = escaños;
    }
    
    public ItemTablaEscaños[] CalcularResultados (ItemTablaVotos[] votos, ItemTablaEscaños[] esc, Eleccion eleccion){
        int numeroVotos;
        int copiaVotos;
        int maxElem;
        int indice;
        int esca;                                                               /*Pasamos los arrays a arraylists(AL)*/
       ArrayList<Integer> votes = new ArrayList<>();
        int i;
        for (i=0; i<votos.length; i++)
            votes.add(votos[i].numeroVotos);

        ArrayList copy = (ArrayList) votes.clone();
        ArrayList<Integer> sits = new ArrayList<>();
        escaños = getEscaños();
    
        
        for (escaños=0; escaños<eleccion.totalescaños; escaños++){              /*Sistema D'Hondt*/
            maxElem = (int) Collections.max(copy);
            indice = copy.indexOf(maxElem);
            copiaVotos = (int) copy.get(indice);
            numeroVotos = votes.get(indice);
            esca= sits.get(indice);
            sits.set(indice,(esca+1));
            copy.set(indice, numeroVotos/((numeroVotos/copiaVotos)+1));
        }
        for (int x=0; x<sits.size(); x++){                                      /*[]  -->  AL*/
            esc[x].numeroEscaños = sits.get(x);
        }
        return esc;
    }
    
    
    
    
    public ItemTablaVotos[] SimularResultados(){
        return null;
        
    }
    
    public void CalcularListas(ItemTablaVotos[] tablavotos){
         for (int i = 0; i < tablavotos.length; i++){
             
             
        }
    }
    
    static void  ImprimirTablaVotos(ItemTablaVotos[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ".Nombre Formacion  " + array[i].formacionPolitica.Nombre + " - Siglas: " + array[i].formacionPolitica.Siglas+ " - Votos: " + array[i].formacionPolitica.Logo+ array[i].numeroVotos);
        }
    } /*opcional*/ 
    
     static void  ImprimirTablaEscaños(ItemTablaEscaños[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ".Nombre Formacion  " + array[i].formacionPolitica.Nombre + " - Siglas: " + array[i].formacionPolitica.Siglas+ " - Votos: " + array[i].formacionPolitica.Logo+ array[i].numeroEscaños);
        }
    } /*opcional*/
}
    
    
    
    
    

