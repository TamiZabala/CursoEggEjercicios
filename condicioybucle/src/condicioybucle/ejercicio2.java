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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese palabra");
        String palabra= leer.nextLine();
        if (palabra.equals("eureka")) {
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        
                
    }
    
}
