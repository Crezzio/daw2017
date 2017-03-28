/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerAmarres;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public class Test {
    public static void main(String[] args) {
        Barco b = new Barco ("2016B", 20, 1995);
        Velero v = new Velero ("5798V", 20, 2006, 5);
        DeportivaAMotor d = new DeportivaAMotor("6879D", 20, 2010, 150);
        Yate y = new Yate("1859Y", 20, 2017, 500, 20);
        
        Calendar c = new GregorianCalendar();
        
        Alquiler aB = new Alquiler("Leandro", "16878943Z", new GregorianCalendar(2016, 12, 31), new GregorianCalendar(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)), PosicionAmarre.PROA, b);
        Alquiler aV = new Alquiler("Leandro", "16878943Z", new GregorianCalendar(2016, 12, 31), new GregorianCalendar(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)), PosicionAmarre.PROA, v);
        Alquiler aD = new Alquiler("Leandro", "16878943Z", new GregorianCalendar(2016, 12, 31), new GregorianCalendar(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)), PosicionAmarre.PROA, d);
        Alquiler aY = new Alquiler("Leandro", "16878943Z", new GregorianCalendar(2016, 12, 31), new GregorianCalendar(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)), PosicionAmarre.PROA, y);
        
        System.out.println(aB.precioAmarreV1()+", "+aB.precioAmarreV2());
        System.out.println(aV.precioAmarreV1()+", "+aV.precioAmarreV2());
        System.out.println(aD.precioAmarreV1()+", "+aD.precioAmarreV2());
        System.out.println(aY.precioAmarreV1()+", "+aY.precioAmarreV2());
        System.out.println("\n"+c.get(Calendar.YEAR)+", "+c.get(Calendar.MONTH)+", "+c.get(Calendar.DAY_OF_MONTH)+", "+c.get(Calendar.DATE));
    }
}
