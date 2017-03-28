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
public class Triangulo extends Figura {
    private double lado;
    private double base;
    private double altura;
    
    public Triangulo(double lado, double base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        double area = (base*altura)/2;
        return area;
    }
    @Override
    public double calcularPerimetro () {
        return lado*3;
    }
}
