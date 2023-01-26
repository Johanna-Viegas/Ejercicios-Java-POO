/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.pooh.pkg01e;

import Servicio.Servicio;
import java.util.Scanner;



/**
 *
 * @author Windows 10
 */
public class Guia10POOH01E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Servicio serv = new Servicio();
        serv.crearBarcos();
        serv.mostrarBarcos();
        String rta = "s";
        do{
        serv.nuevoAlquiler();
            System.out.println("Quiere cargar un alquiler nuevo?");
            leer.next();
        }while (rta=="s");
    }
    
}
