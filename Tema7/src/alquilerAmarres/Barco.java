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
public class Barco {
    private String matricula;
    private double eslora;
    private int añoFabricacion;
    private static final double COMPLEMENTO=2;
    private static final double VALORCONSTANTE=10;

    public Barco(String matricula, double eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public double getEslora() {
        return eslora;
    }
    
    public double precioAmarreDia() {
        return COMPLEMENTO*VALORCONSTANTE*eslora;
    }
}
