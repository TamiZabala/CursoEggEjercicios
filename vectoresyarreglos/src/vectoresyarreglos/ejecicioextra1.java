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
public class ejecicioextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("tamaño del vector");
        int tamaño= leer.nextInt();
        int [] vector= new int[tamaño];
        System.out.println("ingrese numero para sumar");
        int suma =0;
        for (int i = 0; i < vector.length; i++) {
            vector[i]= leer.nextInt();
            suma+= vector[i];
        }
        System.out.println("la suma es igual a "+suma);
    }
    
}
