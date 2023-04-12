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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz= new int [4][4];
        int[][] matriz2= new int [4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j]=(int) (Math.random() * 10);
                
                System.out.print(" "+ matriz [i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int j = 0; j < matriz2.length; j++) {
            for (int i = 0; i < matriz2.length; i++) {
               matriz2 [j][i]= matriz [i][j];
                
                System.out.print(" "+ matriz [i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
