/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras_polimorfismo;

/**
 *
 * @author Vespertino
 */
public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado (double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        double area = lado*lado;
        return area;
    }
    @Override
    public double calcularPerimetro () {
        return lado*4;
    }
}
