/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresyarreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ejercicio3grupo {

    /**
     * @param args the command line arguments
     */
    
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();

    static final int MAX_DIGITS = 5;
    static final int MAX = (int) Math.pow(10, MAX_DIGITS);
    static final int MIN = 0;

    public static void main(String[] args) {

        int digitCounters[] = {0, 0, 0, 0, 0};

        System.out.print("Indique la cantidad de números a generar: ");
        int[] numbers = new int[scan.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(MAX - MIN) + MIN; //[0; MAX)
        }

        for (int i = 0; i < numbers.length; i++) {
//			int counter = 0,
//				aux = numbers[i];
//			
//			while (aux > 0) {
//				aux = Math.round(aux / 10);
//				counter++;
//			}
//			
//			digitCounters[counter - 1]++;

            digitCounters[String.valueOf(numbers[i]).length() - 1]++;
        }

        System.out.printf("\nDe los %d números\n" //Método de escritura que espera variables por cada %{}. d = entero, f = flotante, s = String
                + "%d son de 1 cifra\n"
                + "%d son de 2 cifras\n"
                + "%d son de 3 cifras\n"
                + "%d son de 4 cifras\n"
                + "%d son de 5 cifras\n\n", numbers.length, digitCounters[0], digitCounters[1], digitCounters[2], digitCounters[3], digitCounters[4]);
    }
}


