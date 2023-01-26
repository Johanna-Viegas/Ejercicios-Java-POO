/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class Juego {
    
    private Revolver revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
    }

    public Juego(Revolver revolver, ArrayList<Jugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
}
