/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.poo.extra6;

import Entidad.Ahorcado;
import Servicio.ServicioAhorcado;
import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioAhorcado juego = new ServicioAhorcado();
        Ahorcado ahorcado = juego.crearJuego();
        juego.longitud(ahorcado);
        String letra = "";
        do{
            System.out.println("Introduce una letra");
            letra = leer.next();
            System.out.println("");
            juego.buscar(letra, ahorcado);
            System.out.println("");
        } while ((ahorcado.getJugadasMaximas() != 0) && (ahorcado.getLetrasEnconrtadas() != ahorcado.getPalabra().length));
        if (ahorcado.getJugadasMaximas()==0){
            System.out.println("");
            System.out.println("GAME OVER, YOUR LOSE");
            System.out.println(" X  X ");
            System.out.println("  -- ");
            System.out.println("");
            System.out.print("La palabra era ");
            
        } else {
            System.out.println("WINNER");
            System.out.println("");
            juego.imprimir(ahorcado);
        }
        
    }
    
}
