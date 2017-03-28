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
public class CuentaCorriente {
    private Titular titular;
    private NumeroDeCuenta numCuenta;
    private double saldo;

    /**
     *
     * @param titular
     * @param numCuenta
     * @param saldo
     */
    public CuentaCorriente(Titular titular, NumeroDeCuenta numCuenta, double saldo) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    /**
     *
     * @param titular
     * @param numCuenta
     */
    public CuentaCorriente(Titular titular, NumeroDeCuenta numCuenta) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = 15.3;
    }

    /**
     *
     * @return
     */
    public Titular getTitular() {
        return titular;
    }

    /**
     *
     * @return
     */
    public NumeroDeCuenta getNumCuenta() {
        return numCuenta;
    }

    /**
     *
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     *
     * @param cantidad
     */
    public void ingresar (double cantidad) {
        this.setSaldo(this.getSaldo()+cantidad);
    }
    
    /**
     *
     * @param cantidad
     */
    public void reintegro (double cantidad) {
        if (this.getSaldo()<cantidad)
            System.out.println("NO TIENES TANTO DINERO, ¡MANGARRIÁN! Tienes SOLO: "+this.getSaldo());
        else    
            this.setSaldo(this.getSaldo()-cantidad);
    }
    
    /**
     *
     */
    public void datosCuenta () {
        System.out.println("El número de cuenta es: "+this.getNumCuenta().toString()+" y el saldo de la misma es: "+this.getSaldo());
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
        final CuentaCorriente other = (CuentaCorriente) obj;
        if (this.numCuenta.getBanco()==other.getNumCuenta().getBanco()) {
            if (this.numCuenta.getSucursal()==other.getNumCuenta().getSucursal()) {
                if (this.numCuenta.getDigitoControl()==other.getNumCuenta().getDigitoControl()) {
                    return this.numCuenta.getNumCuenta()==other.getNumCuenta().getNumCuenta();
                }
            } else 
                return false;
        } else 
            return false;
        return false;
    }   
}
