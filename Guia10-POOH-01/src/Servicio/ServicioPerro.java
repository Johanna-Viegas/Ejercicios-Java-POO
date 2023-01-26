/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Animal;
import Entidad.Perro;

/**
 *
 * @author Windows 10
 */
public class ServicioPerro extends ServicioAnimal {
    
    
    
    @Override
    public void alimentarse(Animal p){
        System.out.println("El Perro se alimenta de " + p.getAlimento() );
    }
}
