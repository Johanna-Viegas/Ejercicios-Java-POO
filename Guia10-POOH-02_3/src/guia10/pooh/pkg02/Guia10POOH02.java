/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.pooh.pkg02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ServicioLavadora;
import Servicio.ServicioTelevisor;
import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class Guia10POOH02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> Electrodomesticos = new ArrayList<>();
        
        ServicioLavadora servLav = new ServicioLavadora();
        
        Lavadora l = new Lavadora(30, 200, "azul",'D', 100);
        servLav.imprimir(l);
        Electrodomesticos.add(l);
        
        Lavadora l1 = new Lavadora(20, 500, "azul",'D', 200);
        servLav.imprimir(l1);
        Electrodomesticos.add(l1);
        
        ServicioTelevisor servTv = new ServicioTelevisor();
        
        Televisor t = new Televisor(120, true, 400, "azul",'D', 100);
        servTv.imprimir(t);
        Electrodomesticos.add(t);
        
        Televisor t1 = new Televisor(120, false, 800, "azul",'D', 100);
        servTv.imprimir(t1);
        Electrodomesticos.add(t1);
        
        
        Integer lav = 0;
        Integer tv =0;
        String nombre;
        for (Electrodomestico Electrodomestico1 : Electrodomesticos) {
            nombre= Electrodomestico1.getClass().getSimpleName();
            if(nombre.equalsIgnoreCase("lavadora")){
                lav += Electrodomestico1.getPrecio();
            } else {
                tv += Electrodomestico1.getPrecio();
            }
            
        }
        System.out.println("SUMA LAVADORAS: " + lav);
        System.out.println("SUMA TVs: " + tv);
        System.out.println("SUMA TOTAL: " + (lav+tv));
    }
    
}
