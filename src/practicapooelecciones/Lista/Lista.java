/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapooelecciones.Lista;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import practicapooelecciones.Formacion.PartidoPolitico;
import practicapooelecciones.Eleccion.Eleccion;

/**
 *
 * @author Ruben
 */
public class Lista {
     String descripcion;
     String[] candidatos;

    
    public Lista(PartidoPolitico j, String[] candidatos ) {
        this.descripcion = descripcion;
        this.candidatos = candidatos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void ElaborarListas(Eleccion a){   
        
    }

    public class LeerFichero {
        public ArrayList<String> muestraContenido(String archivo, ArrayList<String> array) throws FileNotFoundException, IOException {
            int i;
            i=0;
            String cadena;
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                array.add(cadena);
            }
            b.close();
        return array;
        }
    }

    public class EscribeFichero{
        public void EscribeFichero() {
            FileWriter fichero = null;
            PrintWriter pw = null;
            try{
                fichero = new FileWriter("c:/prueba.txt");
                pw = new PrintWriter(fichero);

                for (int i = 0; i <candidatos.length ; i++)
                    pw.println(i + candidatos[i] );

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
               try {  
               if (null != fichero)
                  fichero.close();
               } catch (Exception e2) {
                  e2.printStackTrace();
               }
            }           
        }
    }
}