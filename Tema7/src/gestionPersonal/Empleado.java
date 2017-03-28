/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionPersonal;

/**
 *
 * @author Vespertino
 */
public class Empleado {
    private String NIF;
    private String nombre;
    private int edad;
    private static final double SMI = 707;

    public Empleado(String NIF, String nombre, int edad) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.edad = edad;        
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "NIF=" + NIF + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public double calculaSueldo() {
        return SMI;
    }
}
