/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicioybucle;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ejeextra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int par=0;
        int impar = 0;
        int cantN = 0;
        int m = 2;
        
        while (m!=0) {
          System.out.println("Ingrese un numero entero");
          Scanner input = new Scanner (System.in);
          n = input.nextInt();
          cantN++;
        
          if (n%2==0) {
            par++;
          }
          else {
            impar++;
          }
        
          if (n%5==0){
           break;
          }
        }     
    }
    
}
