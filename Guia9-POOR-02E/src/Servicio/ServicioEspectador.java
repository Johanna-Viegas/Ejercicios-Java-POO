/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Espectador;
import Entidad.Sala;
import Enum.Nombre;
import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class ServicioEspectador {
    
    /*
    private String nombre;
    private Integer edad;
    private Integer efectivoDisp;
    */
    
    ArrayList<Espectador> espectadores = new ArrayList<>();
    
    public ArrayList<Espectador> crearEspectadores(){
        Nombre nombre;
        Integer edad;
        Integer efectivoDisp;
        for (int i = 0; i < 3; i++) {
            for (Nombre nombres : Nombre.values()) {
              nombre = nombres;
              edad = (int) (Math.random()*40+1);
              efectivoDisp =  (int) (Math.random()*1500+100);
              Espectador e = new Espectador(nombre, edad, efectivoDisp);
              espectadores.add(e);
            }
        }
        return espectadores;
    }
    
}
