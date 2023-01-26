/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.pooh.pkg02e;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import Servicio.ServicioEdificioDeOficinas;
import Servicio.ServicioPolideportivo;
import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class Guia10POOH02E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Edificio> edificios = new ArrayList<>();
       ServicioPolideportivo sPoli = new ServicioPolideportivo();
       ServicioEdificioDeOficinas sOfi = new ServicioEdificioDeOficinas();
        for (int i = 0; i < 2; i++) {
            Polideportivo e = sPoli.crearEdificioP();
            EdificioDeOficinas f = sOfi.crearEdificio();
            edificios.add(e);
            edificios.add(f);
        }
        int techados=0;
        for (Edificio edificio : edificios) {
            if(edificio instanceof Polideportivo){
            System.out.println("------------ Polideportivo " + ((Polideportivo) edificio).getNombre() + "------------" );
            if(((Polideportivo) edificio).isTecho()){    
            System.out.println("Volumen " + sPoli.calcularVolumen(edificio));
                
                techados+=1;
            }else{
                System.out.println("Este Polideportivo no tiene techo, por ende no tiene volumen");
            }
                System.out.println("Superficie " + sPoli.calcularSuperficie(edificio));
                
                
                
            }
            if(edificio instanceof EdificioDeOficinas){
                System.out.println("------------ Ed. de Oficinas ------------" );
                System.out.println("Volumen " + sOfi.calcularVolumen(edificio));
                
                System.out.println("Superficie " + sOfi.calcularSuperficie(edificio));
                
                sOfi.cantPersonas((EdificioDeOficinas) edificio);
            }
        }
        
        System.out.println("Hay " + techados + " polideportivos techados.");
    }
    
}
