/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapooelecciones.Votante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
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
    
    public Militante() throws FileNotFoundException, IOException{
        super();
        try{    
    FileReader archivo=new FileReader("archivomilitante.txt");
    BufferedReader buffer=new BufferedReader(archivo);
    this.nombre = buffer.readLine();
    this.apellidos= buffer.readLine();
    this.edad = Integer.parseInt(buffer.readLine()) ;
    this.profesion = buffer.readLine();
    this.siglaspartido = buffer.readLine();
     this.cuota = Double.parseDouble(buffer.readLine());
    this.carnet = buffer.readLine();
    int i;
    for (i=0; i<2; i++){
        this.encuesta[i]= buffer.readLine();}
   
    }
    catch(Exception e){}
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
    
        public void GuardarMilitante() throws IOException{
        try{
    FileWriter archivo=new FileWriter("archivomilitante.txt", true);
    BufferedWriter buffer=new BufferedWriter(archivo);
    PrintWriter salida=new PrintWriter(buffer);

    salida.println(this.nombre);
    salida.println(this.apellidos);
    salida.println(this.edad);
    salida.println(this.profesion);
    salida.println(this.siglaspartido);
    int i;
    for (i=0; i<this.encuesta.length; i++){
    salida.println(this.encuesta[i]);}
    salida.println(this.cuota);
    salida.println(this.carnet);
    salida.close();
    
    


    salida.close();
        }
        catch(IOException e){JOptionPane.showMessageDialog(null, "ERROR","Mensaje",JOptionPane.PLAIN_MESSAGE);
    }
        finally{}
    
    
    }

    


    
    public void EnviarEncuesta(){}
    
    
    
}
