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
public class Punto {
    private int x;
    private int y;
    
    /**
     * Constructor completo
     * @param x valor de la coordenada X.
     * @param y valor de la coordenada Y
     */
    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Constructor que inicializa X e Y a 0.
     */
    public Punto () {
        this(0, 0);
    }
    
    /**
     * Constructor que inicializa X según el valor de un parámetro X e inicializa Y a 1.
     * @param x valor de la coordenada X.
     */
    public Punto (int x) {
        this(x, 1);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    /**
     * Método que convierte a {@code String} los valores de las coordenadas.
     * @return Una cadena con el valor de las coordenadas X e Y.
     */
    @Override
    public String toString () {
        String toString = "X= "+x+"    Y="+y;
        return toString;
    }
    
    /**
     * Método que devuelve true.
     * @param obj objeto a comparar.
     * @return True.
     */
    @Override
    public boolean equals(Object obj) {
        Punto aux = (Punto)obj;
        if (aux.getX()==this.getX() && aux.getY()==this.getY())
            return true;
        else
            return false;
    }
    /**
     * Método que devuelve un entero correspondiente a la coordenada más grande de las dos.
     * @return True, si son iguales. False, si son distintos.
     */
    public int equals() {
        if (x>y) {
            return x;
        } else {
            return y;
        }
    }
}
