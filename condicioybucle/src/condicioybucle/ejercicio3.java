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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("ingresar palabra");
        String palabra = leer.nextLine();
        if (8==palabra.length()){
            System.out.println("correcto");
            
        }else{
            System.out.println("incorrecto");
        }
    }

    
}
