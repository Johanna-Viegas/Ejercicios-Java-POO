/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Windows 10
 */
public class Baraja {
    
    private ArrayList< Carta> cartas;

    public ArrayList< Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    
}
