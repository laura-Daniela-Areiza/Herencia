/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherencia1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author dani_
 */
public class EjercicioHerencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal p1 = new Perro("Perla", "Purina", 2, "Bulldog frances");
        p1.mostrarAlimento();
        
        Animal p2 = new Perro("Tauro", "Purina", 2, "Bulldog frances");
        p2.mostrarAlimento();
        
        Animal g1 = new Gato("Tommy", "Ratones", 5, "siberiano");
        g1.mostrarAlimento();
        
        Animal c1 = new Caballo("Spirit", "Pasto", 3, "Percheron");
        c1.mostrarAlimento();
    }
    
}
