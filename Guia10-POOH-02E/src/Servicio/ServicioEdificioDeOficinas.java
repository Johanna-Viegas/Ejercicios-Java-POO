/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioEdificioDeOficinas extends ServicioEdificio{

    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        @Override
        public  Integer calcularSuperficie(Edificio e){
        return (e.getAncho()*e.getLargo());
    }
    
    
        @Override
    public  Integer calcularVolumen(Edificio e){
            return (e.getAlto()*e.getAncho()*e.getLargo());

    }
    
    public EdificioDeOficinas crearEdificio(){
        EdificioDeOficinas e = new EdificioDeOficinas();
        System.out.print("Ancho del piso: ");
        e.setAncho(leer.nextInt());
        System.out.print("Alto del piso: ");
        e.setAlto(leer.nextInt());
        System.out.print("Largo del piso: ");
        e.setLargo(leer.nextInt());
        System.out.print("Personas por oficina: ");
        e.setPersonasPOficina(leer.nextInt());
        System.out.print("Oficinas por piso: ");
        e.setnOficinas(leer.nextInt());
        System.out.print("Cantidad de pisos: ");
        e.setnPisos(leer.nextInt());
        return e;
    }
    
    public void cantPersonas(EdificioDeOficinas e){
        System.out.println("Cantidad de personas que entran por piso: " + (e.getPersonasPOficina()*e.getnOficinas()));
        System.out.println("Cantidad de personas que entran en el edificio: " + (e.getPersonasPOficina()*e.getnOficinas()*e.getnPisos()));
        
    }
}
