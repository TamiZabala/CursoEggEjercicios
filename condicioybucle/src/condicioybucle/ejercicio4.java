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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("ingrese una frase");
        String palabra = leer.nextLine();
        palabra= palabra.substring(0,1);
        if (palabra.equalsIgnoreCase("A")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
