/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresyarreglos;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class ejercicioextra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("ingrese las notas de los 10 alumnos");
        double nota1, nota2, nota3,nota4;
        double[][] matriz= new double[5][2];
        int fila=0, columna=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese las notas del alumno n°"+ (i+1));
            System.out.println("nota 1");
            nota1= leer.nextDouble();
            while (nota1<1 || nota1>10){
                nota1= leer.nextDouble();
            }
            System.out.println("nota 2");
            nota2= leer.nextDouble();
            while (nota2<1 || nota2>10){
                nota2= leer.nextDouble();
            }
            System.out.println("nota 3");
            nota3= leer.nextDouble();
            while (nota3<1 || nota3>10){
                nota3= leer.nextDouble();
            }
            System.out.println("nota 4");
            nota4= leer.nextDouble();
            
            while (nota4<1 || nota4>10){
                nota4= leer.nextDouble();
            }
            
            double notafinal= nota1*0.1+nota2*0.15+nota3*0.25+nota4*0.5;
            
            
            matriz[fila][columna]=notafinal;
            
            fila++;
            if (i==4){
                fila=0;
                columna=1;
                
            }

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" "+ matriz[i][j]);
            }
            System.out.println(" ");
  
        }
        mostrar(matriz);
         
    }
    public static void mostrar (double[][] matriz){
        int aprobado=0, reprobado=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j]>= 7){
                    aprobado++;
                }else{
                    reprobado++;
                }
            }
        }
        System.out.println("la cantidad de aprobados es igual a:"+aprobado);
        System.out.println("la cantidad de reprobados es igual a:"+reprobado);
    }
    
}
