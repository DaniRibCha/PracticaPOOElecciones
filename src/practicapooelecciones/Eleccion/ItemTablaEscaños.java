/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapooelecciones.Eleccion;

import practicapooelecciones.Formacion.Formacion;

/**
 *
 * @author Adri
 */
public class ItemTablaEscaños {
    public Formacion formacionPolitica;
    public int numeroEscaños;

    public ItemTablaEscaños(Formacion formacionPolitica, int numeroEscaños) {
        this.formacionPolitica = formacionPolitica;
        this.numeroEscaños = numeroEscaños;
    }
    
    public Formacion getFormacionPolitica() {
        return formacionPolitica;
    }

    public void setFormacionPolitica(Formacion formacionPolitica) {
        this.formacionPolitica = formacionPolitica;
    }

    public int getNumeroEscaños() {
        return numeroEscaños;
    }

    public void setNumeroEscaños(int numeroEscaños) {
        this.numeroEscaños = numeroEscaños;
    }
     
}
