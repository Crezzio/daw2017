/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author ProfVespertino
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("Factorial:" + Recursivo.factorial(4));
        Recursivo.darVueltaIterativo("12345");
        Recursivo.darVueltaRecursivo("12345");
        Recursivo.invertir("12345\n");
        System.out.println();
        
        System.out.println(Recursivo.sumaRecursiva("123456"));
        System.out.println(Recursivo.sumaIterativa("1234567"));
    }
}
