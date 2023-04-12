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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
        int i;
        int j;
        System.out.println("ingrese tamaño de matriz");
        int tamaño=leer.nextInt();
        int[][] matriz=new int[tamaño][tamaño];
        int[][] matriz2=new int[tamaño][tamaño];
        for( i=0;i<matriz.length;i++){
           for( j=0;j<matriz[i].length;j++){
               System.out.println("ingrese el valor en la posicion:"+i+","+j);
               matriz[i][j] = leer.nextInt();
           }
         }
         
        for( i=0;i<matriz.length;i++){
           for( j=0;j<matriz[i].length;j++){
               System.out.print("(" +matriz[i][j] + ")");
               
           }
            System.out.println("");
         }
        for( j=0;j<matriz.length;j++){
           for( i=0;i<matriz.length;i++){
               matriz2[j][i]= matriz [i][j];
                System.out.print("(" +matriz2[j][i]+ ")");
            }
            System.out.println("");
         }
        
        System.out.println("La matriz es antisimetrica?"+ comparacion(matriz,matriz2));
    }
    
    public static boolean comparacion (int[][]matriz,int[][]matriz2){
        boolean resultado = false;
        int i;
        int j;
        
        for( i=0;i<matriz.length;i++){
           for( j=0;j<matriz[i].length;j++){
               if (matriz[i][j]*-1 == matriz2 [i][j]){
                   
                   resultado=true;
                   
               }else{
                   resultado=false;
                   break;
               }
               
           }
            
         }
     return resultado;
    }
}      
       