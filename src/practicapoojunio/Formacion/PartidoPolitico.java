/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio.Formacion;

import practicapoojunio.Eleccion.Eleccion;

/**
 *
 * @author Ruben
 */
public class PartidoPolitico extends Formacion {
    
    public String  nombre;
    public String  siglas;
    public String  logo;

    public PartidoPolitico(String nombre, String siglas, String logo, String Nombre, String Siglas, String Logo) {
        super(Nombre, Siglas, Logo);
        this.nombre = nombre;
        this.siglas = siglas;
        this.logo = logo;
    }
    
   


public void Cargarlistas(){}
public void ElaborarListas(Eleccion e){}
public void LanzarEncuestas(){}

}
