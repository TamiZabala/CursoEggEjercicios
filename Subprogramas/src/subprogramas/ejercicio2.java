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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int edad = 0; 
       String nombres = "";
       String opciones = "";
           System.out.println("Ingrese nombre y edad de la persona");
       Mostrarinfo(edad,nombres,opciones);
    
    }
    public static void Mostrarinfo(int edad,String nombres, String opciones){
     
        
         
         do{
          Scanner t = new Scanner(System.in);
          nombres = t.nextLine();
          edad = t.nextInt();
          
          if(edad>=18){
              System.out.println(nombres + " con "+ edad + " años es mayor de edad");
              
          
          }else{
              System.out.println(nombres+" con "+ edad + " años es menor de edad");
             
          }
             
             System.out.println("¿Desea continuar?");
             opciones = t.next();
             if(opciones.equalsIgnoreCase ("no")){
             
                 break;
             }
            
          
         }while(opciones != "no");
          
      
    }
    }
    

