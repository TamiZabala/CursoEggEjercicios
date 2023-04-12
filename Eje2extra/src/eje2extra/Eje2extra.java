/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2extra;

import Entidad.Puntos;

/**
 *
 * @author Tamara
 */
public class Eje2extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos nuevo = new Puntos ();
        nuevo.crearPuntos();
        System.out.println("la distancia es igual a "+ nuevo.calcular());
    }
    
}
