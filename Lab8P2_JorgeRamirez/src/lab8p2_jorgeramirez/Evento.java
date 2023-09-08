/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jorgeramirez;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge Ramirez
 */
public class Evento implements Serializable {
    String estilo;
    int distancia;
    double recordActual;

    public Evento(String estilo, int distancia, double recordActual) {
        this.estilo = estilo;
        this.distancia = distancia;
        this.recordActual = recordActual;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getRecordActual() {
        return recordActual;
    }

    public void setRecordActual(double recordActual) {
        this.recordActual = recordActual;
    }

    @Override
    public String toString() {
        return "Evento{" + "estilo=" + estilo + ", distancia=" + distancia + ", recordActual=" + recordActual + '}';
    }
    
}
