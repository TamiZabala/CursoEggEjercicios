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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("ingrese un limite para la suma");
        int num = leer.nextInt();
        int suma=0;
        int num2=0;
        
        while (suma<num){
            
            System.out.println("ingrese numero para sumar");
            num2 = leer.nextInt();
            suma=suma+num2;
            
        }
        System.out.println("la suma es :"+ suma);
             
        
    }
    
}
