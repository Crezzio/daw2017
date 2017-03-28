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
public class Empleado_por_horas extends Empleado {
    private static final double PRECIOHORA = 10;
    private int numeroHoras;

    public Empleado_por_horas(String NIF, String nombre, int edad) {
        super(NIF, nombre, edad);
        this.setNumeroHoras(0);        
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }    
       
    @Override
    public double calculaSueldo() {
        double SMI = super.calculaSueldo();
        double salario = SMI+(this.numeroHoras*PRECIOHORA);
        return salario;
    }
}
