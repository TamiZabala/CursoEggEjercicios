/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseserveje2.Entidad;

/**
 *
 * @author Tamara
 */
public class Cafetera {
    private int capacidadMaxima= 1000;
    private int cantidadActual;
        
    
    public Cafetera (){
        
    }
    public Cafetera (int capacidadMaxima, int capacidadActual){
        this.capacidadMaxima= capacidadMaxima;
        this.cantidadActual= capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
