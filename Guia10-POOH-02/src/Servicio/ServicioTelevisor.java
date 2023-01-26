/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioTelevisor extends ServicioElectrodomestico{
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public Televisor crearTelevisor(){
        Televisor t = new Televisor();
        Electrodomestico e = super.crearElectrodomestico();
        System.out.print("Resolucion en px: ");
        t.setResolucion(leer.nextInt());
        System.out.println("Tiene sintonizador? :");
        t.setSintonizador(leer.nextBoolean());
        t.setColor(e.getColor());
        t.setConsumoEnergetico(e.getConsumoEnergetico());
        t.setPeso(e.getPeso());
        t.setPrecio(0);
        precioFinal(e, t);
        return t;       

    }
    
    public void precioFinal(Electrodomestico e, Televisor t){
        Integer precio = super.precioFinal(e);
        if(t.getSintonizador()){
            precio +=500;
        }
        if(t.getResolucion()>40){
            t.setPrecio((int) (precio * 1.3));
        } 
        System.out.println("Precio " + t.getPrecio());
        
    }
    
    public void imprimir(Televisor t){
        System.out.println("Televisor: color - " + t.getColor()+ "\n consumo - " + t.getConsumoEnergetico() + "\n peso -" + t.getPeso() + "\n precio - " + t.getPrecio() + "\n sintonizador - " + t.getSintonizador() + "\n resolucion - " + t.getResolucion()  );
    }
}
