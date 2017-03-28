/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Christian y Alexis
 */
public class Recursivo {
    public static int factorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    
    public static void invertir(String num) { // Version profesor
        int ultimaPos;        
        
        if (num.length()==1) {
            System.out.print("" + num);
            
        } else {
            ultimaPos = num.length() - 1;
            System.out.print("" + num.charAt(ultimaPos));
            invertir(num.substring(0, ultimaPos));
        }        
    }
    
    public static void darVueltaRecursivo(String nInicial) { // Version nuestra
        StringBuilder nCambiado = new StringBuilder(nInicial);
        int longitud = nCambiado.length();
        
        if (nCambiado.length()==1) { // Caso base
            System.out.print(nCambiado);
        } else { // Caso recursivo
            System.out.print(nCambiado.charAt(longitud-1));
            darVueltaRecursivo(nInicial.substring(0, longitud-1));
        }
    }
    
    public static void darVueltaIterativo(String nInicial) {
        StringBuilder nCambiado = new StringBuilder(nInicial);
        char c;
        
        int longitud = nCambiado.length();
        for (int i=longitud-1; i>-1; i--) {
            c = nCambiado.charAt(i);
            nCambiado.append(c);
        }
        
        nCambiado.delete(0, longitud);
        
        System.out.println("El número "+nInicial+" al revés es: "+nCambiado);
    }
    
    public static int sumaRecursiva(String nInicial) {
        if (nInicial.length()==1) {
            return Integer.parseInt(nInicial);
        } else {
            int cifraInicial = Integer.parseInt(""+nInicial.charAt(0));
            String siguienteString = nInicial.substring(1, nInicial.length());
            return cifraInicial+sumaRecursiva(siguienteString);
        }
    }
    
    public static int sumaIterativa(String nInicial) {
        int acum = 0;
        for(int i=0; i<nInicial.length(); i++) {
            acum = acum + Integer.parseInt(""+nInicial.charAt(i));
        }
        return acum;
    }
}
