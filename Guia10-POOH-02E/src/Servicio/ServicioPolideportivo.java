/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Edificio;
import Entidad.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioPolideportivo extends ServicioEdificio{
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    @Override
    public  Integer calcularSuperficie(Edificio e){
        return (e.getAncho()*e.getLargo());
    }
    
    
    @Override
    public  Integer calcularVolumen(Edificio e){
        Integer vol = e.getAlto()*e.getAncho()*e.getLargo();
            return vol;

    }
    
    public Polideportivo crearEdificioP(){
        Polideportivo e = new Polideportivo();
        System.out.print("Nombre: ");
        e.setNombre(leer.next());
        System.out.print("Ancho del piso: ");
        e.setAncho(leer.nextInt());
        System.out.print("Alto del piso: ");
        e.setAlto(leer.nextInt());
        System.out.print("Largo del piso: ");
        e.setLargo(leer.nextInt());
        System.out.print("Esta techado: ");
        e.setTecho(leer.nextBoolean());
        return e;
    }
}
