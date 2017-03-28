/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionPersonal;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public class Empleado_temporal extends Empleado {
    private GregorianCalendar fAlta;
    private GregorianCalendar fBaja;

    public Empleado_temporal(GregorianCalendar fAlta, GregorianCalendar fBaja, String NIF, String nombre, int edad) {
        super(NIF, nombre, edad);
        this.fAlta = fAlta;
        this.fBaja = fBaja;
    }

}
