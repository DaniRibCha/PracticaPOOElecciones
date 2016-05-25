/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio.Eleccion;

import java.util.Arrays;

/**
 *
 * @author Adri
 */
public class TablaVotos {
    public ItemTablaVotos [] tablavotos;

    public TablaVotos(ItemTablaVotos[] tablavotos) {
        this.tablavotos = tablavotos;
    }
    public ItemTablaVotos[] getTablavotos() {
        return tablavotos;
    }

    public void setTablavotos(ItemTablaVotos[] tablavotos) {
        this.tablavotos = tablavotos;
    }   
}
