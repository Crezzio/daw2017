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
public class DeportivaAMotor extends Barco{
    private int potenciaCV;

    public DeportivaAMotor(String matricula, double eslora, int añoFabricacion, int potenciaCV) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }
    
    @Override
    public double precioAmarreDia() {
        double precio = super.precioAmarreDia()+getPotenciaCV();
        return precio;
    }
}
