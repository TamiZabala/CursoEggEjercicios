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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        //do {
            System.out.println("sleecione una opcion");
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            opcion= leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("La suma es igual a :" +sumar(num1,num2));
                case 2:
                    
                case 3:
                    
                case 4: 
                    
            }
          
        //}while ();
    }
    
    public static int sumar (int num1,int num2){
        int retorno = num1+num2;
        return retorno;
    }
    /// y el resto es lo mismo etc etc
}
