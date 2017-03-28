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
public enum PosicionAmarre {
    
    PROA("Proa"), POPA("Popa"), BABOR("Babor"), ESTRIBOR("Estribor");
    
    private String nombrePosicion;
    
    private PosicionAmarre(String nombrePosicion)  {
        this.nombrePosicion = nombrePosicion;
    }
    
    
}
