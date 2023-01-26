/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enum.Numero;
import Enum.Palo;

/**
 *
 * @author Windows 10
 */
public class Carta {
    
    private Palo palo;
    private Numero numero;

    public Carta() {
    }
    
    

    public Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;
    }



    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return palo + " - " + numero;
    }
    
    
    
}
