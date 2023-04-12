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
public class eje8lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UNA NOTA ENTRE 0 Y 10");
        int nota = leer.nextInt();
        while (nota >= 0 && nota <= 10){
            System.out.println("la nota no esta dentro del rango");
        }
    }
    
}
