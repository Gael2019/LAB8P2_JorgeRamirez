/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jorgeramirez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge Ramirez
 */
public class Pais implements Serializable {
    private String nombre;
    ArrayList <Nadador> nadadores = new ArrayList();
    int medallas;

    public Pais(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public Pais() {
    }
    
    public void AgregarArchivo (Pais country){
        try{
            File Archivo = new File("./PaisParticipantes.sof");
            FileOutputStream fw = new FileOutputStream(Archivo);
            ObjectOutputStream bw = new ObjectOutputStream(fw);
            bw.writeObject(country);
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e){   
        }  
    }
    
    public ArrayList <Pais> Leer(){
        ArrayList <Pais> paises = new ArrayList();
        try {
            File Archivo = new File ("./PaisParticipantes.sof");
            FileInputStream fw = new FileInputStream(Archivo);
            ObjectInputStream bw = new ObjectInputStream(fw);
            Pais country = new Pais();
            while ((country = (Pais) bw.readObject()) != null) {
                paises.add(country);
                
            }
        } catch (Exception e) {
        }
        
      return paises;
     }
    
    

}

