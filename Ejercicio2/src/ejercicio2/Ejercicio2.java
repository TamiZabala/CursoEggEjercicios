/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circu1=new Circunferencia(1.0);
        crearCircunferencia(circu1);
        
    }
    
     public static void crearCircunferencia(Circunferencia circu1){
        Scanner leer=new Scanner (System.in);
        
        //Circunferencia circu1=new Circunferencia(1.0);
        System.out.println("ingrese radio");
        circu1.setRadio(leer.nextDouble());
        
         System.out.println("Area igua a: " + circu1.area());
         System.out.println("Perimetro igual a: " + circu1.perimetro());
    }
    
    
    
}
