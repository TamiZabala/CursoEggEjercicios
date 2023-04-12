/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros");
        Scanner leer= new Scanner (System.in);
        int num1 = leer.nextByte();
        int num2 = leer.nextByte();
        System.out.println("resultado: "+ (num1+num2));
    }
    
}
