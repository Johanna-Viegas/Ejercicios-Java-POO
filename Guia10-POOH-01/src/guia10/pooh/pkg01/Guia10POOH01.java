/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.pooh.pkg01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;
import Servicio.ServicioAnimal;
import Servicio.ServicioCaballo;
import Servicio.ServicioGato;
import Servicio.ServicioPerro;

/**
 *
 * @author Windows 10
 */
public class Guia10POOH01 {

    /**
    
     */
    public static void main(String[] args) {
        
        ServicioAnimal perro = new ServicioPerro();
        ServicioAnimal gato = new ServicioGato();
        ServicioAnimal caballo = new ServicioCaballo();
        
        

        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        
        perro.alimentarse(perro1);
        perro.alimentarse(perro2);
        gato.alimentarse(gato1);
        caballo.alimentarse(caballo1);
        
    }
    
}
