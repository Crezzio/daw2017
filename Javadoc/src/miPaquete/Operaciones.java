/**
 * 
 */
package miPaquete;

/**
 * {@code Operaciones} es una clase creada con mucho amor y cariño en el día de "Sam va lentín" para todos aquellos Frodos que dejan atrás a sus amigos solo porque van lentos.
 * Además, dicha clase también sirve para realizar operaciones con 2 valores {@code a} y {@code b}, principalmente sumas y restas, aparte de multiplicar dichos valores por un {@code parametro} introducido por el usuario.
 * @author Alexis Téllez
 * @version 1.0 - 14/02/2017
 * @since JDK1.8
 *
 */
public class Operaciones {
	private int a, b;
	public static final double SMI=5311.234;
	
	public Operaciones (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Operaciones () {
		a = 0;
		b = 0;
	}
	
	/**
	 * 
	 * @return el resultado de la suma de {@code a} más {@code b}.
	 */
	
	public int calculaSuma () {
		return (a+b);
	}
	
	/**
	 * 
	 * @return el resultado de la resta de {@code a} menos {@code b}
	 */
	
	public int calculaResta () {
		return (a-b);
	}
	
	/**
	 * 
	 * @param parametro
	 * @return el resultaod de la multiplicación de {@code a} por {@code b} y por {@code parametro}.
	 */
	
	public int multiplicaNumero (int parametro) {
		return (a*b*parametro);
	}
}
