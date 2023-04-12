/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.Entidad.Operacion;

/**
 *
 * @author Tamara
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion operando= new Operacion();
        operando.crearOperacion();
        System.out.println("suma"+ operando.sumar());
        System.out.println("restar"+ operando.restar());
        System.out.println("multiplicar"+ operando.multiplicar());
        System.out.println("dividir"+ operando.dividir());
    }
    
    
}
