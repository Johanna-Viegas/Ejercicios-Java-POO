/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioElectrodomestico {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public char comprobarConsumoEnergetico(char letra){
        if(letra>='A' && letra<='F'){
            return letra;
        } else {
            return 'F';
        } 
    }
    
    public String comprobarColor(String color){
        if(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")){
            return color;
        } else {
            return "blanco";
        } 
    }
    
    public Electrodomestico crearElectrodomestico(){
        //precio, color, consumo energético y peso.
        Electrodomestico e = new Electrodomestico();
        System.out.print("Color: ");
        e.setColor(comprobarColor(leer.next()));
        System.out.print("Consumo energético: ");
        e.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0)));
        System.out.print("Peso: ");
        e.setPeso(leer.nextInt());
        e.setPrecio(0);
        return e;
 
    }
    
    public Integer  precioFinal(Electrodomestico e){
        switch(e.getConsumoEnergetico()){
            case 'A':
                e.setPrecio(e.getPrecio()+1000);
                break;
            case 'B':
                e.setPrecio(e.getPrecio()+800);
                break; 
            case 'C':
                e.setPrecio(e.getPrecio()+600);
                break;
            case 'D':
                e.setPrecio(e.getPrecio()+500);
                break;
            case 'E':
                e.setPrecio(e.getPrecio()+300);
                break;
            case 'F':
                e.setPrecio(e.getPrecio()+100);
                break;    
        }
        if(e.getPeso()>=1 && e.getPeso()<=19){
            e.setPrecio(e.getPrecio()+100);
        } 
        if (e.getPeso()>=20 && e.getPeso()<=49){
            e.setPrecio(e.getPrecio()+500);
        }
        if (e.getPeso()>=50 && e.getPeso()<=79){
            e.setPrecio(e.getPrecio()+800);
        }
        if (e.getPeso()>=80 ){
            e.setPrecio(e.getPrecio()+1000);
        }
            return e.getPrecio();
    }

    
}
