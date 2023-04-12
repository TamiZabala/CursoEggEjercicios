/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       Libro Libro1 = new Libro();
        System.out.println("Ingrese los datos del libro");
        System.out.println("ISBN");
        Libro1.ISBN= leer.next();
        System.out.println("Titulo");
        Libro1.Titulo= leer.next();
        System.out.println("Autor");
        Libro1.Autor= leer.next();
        System.out.println("Numero de paginas");
        Libro1.NumDePaginas= leer.nextInt();
        
        System.out.println(Libro1.toString());
    }
    
}
