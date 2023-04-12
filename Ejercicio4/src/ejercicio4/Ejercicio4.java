/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import Entidad.Rectangulo;

/**
 *
 * @author Tamara
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo nuevo= new Rectangulo();
        nuevo.crearRectangulo();
        System.out.println("superficie " + nuevo.superficie());
        System.out.println("perimetro " + nuevo.perimetro());
        nuevo.dibujar();
    }
    
}
