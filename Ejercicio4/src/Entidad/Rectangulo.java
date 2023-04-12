/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
        
    }
    public Rectangulo(){
        
    }
   

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer =new Scanner(System .in);
        System.out.println("ingresar valores de base y altura");
        base= leer.nextInt();
        altura=leer.nextInt();
    }
    
    public int superficie (){
        int sup = base*altura;
        return sup;
    }
    
    public int perimetro (){
        int per = (base+altura)*2;
        return per;
    }
    
    public void dibujar(){
        
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < altura-2; i++) {
            System.out.print("*");
            for (int j = 0; j < base-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            
        }
        System.out.print("");
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
    }
}
