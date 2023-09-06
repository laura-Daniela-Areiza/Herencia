/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherenciaanimal;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;


/**
 *
 * @author dani_
 */
public class EjemploherenciaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Animal> animals = new ArrayList();

        Animal a = new Animal();
        animals.add(a);
        Animal b = new Perro();
        animals.add(b);
        Animal c = new Gato();
        animals.add(c);
        
        for (Animal x : animals) {
            System.out.println(x.hacerRuido());
        }
    }   
}
