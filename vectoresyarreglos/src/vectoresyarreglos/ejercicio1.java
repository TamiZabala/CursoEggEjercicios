/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresyarreglos;

/**
 *
 * @author Tamara
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i]= i+1;
            System.out.print(" "+ vector[i]);
        }
        System.out.println(" ");
        for (int i = vector.length-1; i >= 0; i--) {
            System.out.print(" " + vector[i]);
        }
    }
    
}
