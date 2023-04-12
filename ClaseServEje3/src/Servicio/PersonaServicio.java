/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class PersonaServicio {
    
    public void crearPersona (Persona nueva){
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese nombre");
        nueva.setNombre(leer.next());
        System.out.println("ingrese edad");
        nueva.setEdad(leer.nextInt());
        System.out.println("ingrese altura");
        nueva.setAltura(leer.nextDouble());
        System.out.println("ingrese peso");
        nueva.setPeso(leer.nextDouble());
        System.out.println("ingrese sexo H para hombre, M para Mujer, O para otro");
        nueva.setSexo(leer.next().charAt(0));
        while (nueva.getSexo()!='M' && nueva.getSexo()!='H' && nueva.getSexo()!='O'){
            System.out.println("ingrese H, M u O");
            nueva.setSexo(leer.next().charAt(0));
        }
    }
    
    public boolean esMayorDeEdad(Persona nueva){
        if (nueva.getEdad()>18){
            System.out.println("la persona es mayor de edad");
            return true;
        }else{
            System.out.println("la persona es menor de edad");
            return false;
        }
        
    }
    
    public int calcularIMC(Persona nueva){
        double pesoIdeal = nueva.getPeso()/Math.pow(nueva.getAltura(), 2);
        int aux=2;
        if (pesoIdeal<20){
            System.out.println("esta por debajo de su peso ideal");
            aux= -1;
            
        }else if (pesoIdeal>= 20 && pesoIdeal <= 25){
        
            System.out.println("esta en su peso ideal");
            aux= 0;
            
        }else {
            System.out.println("tiene sobrepeso");
            aux= 1;
            
        }
       return aux;
    }
}
