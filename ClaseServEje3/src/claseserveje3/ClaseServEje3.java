/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseserveje3;

import Entidad.Persona;
import Servicio.PersonaServicio;



/**
 *
 * @author Tamara
 */
public class ClaseServEje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona nueva = new Persona();
        PersonaServicio inicio= new PersonaServicio();
        inicio.crearPersona(nueva);
        //inicio.calcularIMC(nueva);
        Persona nueva1 = new Persona("valentina",40,'M',60.5,1.6);
        //inicio.calcularIMC(nueva1);
        Persona nueva2 = new Persona("pepe",32,'H',90.5,1.8);
        //inicio.calcularIMC(nueva2);
        Persona nueva3 = new Persona("junita",17,'M',50.4,1.8);
        //inicio.calcularIMC(nueva3);
        
        Persona[] personas = {nueva, nueva1, nueva2, nueva3};
        
        int [] imcPorcent = new int [4];
        boolean [] edadPorcent = new boolean [4];

        for (int i = 0; i < 4; i++) {
            System.out.println(personas[i].toString());
             int imc=inicio.calcularIMC(personas[i]);
             boolean edad = inicio.esMayorDeEdad(personas[i]);
             
            imcPorcent[i]= imc;
            edadPorcent[i]= edad;
        }
        int cont=0;
        int cont1=0;
        int cont2=0;
        int contEdad=0;
        int contEdad1=0;        
        for (int i = 0; i < 4; i++) {
            switch (imcPorcent[i]){
                case -1:
                    cont++;
                    break;
                case 0:
                    cont1++;
                    break;
                case 1:
                    cont2++;
                    break;
            }
            
            if (edadPorcent[i]==true){
                contEdad++;
            }else{
                contEdad1++;
            }
            
        }
        System.out.println("el porcentaje de persones debajo de su peso ideal es: "+ (cont*(100/personas.length))+"%");
        System.out.println("el porcentaje de personas en su peso ideal es: "+ (cont1*(100/personas.length))+"%");
        System.out.println("el porcentaje de personas con sobre peso es: "+ (cont2*(100/personas.length))+"%");
        System.out.println("el porcentaje de mayores de edad es: "+ (contEdad*(100/personas.length))+"%");
        System.out.println("el porcentaje de menores de edad es: "+ (contEdad1*(100/personas.length))+"%");
        
        
    
    }
}
