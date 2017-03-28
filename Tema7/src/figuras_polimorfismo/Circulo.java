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
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        double area = Math.PI*radio*radio;
        return area;
    }
    @Override
    public double calcularPerimetro () {
        double perimetro = Math.PI*2*radio;
        return perimetro;
    }
}
