/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseservextra2;

import Entidad.Nif;
import Servicio.NIFServicio;

/**
 *
 * @author Tamara
 */
public class ClaseServExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nif obj = new Nif ();
        NIFServicio inicio =new NIFServicio ();
        inicio.crearNif(obj);
        inicio.mostrar(obj);
        
    }
}
