/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Tamara
 */
public class Circunferencia {
    private double radio;
    
    public Circunferencia (double radio){
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
   public double area(){
        double Area;
        
        Area= Math.PI* Math.pow(radio, 2);
        return Area;
    }
   public double perimetro(){
       double Perimetro;
       Perimetro= 2* radio*Math.PI;
       return Perimetro;
   }
}
