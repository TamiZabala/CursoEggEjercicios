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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [][] matriz= new int[3][3];
        System.out.println("ingrese numeros del 1 al 9");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int num= leer.nextInt();
                while (num <1 || num >9){
                    System.out.println("numero invalido, ingrese otro");
                  num = leer.nextInt();
                }
                matriz[i][j]=num;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("("+ matriz[i][j]+")");
            }
             System.out.println("");
        }
        
        System.out.println("la matriz es magica?"+ magico(matriz));
    }
    public static boolean magico (int [][] matriz){
        int[]vector = new int[8];
        int aux = 2;
        boolean resultado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                switch (i){
                    case 0:
                        vector[0]+= matriz[0][j];
                        break;
                    case 1:
                        vector[1]+= matriz[1][j];
                        break;
                    case 2:
                        vector[2]+= matriz[2][j];
                        break;
                }
                switch (j){
                    case 0:
                        vector[3]+= matriz[i][0];
                        break;
                    case 1:
                        vector[4]+= matriz[i][1];
                        break;
                    case 2:
                        vector[5]+= matriz[i][2];
                        break;
                }
                if (i==j){
                    vector[6]+=matriz[i][j];
                }
                if (aux == j){
                    vector[7]+= matriz[i][j];
                    aux--;
                }
             
            }
            
            
        }
        int aux2=vector[0];
        int cont=0;
         for (int i = 0; i < vector.length; i++) {
            if (vector[i]==aux2){
                cont++;
            }
        }
        if(cont== vector.length){
             resultado= true;
         }
         return resultado;
    }   
    
}
