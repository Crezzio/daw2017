/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasBancarias;

import java.util.Objects;

/**
 *
 * @author Vespertino
 */
public class Titular {    
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     *
     * @param nombre
     * @param apellidos
     * @param edad
     */
    public Titular(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }
    
    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Los datos del Titular son: " + "\nNombre=" + nombre + "\nApellidos=" + apellidos + "\nEdad=" + edad;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Titular other = (Titular) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }
}
