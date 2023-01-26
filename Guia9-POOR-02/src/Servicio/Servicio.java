/*
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Servicio {
    /*
        llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
        y el revolver para guardarlos en los atributos del juego.
        10
        */
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Juego llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        Juego juego = new Juego(r, jugadores);
        return juego;
    }
    
    /*
    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    */
    public void ronda(Juego juego){
        boolean rta= false;
        do{
            System.out.println("---------NUEVA RONDA-----------");
            for (Jugador jugador : juego.getJugadores()) {
            System.out.println("--------- " + jugador.getNombre() + " ---------");
            rta= jugador.disparo(juego.getRevolver());
            System.out.println("Mojado: " + rta); 
            
            if(rta){
                System.out.println(juego.getRevolver().toString());
                break;
            } 
        }
        }while(rta!=true);
    }
    
}
