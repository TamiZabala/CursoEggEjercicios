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
public class ejecicio7 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena ;
        int cont = 0 ;
        int cont2 = 0 ; 
        String letra1 = " ";
        String letra2 = " ";
        do  { 
         System.out.println("Ingrese una cadena");
         cadena = leer.nextLine() ;
         letra1 = cadena.substring(0,1) ; 
         letra2 = cadena.substring(cadena.length() - 1) ; 
        
        if ((5<=cadena.length()) && (letra1.equalsIgnoreCase("x")) && (letra2.equalsIgnoreCase("o")) ) { 
                cont++ ; }  else { 
            cont2++ ;
                    
        }
                        
                    
        } while (!cadena.equals("&&&&&")) ;  
        
        System.out.println("Las veces que se cumple la condicion fueron : " + cont); 
        System.out.println("Las veces que NO se cumple la condicion fueron :" + (cont2 - 1)) ; 
            
    } 
           
    }
    

