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
public class Formacion {
    
    public String Nombre;
    public String Siglas;
    public String Logo;

    public Formacion(String Nombre, String Siglas, String Logo) {
        this.Nombre = Nombre;
        this.Siglas = Siglas;
        this.Logo = Logo;
    }
    
    public Formacion(String siglas){
        this.Siglas = siglas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSiglas() {
        return Siglas;
    }

    public void setSiglas(String siglas) {
        this.Siglas = siglas;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        this.Logo = logo;
    }
    
public void ElaborarListas(Eleccion e){}    
    
}
