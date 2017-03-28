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
public class NumeroDeCuenta {
    private int banco;
    private int sucursal;
    private int digitoControl;
    private int numCuenta;

    /**
     *
     * @param banco
     * @param sucursal
     * @param digitoControl
     * @param numCuenta
     */
    public NumeroDeCuenta(int banco, int sucursal, int digitoControl, int numCuenta) {
        setBanco(banco);
        
        setSucursal(sucursal);
        
        setDigitoControl(digitoControl);
        
        setNumCuenta(numCuenta);
    }
    
    private boolean comprobacionLongitud (int numero, int cifras) {
        String numeroString = ""+numero;
        int longitud = numeroString.length();
        return longitud<cifras+1;
    }

    /**
     *
     * @param banco
     */
    public void setBanco(int banco) {
        if (comprobacionLongitud(banco,4))
            this.banco = banco;
        else {
            this.banco = -1;
            CuadroDialogo popUp = new CuadroDialogo("Falló el número del banco. Introduzca el valor de nuevo");
        }
    }

    /**
     *
     * @param sucursal
     */
    public void setSucursal(int sucursal) {
        if (comprobacionLongitud(sucursal,4))
            this.sucursal = sucursal;
        else {
            this.sucursal = -1;
            CuadroDialogo popUp = new CuadroDialogo("Falló el número de la sucursal. Introduzca el valor de nuevo");
        }
    }

    /**
     *
     * @param digitoControl
     */
    public void setDigitoControl(int digitoControl) {
        if (comprobacionLongitud(digitoControl,2))
            this.digitoControl = digitoControl;
        else {
            this.digitoControl = -1;
            CuadroDialogo popUp = new CuadroDialogo("Falló el dígito de control. Introduzca el valor de nuevo");
        }
    }

    /**
     *
     * @param numCuenta
     */
    public void setNumCuenta(int numCuenta) {
        if (comprobacionLongitud(numCuenta,10))
            this.numCuenta = numCuenta;
        else {
            this.numCuenta = -1;
            CuadroDialogo popUp = new CuadroDialogo("Falló el número de cuenta. Introduzca el valor de nuevo");
        }
    }

    /**
     *
     * @return
     */
    public int getBanco() {
        return banco;
    }

    /**
     *
     * @return
     */
    public int getSucursal() {
        return sucursal;
    }

    /**
     *
     * @return
     */
    public int getDigitoControl() {
        return digitoControl;
    }

    /**
     *
     * @return
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String bancoString = completarCifras(banco,numeroCifras(banco),4);
        String sucursalString = completarCifras(sucursal,numeroCifras(sucursal),4);
        String digitoControlString = completarCifras(digitoControl,numeroCifras(digitoControl),2);
        String numCuentaString = completarCifras(numCuenta,numeroCifras(numCuenta),10);
        return "NumeroDeCuenta{" + "banco=" + bancoString + ", sucursal=" + sucursalString + ", digitoControl=" + digitoControlString + ", numCuenta=" + numCuentaString + '}'+"\n"+bancoString+" "+sucursalString+" "+digitoControlString+" "+numCuentaString;
    }
    
    private int numeroCifras (int numero) {
        String numeroString = ""+numero;
        return numeroString.length();
    }
    
    private String completarCifras (int numero, int cifrasActuales, int cifrasNecesarias) {
        int resta;
        StringBuilder numeroCambiado = new StringBuilder();
        if (cifrasActuales==cifrasNecesarias)
            return ""+numero;
        else {
            resta = cifrasNecesarias - cifrasActuales;
            for (int i=0; i<resta; i++) {
                numeroCambiado.append("0");
            }
            numeroCambiado.append(numero);
            return numeroCambiado.toString();
        }
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
        final NumeroDeCuenta other = (NumeroDeCuenta) obj;
        if (this.banco != other.banco) {
            return false;
        }
        if (this.sucursal != other.sucursal) {
            return false;
        }
        if (this.digitoControl != other.digitoControl) {
            return false;
        }
        return this.numCuenta == other.numCuenta;
    }  
}
