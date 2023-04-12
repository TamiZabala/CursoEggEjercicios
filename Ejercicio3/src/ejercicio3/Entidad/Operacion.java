/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.Entidad;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class Operacion {
    private double numero1;
    private double numero2;
    
    public Operacion (double numero1,double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    public Operacion(){
        
    }
    
    public void setNumero (double numero1,double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    
    public void crearOperacion (){
        Scanner leer =new Scanner (System.in);
        System.out.println("ingrese dos numeros para operar");
        numero1= leer.nextDouble();
        numero2=leer.nextDouble();
        
    }
    
    public double sumar(){
        double suma;
        suma= numero1+numero2;
        return suma;
    }
    
    public double restar(){
        double resta;
        resta= numero1-numero2;
        return resta;
    }
    
     public double multiplicar(){
        double multiplicacion;
        if (numero1==0 || numero2==0) {
            System.out.println("no se permite multiplicar por 0");
            multiplicacion=0;
        }else{
            multiplicacion= numero1*numero2;
        }
        
        return multiplicacion;
    }
     
      public double dividir(){
        double divicion;
        if (numero1==0 || numero2==0) {
            System.out.println("no se permite dividir por 0");
            divicion=0;
        }else{
            divicion= numero1/numero2;
        }
        
        return divicion;
    }
}
