/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jorgeramirez;

import javax.swing.JProgressBar;

/**
 *
 * @author Jorge Ramirez
 */
public class Nadador2 extends Thread {
    int distance;
    JProgressBar barra;
    int random;

    public Nadador2(int distance, JProgressBar barra) {
        this.distance = distance;
        this.barra = barra;
    }
    
   @Override
   public void run (){
       while (barra.getValue() < distance){
           barra.setValue(barra.getValue()+random);
           try {
               Thread.sleep(0);
           } catch (Exception e) {
           }
       }
   }
}
