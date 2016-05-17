    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio.Eleccion;

import practicapoojunio.Formacion.Formacion;

/**
 *
 * @author Adri
 */
public class ItemTablaVotos{
    public Formacion formacionPolitica;
    public int numeroVotos;

    public ItemTablaVotos(Formacion formacionPolitica, int numeroVotos) {
        this.formacionPolitica = formacionPolitica;
        this.numeroVotos = numeroVotos;
    }

    public Formacion getFormacionPolitica() {
        return formacionPolitica;
    }

    public void setFormacionPolitica(Formacion formacionPolitica) {
        this.formacionPolitica = formacionPolitica;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }
    
    
}
