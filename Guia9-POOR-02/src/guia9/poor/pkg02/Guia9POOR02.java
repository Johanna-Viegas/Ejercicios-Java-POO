/*

 */
package guia9.poor.pkg02;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import Servicio.Servicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia9POOR02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cuantos jugadores desean participar?");
        int participantes = leer.nextInt();
        if (participantes>6){
        participantes =6;
    } 
        if (participantes<1){
            participantes =1;
        }
        
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        for (int i = 1; i < participantes+1; i++) {
            Integer id = i;
            System.out.println("Como se llama el participante " + i);
            String nombre = leer.next();
            String completo = id.toString().concat(nombre);
            jugadores.add(new Jugador(id,completo,false));
        }
        
        Revolver r = new Revolver();
        r.llenarRevolver();
        
        Servicio service = new Servicio();
        
        Juego juego = service.llenarJuego(jugadores, r);
        
        
            
            service.ronda(juego);
        
        
        
    }
    
}
