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
public class Run {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("16643726Y", "Christian", 21);
        GregorianCalendar fActual = new GregorianCalendar();
        GregorianCalendar fBaja = new GregorianCalendar(31,12,2017);
        Empleado_temporal empTem = new Empleado_temporal (fActual, fBaja, "16543486T", "Alexis", 20);
        Empleado_fijo empFijo = new Empleado_fijo (1995, "16543776F", "Javier", 37);
        Empleado_por_horas empHoras = new Empleado_por_horas ("16884532H", "David", 43);
        empHoras.setNumeroHoras(40);
        
        System.out.println("Los datos del empleado son:");
        System.out.println(empleado.toString());
        System.out.println("Su salario es: "+empleado.calculaSueldo()+" € \n");
        
        System.out.println("Los datos del empleado temporal son:");
        System.out.println(empTem.toString());
        System.out.println("Su salario es: "+empTem.calculaSueldo()+" € \n");
        
        System.out.println("Los datos del empleado fijo son:");
        System.out.println(empFijo.toString());
        System.out.println("Su salario es: "+empFijo.calculaSueldo()+" € \n");
        
        System.out.println("Los datos del empleado por horas son:");
        System.out.println(empHoras.toString());
        System.out.println("Su salario es: "+empHoras.calculaSueldo()+" € \n");
    }
}
