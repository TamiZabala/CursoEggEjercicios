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
public class ejercicioextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("tamaño del los vectores");
        int tamaño= leer.nextInt();
        int [] vector= new int[tamaño];
        int [] vector2= new int [tamaño];
        System.out.println("llene el primer vector");
        for (int i = 0; i < vector.length; i++) {
            vector[i]= leer.nextInt();
            
        }
        System.out.println("llene el segundo vector");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i]= leer.nextInt();
            
        }
        boolean respuesta = true;
        for (int i = 0; i < tamaño; i++) {
            if (vector[i]!=vector2[i]){
                respuesta=false;
                break;
            }
        }
        System.out.println("el vector 1 es igual al vector 2?"+ respuesta);
    }
    
}
