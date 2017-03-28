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
public class CuentaAhorro extends CuentaCorriente {
    private double interes;

    /**
     *
     * @param titular
     * @param numCuenta
     * @param saldo
     * @param interes
     */
    public CuentaAhorro(Titular titular, NumeroDeCuenta numCuenta, double saldo, double interes) {
        super(titular, numCuenta, saldo);
        this.interes = interes;
    }

    /**
     *
     * @param titular
     * @param numCuenta
     * @param interes
     */
    public CuentaAhorro(Titular titular, NumeroDeCuenta numCuenta, double interes) {
        super(titular, numCuenta);
        this.interes = interes;
    }

    /**
     *
     * @param titular
     * @param numCuenta
     */
    public CuentaAhorro(Titular titular, NumeroDeCuenta numCuenta) {
        super(titular, numCuenta);
        this.interes = 2.5;
    }

    /**
     *
     * @return
     */
    public double getInteres() {
        return interes;
    }
    
    /**
     *
     */
    public void calcularInteres() {
        super.setSaldo(super.getSaldo()+(super.getSaldo()*(interes/100)));
    }
}
