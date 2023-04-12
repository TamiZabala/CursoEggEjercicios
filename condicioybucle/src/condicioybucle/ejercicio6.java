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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese dos numeros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        int num3;
        
        do {
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            System.out.println("5-salir");
            System.out.println("Elija opcion:");
            num3= leer.nextInt();
            
            switch (num3){
            case 1:
                System.out.println("suma:"+ (num1+num2));
                break;
            case 2:
                System.out.println("restar:"+ (num1-num2));
                break;
            case 3:
                System.out.println("multiplicar:"+ (num1*num2));
                break;
            case 4:
                System.out.println("multiplicar:"+ (num1/num2));
                break;
            case 5:
                break;
            default:
                System.out.println("Opcion no valida");
                
            }    
        
        }while (num3!=5);
        
    }
    
}
