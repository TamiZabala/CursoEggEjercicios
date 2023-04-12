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
public class ejeextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa una letra ");
        String letra=leer.next();
        
        if (letra.equalsIgnoreCase("a" )||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i" )||letra.equalsIgnoreCase("o" ) || letra.equalsIgnoreCase("u" ) ) {
            System.out.println("La letra ingresada es una vocal: " +letra);
        }else{
            System.out.println("La letra ingresada no es una vocal " );
        }
    } 
    }
    

