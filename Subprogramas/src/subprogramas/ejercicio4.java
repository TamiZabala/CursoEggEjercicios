/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
       int num;
        System.out.println("Ingrese un numero aleatorio");
        num = t.nextInt();
        
        numeroPrimo(num);
        if( numeroPrimo(num)){
        
             System.out.println("Este numero es primo");
        }else{
            System.out.println("este numero no es primo ");
        }
        
    }
   public static boolean numeroPrimo(int num){
   
       for (int i = 2;i< (num/2+1); i++) {
           if(num%i == 0){
            return false;
               
           }
       }
   
    return true;
   }
}
    


    
    

