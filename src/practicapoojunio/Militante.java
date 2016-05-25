/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio.Votante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class Militante extends Votante{
    public double cuota;
    public String carnet;

    public Militante(double cuota, String carnet, String nombre, String apellidos, int edad, String profesion, String genero, String siglaspartido, String[] encuesta) {
        super(nombre, apellidos, edad, profesion, genero, siglaspartido, encuesta);
        this.cuota = cuota;
        this.carnet = carnet;
    }
    
        
    
    
    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    
    
    public void EnviarEncuesta(){}
    
    
    
}
