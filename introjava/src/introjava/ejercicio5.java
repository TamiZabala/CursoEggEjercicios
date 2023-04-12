/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese numero");
        int numero = leer.nextInt();
        System.out.println(numero*2);
        System.out.println(numero*3);
        System.out.println(sqrt(numero));
    }
    
}
