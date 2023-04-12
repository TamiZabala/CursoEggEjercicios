/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseserveje2;

import claseserveje2.Entidad.Cafetera;
import claseserveje2.Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ClaseServEje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner (System.in);
        Cafetera nueva = new Cafetera ();
        CafeteraServicio inicio= new CafeteraServicio();
        
        inicio.llenarCafetera(nueva);
        System.out.println("ingrese el tamaño de la taza");
        inicio.servirTaza(leer.nextInt(), nueva);
        
        System.out.println("ingrese el tamaño de la taza");
        inicio.servirTaza(leer.nextInt(), nueva);
        
    }
    
}
