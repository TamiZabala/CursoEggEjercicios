/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresyarreglos;

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
        System.out.println("ingrese tamaño del vector");
        int tamaño =leer.nextInt();
        int[] vector = new int[tamaño];
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random() * 100000);
            System.out.println(" "+vector[i]);
        }
    }
    
}
