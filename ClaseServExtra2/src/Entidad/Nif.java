/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Tamara
 */
public class Nif {
     long dni;
     char letra;
     
    public Nif (){
         
    }
     
    public Nif (long dni, char letra){
         this.dni=dni;
         this.letra=letra;
    }

    public long getDni() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
     
    
}
