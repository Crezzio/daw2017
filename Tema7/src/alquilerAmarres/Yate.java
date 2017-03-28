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
public class Yate extends Barco{
    private int potenciaCV;
    private int numCamarotes;
    private static final double VALORYATE=20;

    public Yate(String matricula, double eslora, int añoFabricacion, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }
    
    @Override
    public double precioAmarreDia() {
        double precio = super.precioAmarreDia()+getPotenciaCV()+(getNumCamarotes()*VALORYATE);
        return precio;
    }
}
