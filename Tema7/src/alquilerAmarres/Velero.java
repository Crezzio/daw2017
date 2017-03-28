/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerAmarres;

/**
 *
 * @author Vespertino
 */
public class Velero extends Barco{
    private int numMastiles;

    public Velero(String matricula, double eslora, int añoFabricacion, int numMastiles) {
        super(matricula, eslora, añoFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }
    
    @Override
    public double precioAmarreDia() {
        double precio = super.precioAmarreDia()+(getNumMastiles()*5);
        return precio;
    }
}
