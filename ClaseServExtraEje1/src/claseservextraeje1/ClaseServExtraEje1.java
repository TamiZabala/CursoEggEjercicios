/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseservextraeje1;

import Entidad.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author Tamara
 */
public class ClaseServExtraEje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Raices ope =new Raices();
        RaicesServicio inicio =new RaicesServicio();
        
        
        //inicio.obtenerRaiz(discriminante, ope);
        //inicio.obtenerRaices(discriminante, ope);
        inicio.crearRaices(ope);
        inicio.calcular(ope);
    }
    
}
