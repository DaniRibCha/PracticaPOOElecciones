/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoojunio.Votante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Observable;
import java.util.Scanner;
import static javax.swing.GroupLayout.Alignment.values;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.values;

/**
 *
 * @author Ruben
 */
public class Votante extends Observable implements Serializable {
    
    public String nombre;
    public String apellidos;
    public int edad;
    public String profesion;
    public String genero;
    public String siglaspartido;
    public String[] encuesta;

    public Votante(String nombre, String apellidos, int edad, String profesion, String genero, String siglaspartido, String[] encuesta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.profesion = profesion;
        this.genero = genero;
        this.siglaspartido = siglaspartido;
        this.encuesta = encuesta;
    }

    
    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSiglaspartido() {
        return siglaspartido;
    }

    public void setSiglaspartido(String siglaspartido) {
        this.siglaspartido = siglaspartido;
    }

    public String[] getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(String[] encuesta) {
        this.encuesta = encuesta;
    }
    
}
    






