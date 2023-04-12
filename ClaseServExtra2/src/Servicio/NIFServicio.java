/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class NIFServicio {
   
    public void crearNif (Nif obj){
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese su DNI");
        obj.setDni(leer.nextLong());
        
        long calcular = obj.getDni()%23;
        
        //char[] vector = new char[22];
        char[] vector={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        obj.setLetra(vector[(int)calcular]);
       
    
    }
    
    public void mostrar(Nif obj){
        System.out.println(obj.getDni()+"-"+obj.getLetra());
    }
    
    
   
}
