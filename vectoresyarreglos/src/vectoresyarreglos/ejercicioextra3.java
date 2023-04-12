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
public class ejercicioextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("ingrese tamaño del vector");
        int tamaño= leer.nextInt();
        int[] vector = new int [tamaño];
        System.out.println("ingrese tamaño de la matriz");
        int tamaño2=leer.nextInt();
        int [][] matriz = new int [tamaño2][tamaño2];
        
        rellenar(vector,matriz,tamaño2);
        imprimir(vector);
    }
    
    public static void rellenar (int []vector, int [][] matriz,int tamaño2){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= (int) (Math.random()* 10);
            }
        }
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" "+ matriz[i][j]);
            }
             System.out.println("");
        }
        
       int multiplicador = tamaño2*tamaño2;
        
        int[] vectoraux= new int [multiplicador];
       
        int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
               vectoraux[cont]=matriz[i][j];
               cont++;        
            }
        }
        for (int i = 0; i < vector.length; i++) {
            int posicion = (int) (Math.random()* multiplicador);

            vector[i]= vectoraux[posicion];
        }

    }
    
    public static void imprimir (int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" "+ vector[i]);
        }
    }
    
}
