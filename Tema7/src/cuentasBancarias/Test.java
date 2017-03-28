/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasBancarias;

/**
 *
 * @author Vespertino
 */
public class Test {

    public static void main(String[] args) {
        CuentaCorriente cuCorriente = new CuentaCorriente(new Titular("Christian","Tellez",21),new NumeroDeCuenta(59999,1234,23,1111111111));
        CuentaAhorro cuAhorro = new CuentaAhorro(new Titular("Alexis","Alonso",20), new NumeroDeCuenta(1234,5,3,2111111111));
        CuentaCorriente cuIgual = new CuentaAhorro(new Titular("Alexis","Alonso",20), new NumeroDeCuenta(1234,5,3,2111111111));
        
        System.out.println(cuAhorro.getTitular().toString());
        System.out.println(cuCorriente.getTitular().toString());
        
        System.out.println(cuAhorro.equals(cuIgual));
        
        System.out.println(cuCorriente.getNumCuenta().toString());
        
        System.out.println("Los titulares son iguales? "+cuAhorro.getTitular().equals(cuIgual.getTitular()));
        
        System.out.println("Las cuentas son iguales? "+cuAhorro.getNumCuenta().equals(cuIgual.getNumCuenta()));
    }
}
