/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class CuentaBancariaServicios {
    Scanner leer =new Scanner(System.in);
    
    public CuentaBancaria crearCuenta (){
        
        System.out.println("ingrese numero de cuenta");
        int cuenta = leer.nextInt();
        System.out.println("ingrese DNI");
        long dni = leer.nextLong();
        System.out.println("ingrese saldo");
        double saldo= leer.nextDouble();
        
        return new CuentaBancaria(cuenta, dni, saldo);
    }
    
    //public void ingresar (double saldo){
    //    System.out.println("Cuanto dinero quiere ingresar");
    //    double ingresar = leer.nextDouble();
    //    saldo += ingresar;
    //}
    
    public void ingresar (double saldo, CuentaBancaria cb){
        System.out.println("Cuanto dinero quiere ingresar");
        cb.setSaldoActual (cb.getSaldoActual()+ saldo);
        System.out.println("el saldo actual es "+ cb.getSaldoActual());
    }
    
    public void retirar (double retiro, CuentaBancaria cb){
        if (cb.getSaldoActual()>= retiro){
            cb.setSaldoActual(cb.getSaldoActual()-retiro);
        }else{
            System.out.println("saldo retirado "+ cb.getSaldoActual());
            cb.setSaldoActual(0);
        }
        System.out.println("el saldo actual es "+ cb.getSaldoActual());
    }
    
    public void extraccionRapida (CuentaBancaria cb){
        System.out.println("Se retirara "+ (0.2*cb.getSaldoActual()));
        cb.setSaldoActual(cb.getSaldoActual()*0.80);
        
    }
    
    public void consultarSaldo (CuentaBancaria cb){
        System.out.println("Su saldo es " + cb.getSaldoActual());
    }
    
    public void consultarDatos (CuentaBancaria cb){
        System.out.println(cb);
    }
    
}
