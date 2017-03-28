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
public class Matematico {
    public static double averiguaPerimetro(Figura figura) {
        if (figura instanceof Circulo)
            System.out.println("Es un circulo");
        else if (figura instanceof Triangulo)
            System.out.println("Es un triángulo");
        else if (figura instanceof Cuadrado)
            System.out.println("Es un cuadrado");
        return figura.calcularPerimetro();
    }
    
    public static double averiguaArea(Figura figura) {
        return figura.calcularArea();
    }
}
