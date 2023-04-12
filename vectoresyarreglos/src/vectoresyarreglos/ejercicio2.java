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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("ingrese tamaño del vector");
        int tamaño =leer.nextInt();
        int[] vector = new int[tamaño];
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random() * 10);
            System.out.println(" "+vector[i]);
        }
        System.out.println("que numero quiere buscar (del 0 al 9)");
        int buscar =leer.nextInt();
        String resultado = "";
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==buscar){
                int posicion = i;
                resultado +=  String.valueOf(i);
            }
        }
        for (int i = 0; i < resultado.length(); i++) {
            String imprimir = resultado.substring(i);
            System.out.println(" "+ imprimir);       
        }
        
    }
    
}
