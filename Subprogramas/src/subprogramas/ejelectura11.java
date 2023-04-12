/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ejelectura11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("ingrese una frase");
        String frase = leer.nextLine ();
        System.out.println("la frase cambiada es:");
        System.out.println(modificar(frase));
    }
    
    public static String modificar (String frase){
        int cantidad = frase.length();
        String retorno = "";
        for (int i = 0; i < cantidad; i++) {
            String subcadena = frase.substring(i, i+1);
            
            String subcadena1 = subcadena.toUpperCase();
            if (subcadena1.equals("A") || subcadena1.equals("E")|| subcadena1.equals("I")|| subcadena1.equals("O")|| subcadena1.equals("U")){
                switch (subcadena.toUpperCase()){
                case "A":
                    retorno = retorno + "@";
                    break;
                case "E":
                    retorno = retorno + "#";
                    break;
                case "I":
                    retorno = retorno + "$";
                    break;
                case "O":
                    retorno = retorno + "%";
                    break;
                case "U":
                    retorno = retorno + "*";
                    break;
            }
            }else{
            retorno =retorno+ frase.substring(i, i+1);   
            }
           
            
            
            
        }
       return retorno; 
    }
    
}
