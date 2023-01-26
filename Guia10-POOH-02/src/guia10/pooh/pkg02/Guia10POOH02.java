/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.pooh.pkg02;

import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ServicioLavadora;
import Servicio.ServicioTelevisor;

/**
 *
 * @author Windows 10
 */
public class Guia10POOH02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioLavadora servLav = new ServicioLavadora();
        Lavadora l = servLav.crearLavadora();
        servLav.imprimir(l);
        ServicioTelevisor servTv = new ServicioTelevisor();
        Televisor t = servTv.crearTelevisor();
        servTv.imprimir(t);
        
    }
    
}
