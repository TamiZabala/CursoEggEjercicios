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
public class ejercicioextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese filas");
        int filas= leer.nextInt();
        System.out.println("ingrese columnas");
        int columnas= leer.nextInt();
        int [][] matriz= new int [filas][columnas];
        int suma=0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz [i][j]= (int) (Math.random()*10);
                suma+=matriz[i][j];
            }
        }
        System.out.println("la suma es igual a :" + suma);
    }
    
}
