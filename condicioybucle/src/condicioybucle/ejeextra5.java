/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicioybucle;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ejeextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese clase de socio");
        String letra = leer.next();
        letra= letra.toUpperCase();
        int costo;
        switch (letra) {
            case "A":
                System.out.println("Ingrese costo del tratamiento");
                costo = leer.nextInt();
                System.out.println("el costo del tratamiento es:" + costo/2);
                break;
            case "B":    
                System.out.println("Ingrese costo del tratamiento");
                costo = leer.nextInt();
                System.out.println("el costo del tratamiento es:" + (costo/1.35));
                break;
            case "C":    
                System.out.println("Ingrese costo del tratamiento");
                costo = leer.nextInt();
                System.out.println("el costo del tratamiento es:" + costo);
                break;    
                
        }
    }
    
}
