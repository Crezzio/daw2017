/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dome1.*;
import practica1.*;

/**
 *
 * @author Alexis
 */
public class Main {

    public static void main(String[] args) {

        Cirujano cirujano1 = new Cirujano();
        
        MedicoDeCabecera medicoCabecera1 = new MedicoDeCabecera();
        
        Medico medico1 = new Medico();
  
        medicoCabecera1.tratarPaciente();
        
        
        
        
        

        /*
            
        CD cd1 = new CD("Música1", "Juan", 12, 120);
        CD cd2 = new CD("CD2", "Luis", 23, 130);

        dome1.Database database1 = new dome1.Database();

        database1.addCD(cd1);
        database1.addCD(cd2);

        cd1.setComment("Esto es un comentario para el cd1.");
        cd2.setComment("Esto es otro comentario para el cd2.");

        database1.list();
        
         */
    }

}
