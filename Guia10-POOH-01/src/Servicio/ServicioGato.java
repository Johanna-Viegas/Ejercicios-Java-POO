/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Animal;
import Entidad.Gato;

/**
 *
 * @author Windows 10
 */
public class ServicioGato extends ServicioAnimal {
    
     
    @Override
    public void alimentarse(Animal p){
        System.out.println("El Gato se alimenta de " + p.getAlimento() );
    }

}
