/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerAmarres;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public class Alquiler {
    private String nombreCliente;
    private String dni;
    private GregorianCalendar fInicial;
    private GregorianCalendar fFinal;
    private PosicionAmarre posicionAmarre;
    private Barco barco;
    private static final double VALORFIJO=2;
    private static final double VALORCONSTANTE=10;

    public Alquiler(String nombreCliente, String dni, GregorianCalendar fInicial, GregorianCalendar fFinal, PosicionAmarre posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fInicial = fInicial;
        this.fFinal = fFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    public double precioAmarreV1() {
        int numeroDias = difDiasEntre2fechas();
        double modulo = VALORCONSTANTE*this.barco.getEslora();
        double precioBase = numeroDias * modulo * VALORFIJO;
        if (this.barco instanceof Velero) {
            Velero velero = (Velero) this.barco;
            return precioBase + velero.getNumMastiles()*5;
        } else if (this.barco instanceof DeportivaAMotor) {
            DeportivaAMotor deportivaAMotor = (DeportivaAMotor) this.barco;
            return precioBase + deportivaAMotor.getPotenciaCV();
        } else if (this.barco instanceof Yate) {
            Yate yate = (Yate) this.barco;
            return precioBase + yate.getPotenciaCV() + yate.getNumCamarotes()*20;
        }
        
        return precioBase;
    }
    
    public double precioAmarreV2() {
        int numeroDias = difDiasEntre2fechas();
        double precioAmarreTotal = this.barco.precioAmarreDia()*numeroDias;
        return precioAmarreTotal;
    }
    
    private int difDiasEntre2fechas() { // Sin parámetro. Solo con las fechas propiedad del alquiler
        GregorianCalendar date1 = this.fInicial;
        GregorianCalendar date2 = this.fFinal;
        long difms = date2.getTimeInMillis() - date1.getTimeInMillis();
        int difd = (int)(difms / (1000 * 60 * 60 * 24));
        return difd;
    }
}
