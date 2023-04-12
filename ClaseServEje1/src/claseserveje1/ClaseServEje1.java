/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseserveje1;

import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicios;
import java.util.Scanner;



/**
 *
 * @author Tamara
 */
public class ClaseServEje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer =new Scanner (System.in);
        CuentaBancaria cb;
        CuentaBancariaServicios scb = new CuentaBancariaServicios();
        cb= scb.crearCuenta();
        
        System.out.println("ingres monto a agregar");
        double saldo = leer.nextDouble();
        scb.ingresar(saldo, cb);
        System.out.println("ingresa saldo a retirar ");
        double retiro =leer.nextDouble();
        scb.retirar(retiro, cb);
        System.out.println("Extaccion rapida");
        scb.extraccionRapida(cb);
        System.out.println("Saldo");
        scb.consultarSaldo(cb);
        System.out.println("Los datos del cliente");
        scb.consultarDatos(cb);
        
    }
    
}
