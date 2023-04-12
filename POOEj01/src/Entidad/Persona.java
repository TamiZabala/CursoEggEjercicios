/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Tamara
 */
public class Persona {

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    private String nombre;
    private int edad;
    private String genero;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre (){
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + '}';
    }
    
}
