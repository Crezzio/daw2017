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
public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura();
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(5);
        Triangulo triangulo = new Triangulo(5,6,4);
        
        System.out.println("Los datos calculados del círculo son:");
        System.out.println("Área="+Matematico.averiguaArea(circulo));
        System.out.println("Perímetro="+Matematico.averiguaPerimetro(circulo)+"\n");
        
        System.out.println("Los datos calculados del cuadrado son:");
        System.out.println("Área="+Matematico.averiguaArea(cuadrado));
        System.out.println("Perímetro="+Matematico.averiguaPerimetro(cuadrado)+"\n");
        
        System.out.println("Los datos calculados del triangulo son:");
        System.out.println("Área="+Matematico.averiguaArea(triangulo));
        System.out.println("Perímetro="+Matematico.averiguaPerimetro(triangulo)+"\n");
        
        System.out.println("Los datos calculados de la figura son:");
        System.out.println("Área="+Matematico.averiguaArea(figura));
        System.out.println("Perímetro="+Matematico.averiguaPerimetro(figura)+"\n");
    }
}
