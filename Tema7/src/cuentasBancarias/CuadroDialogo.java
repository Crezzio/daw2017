/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasBancarias;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Vespertino
 */
public class CuadroDialogo extends JFrame {

    /**
     *
     * @param texto
     */
    public CuadroDialogo(String texto) {
        super("ERROR");

        JLabel label = new JLabel(texto);
        getContentPane().add(label);

        setSize(400,100);
        setLocationRelativeTo(null);
        label.setForeground(Color.red);
        setVisible(true);
    }
}
