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
public class eje6lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        if (num1 > 25 && num2 > 25 ){
            System.out.println("Ambos numeros son mayores a 25");
            
        } else if (num1 > 25 || num2 > 25 ) {
            System.out.println("Uno de lso numeros es mayor a 25");
        } else{
            System.out.println("ninguno de los numeos es mayor a 25");
        }
    }
    
}
