/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseserveje2.Servicios;

import claseserveje2.Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class CafeteraServicio {
    Scanner leer =new Scanner (System.in);
    
    public void llenarCafetera(Cafetera nueva){
        nueva.setCantidadActual(nueva.getCapacidadMaxima());
        
    }
    
    public void servirTaza(int taza,Cafetera nueva){
        if (nueva.getCantidadActual()<taza){
            System.out.println("no alcanza para servir una taza entera, se sirvio :"+ nueva.getCantidadActual());
            nueva.setCantidadActual(0);
        }else{
            System.out.println("se lleno la taza");
            nueva.setCantidadActual(nueva.getCantidadActual()-taza);
            System.out.println("quedan :"+ nueva.getCantidadActual());
        }
    }
    
    public void vaciarCafetera(Cafetera nueva){
        nueva.setCantidadActual(0);
        
    }
    
    public void agregarCafe (int agregando, Cafetera nueva){
        if (nueva.getCantidadActual()< nueva.getCapacidadMaxima()){
            int restante = nueva.getCapacidadMaxima()-nueva.getCantidadActual();
            if (restante>agregando){
                nueva.setCantidadActual(nueva.getCantidadActual()+agregando);
                System.out.println("se lleno la cafetera, la capadidad quedo en "+ nueva.getCantidadActual());
            }else{
                System.out.println("la cantidad a gregar excede la capacidad de la cafetera");
                System.out.println("se llenara al maximo posible");
                nueva.setCantidadActual(nueva.getCapacidadMaxima());
            }
        }else{
            System.out.println("la cafetera esta llena");
        }
    }
}
