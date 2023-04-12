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
public class ejeextra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de numeros");
        Scanner n = new Scanner (System.in);
        int cantidad = n.nextInt();
        int cont = 0;
        int prom=0;
        int aux = 0;
        int aux2= 999999999;
        int numeros = cantidad;
       
        do {
            System.out.println("Ingrese un numero");
            int num = n.nextInt();
            prom+= num;
            
            if (num > aux) {
                aux = num;
            }
            if (num < aux2) {
                aux2 = num;
            }
            cantidad--;
            
        }
        
        while (cantidad>0); {
        
    }
        System.out.println("El valor maximo es " + aux);
        System.out.println("El valor minimo es " + aux2); 
        System.out.println("El promedio es " + prom/numeros);
    }
    
}
