/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.Edificio;

/**
 *
 * @author Windows 10
 */
abstract class ServicioEdificio {
     abstract Integer calcularSuperficie(Edificio e);
    
     abstract Integer calcularVolumen(Edificio e);
}
