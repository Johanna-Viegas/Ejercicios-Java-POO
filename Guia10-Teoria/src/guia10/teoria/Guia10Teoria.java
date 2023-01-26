/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.teoria;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class Guia10Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Animal a = new Animal("Animal");
        Animal b = new Perro("Perro");
        Animal c = new Gato("Gato");
        animales.add(a);
        animales.add(b);
        animales.add(c);
        for (Animal animale : animales) {
            animale.saludo();
        }
    }
    
}
