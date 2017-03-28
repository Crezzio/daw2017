/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2D;

/**
 *
 * @author Vespertino
 */
public class Test {
    public static void main(String[] args) {
        Punto primerPunto = new Punto(2, 2);
        Punto segundoPunto = new Punto(2, 2);
        
        System.out.println(primerPunto.toString()+".  La coordenada mayor del segundo punto es: "+segundoPunto.equals());
        System.out.println(segundoPunto.toString()+".  La coordenada mayor del primer punto es: "+primerPunto.equals());
        System.out.println("¿Son iguales?");
        System.out.println(primerPunto.equals(segundoPunto));
    }
}
