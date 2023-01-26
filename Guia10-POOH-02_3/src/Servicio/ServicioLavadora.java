/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioLavadora extends ServicioElectrodomestico{
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public Lavadora crearLavadora(){
        Lavadora l = new Lavadora();
        Electrodomestico e = super.crearElectrodomestico();
        System.out.print("Carga: ");
        l.setCarga(leer.nextInt());
        l.setColor(e.getColor());
        l.setConsumoEnergetico(e.getConsumoEnergetico());
        l.setPeso(e.getPeso());
        l.setPrecio(0);
        precioFinal(e, l);
        return l;       

    }
    
    public void precioFinal(Electrodomestico e, Lavadora l){
        Integer precio = super.precioFinal(e);
        if(l.getCarga()>=30){
            l.setPrecio(precio + 500);
        } 
        System.out.println("Precio " + l.getPrecio());
        
    }
    
        public void imprimir(Lavadora t){
        System.out.println("Lavadora: color - " + t.getColor()+ "\n consumo - " + t.getConsumoEnergetico() + "\n peso -" + t.getPeso() + "\n precio - " + t.getPrecio() + "\n carga - " + t.getCarga() );
    }
}
