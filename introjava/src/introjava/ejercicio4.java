/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

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
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese cuantos grados hacen");
        int grados = leer.nextByte();
        double F = 32+(9*grados/5);
        System.out.println("la cantidad de grados fahrenheit es igual a:"+ F);
    }
    
}
