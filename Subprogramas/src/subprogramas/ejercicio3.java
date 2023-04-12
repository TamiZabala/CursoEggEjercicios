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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
       int moneda= 0; double resultado = 0; String conversion = ""; 
        System.out.println("Ingrese la cantidad a convertir y el tipo de cambio deseado(Libras,Dólares, Yenes)");
        moneda = t.nextInt();
        conversion= t.next();
       ConversionDeMonedas(moneda,conversion,resultado);
       
       
       
    }
    public static void ConversionDeMonedas(int moneda,String conversion,double resultado){
        
        
        String conversion1 = conversion.toUpperCase();
        switch(conversion1){
            case "LIBRAS":
                resultado = moneda*0.86;
                System.out.println("El resultado es "+ resultado+ " Libras");
                break;
                
            case "DOLARES":
                resultado = moneda*1.28611;
                System.out.println("El resultado es "+ resultado+ " dolares");
                break;
            case "YENES":
                resultado = moneda*129.852;
                System.out.println("El resultado es "+ resultado+ " yenes");
                break;
            default:
                
        }
    }
    
    
}
