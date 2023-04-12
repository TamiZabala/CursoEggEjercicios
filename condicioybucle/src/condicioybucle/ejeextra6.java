/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicioybucle;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ejeextra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in) ;
        System.out.println("Ingrese la cantidad de personas");
        int N = leer.nextInt() ; 
        double altura ;
        double cont = 0 ; 
        double prom = 0 ; 
        double cont2 = 0 ;
        double prom2 = 0 ; 
        
        for (int i = 0; i<N ; i++) { 
            System.out.println("Ingrese la estatura de las personas");
            altura = leer.nextDouble() ; 
            
            if (altura <= 1.60) { 
                cont++ ;
                prom+= altura ; 
                
            } 
               prom2+= altura ;
               cont2++ ; 
               
            } 
            System.out.println("el promedio de las alturas menores a 1,60 es : " + prom/cont ) ;
            System.out.println("el promedio de las alturas en general es : " + prom2/cont2 ) ;
    }
    
}
