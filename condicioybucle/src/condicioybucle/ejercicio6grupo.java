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
public class ejercicio6grupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean on = true;
        System.out.println("Ingrese el primer número:");
        double a = input.nextInt();
        System.out.println("Ingrese el segundo número:");
        double b = input.nextInt();
        double resultado;
        double resultadoD;
        
        while (on == true) {            
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            int opcion = input.nextInt();
            String conf;
            switch (opcion) {
                case 1:
                    resultado = a + b;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = a - b;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = a * b;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("El resultado de la división es: " + a / b );
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir del programa (S/N)?");
                    conf = input.next();
                    if (conf.toLowerCase().equals("s")) {
                        on = false;
                        System.out.println("Hasta la próxima!");
                    }
                    break;
                default:
                    System.out.println("La opción ingresada es inválida. Pruebe de nuevo.");
            }
        }
    }
}