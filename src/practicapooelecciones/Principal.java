/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio;

import java.io.IOException;
import practicapoojunio.Eleccion.Eleccion;
import practicapoojunio.Votante.Votante;

/**
 *
 * @author Ruben
 */
public class Principal {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      Votante votante=new Votante();
      MenuElecciones menu=new MenuElecciones(votante);
      menu.setVisible(true);
      
      
      
    }
}
