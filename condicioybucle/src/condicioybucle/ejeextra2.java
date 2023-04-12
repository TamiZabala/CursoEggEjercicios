/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicioybucle;

/**
 *
 * @author Tamara
 */
public class ejeextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int A = 1  ;
        int B = 2 ;
        int C = 3 ;
        int D = 4 ; 
        System.out.println("Los valores iniciales son :" + A + " A " + B + "B" + C + " C " + D + " D ");
        int aux = 0 ; 
        
          aux = B ;
          B = C ; 
          
          C = A ;
          A = D ; 
          D = aux ; 
          
          System.out.println("Los valores cambiados son : " + A +" A " + B + " B " + C + " C " + D + " D " );
    }
    
}
