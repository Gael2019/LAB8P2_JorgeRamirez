/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jorgeramirez;

import java.io.Serializable;

/**
 *
 * @author Jorge Ramirez
 */
public class Nadador implements Serializable {
    String nombre;
    String nacionalidad;
    int edad;
    double estatura;
    String estiloNatacion;
    int distanciaNatacion;
    int MejorTiempo;
    int medallas;

    public Nadador(String nombre, String nacionalidad, int edad, double estatura, String estiloNatacion, int distanciaNatacion, int MejorTiempo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
        this.estiloNatacion = estiloNatacion;
        this.distanciaNatacion = distanciaNatacion;
        this.MejorTiempo = MejorTiempo;
        this.medallas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getEstiloNatacion() {
        return estiloNatacion;
    }

    public void setEstiloNatacion(String estiloNatacion) {
        this.estiloNatacion = estiloNatacion;
    }

    public int getDistanciaNatacion() {
        return distanciaNatacion;
    }

    public void setDistanciaNatacion(int distanciaNatacion) {
        this.distanciaNatacion = distanciaNatacion;
    }

    public double getTiempoMasRapido() {
        return MejorTiempo;
    }

    public void setTiempoMasRapido(int tiempoMasRapido) {
        this.MejorTiempo = tiempoMasRapido;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Nadador() {
    }
    
    
    @Override
    public String toString() {
        return "Nadador{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", estatura=" + estatura + ", estiloNatacion=" + estiloNatacion + ", distanciaNatacion=" + distanciaNatacion + ", tiempoMasRapido=" + MejorTiempo + ", medallas=" + medallas + '}';
    }
    
    
}
