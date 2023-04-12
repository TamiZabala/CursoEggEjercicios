/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author Tamara
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona primeraPersona =new Persona ("Silvita",20,"Mujer");
        Persona segundaPersona =new Persona ("Pablo",33,"Hombre");
        
        //System.out.println(primeraPersona.getNombre());
        
        primeraPersona.setNombre("papa");
        
        //System.out.println(primeraPersona.getNombre());
        System.out.println(primeraPersona);
    }
    
}
