/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class RaicesServicio {
    
    private double getDiscriminante (Raices ope){
        
        double discriminante = Math.pow(ope.getB(), 2)-4*ope.getA()*ope.getC();
        return discriminante;
    }
    
    public void crearRaices (Raices ope){
        Scanner leer =new Scanner(System.in);
        System.out.println("ingrese a");
        ope.setA(leer.nextDouble());
        System.out.println("ingrese b");
        ope.setB(leer.nextDouble());
        System.out.println("ingrese c");
        ope.setC(leer.nextDouble());
    }
    
    private boolean tieneRaices (Raices ope){
        boolean soluciones= false;
        if (getDiscriminante(ope) > 0){
            soluciones=true;
            
       }
        return soluciones;
    }
    
    private boolean tieneRaiz (Raices ope){
        boolean unicaSolucion= false;
        if (getDiscriminante(ope)  == 0){
            unicaSolucion=true;
            
       }
        return unicaSolucion;
    } 
    
    private void obtenerRaices(Raices ope){
       boolean respuesta= tieneRaices(ope);
        if (respuesta == true){
           double x1 = (-(ope.getB())+Math.sqrt(Math.pow(ope.getB(), 2)-4*ope.getA()*ope.getC()))/2*ope.getA();
           double x2 = (-(ope.getB())-Math.sqrt(Math.pow(ope.getB(), 2)-4*ope.getA()*ope.getC()))/2*ope.getA();
            System.out.println("solucion 1 : "+ x1);
            System.out.println("solucion 2 : "+ x2);
        }
    }
    
    private void obtenerRaiz(Raices ope){
       boolean respuesta= tieneRaiz(ope);
        if (respuesta == true){
           double x1 = (-(ope.getB())+Math.sqrt(Math.pow(ope.getB(), 2)-4*ope.getA()*ope.getC()))/2*ope.getA();
           
            System.out.println("la unica solucion es: "+ x1);
            
        }
    }
    
    public void calcular(Raices ope){
        boolean respuesta = tieneRaices (ope);
        boolean respuesta2 = tieneRaiz (ope);
        if (respuesta){
            obtenerRaices(ope);
        }else if (respuesta2){
            obtenerRaiz(ope);
        }else{
            System.out.println("no existe solucion");
        }
        
    }
}
    
