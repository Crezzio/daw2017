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
public class Empleado_fijo extends Empleado {
    private int anyoAlta;
    private float complemento;

    public Empleado_fijo(int anyoAlta, String NIF, String nombre, int edad) {
        super(NIF, nombre, edad);
        this.anyoAlta = anyoAlta;
        complemento = 20.0F;
    }

    public void setComplemento(float complemento) {
        this.complemento = complemento;
        
    }
        
    @Override
    public double calculaSueldo() {
        double SMI = super.calculaSueldo();       
        Calendar calendar = new GregorianCalendar();
        int anyoActual = calendar.get(Calendar.YEAR);
        int anyosAntiguedad = anyoActual - anyoAlta;
        double salario = SMI + (this.complemento*anyosAntiguedad);
        return salario;
    }
    
}
