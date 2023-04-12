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
public class ejeextra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int dividendo;
        int divisor;
        int resultado;
        int cont =0;
        System.out.println("ingrese el numero a dividir (debe ser mayor q 1)");
        do {
        dividendo = leer.nextInt ();
        
        }while (dividendo<=1);
        
        System.out.println("ingrese el divisor");
        
        do {
        divisor = leer.nextInt ();
        
        }while (divisor>=dividendo);
        
        do {
           resultado= dividendo - divisor ;
           dividendo = resultado;
           cont++;
        }while (resultado>dividendo);// mal condicion solo se ejecuta 1 vez
        System.out.println("residuo:" + resultado);
        System.out.println("cociente:" + cont);
    }            
}    
    
