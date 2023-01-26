/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.pooh.pkg03e;

import Entidad.Alojamiento;
import Entidad.Hotel;
import Servicio.ServicioExtraHoteles;
import Servicio.ServicioHoteles;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia10POOH03E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioExtraHoteles seh = new ServicioExtraHoteles();
        ServicioHoteles sh = new ServicioHoteles();
        
        ArrayList<Alojamiento> seharr = new ArrayList<>();
        ArrayList<Hotel> sharr = new ArrayList<>();
        
        seharr = seh.crearExtraHotel();
        sharr = sh.crearHotel();
        
        sh.precioHabit(sharr);
        
        int rta = 0;
        do{
            System.out.println("---MENU---");
            System.out.println("1- Ver Alojamientos");
            System.out.println("2- Ver Hoteles $$ - $");
            System.out.println("3- Ver Camping con Restaurantes");
            System.out.println("4- Ver Residencias con Descuento al Gremio");
            System.out.println("5- Salir");
            rta = leer.nextInt();
            switch(rta){
                case 1:
                   seh.imprimirHoteles(seharr);
                   sh.imprimirHoteles(sharr);
                   break;
                case 2:
                    sharr.sort(Hotel.comparadorHotel);
                    sh.imprimirHoteles(sharr);
                    break;
                case 3:
                    seh.imprimirHotelesRestaurant(seharr);
                    break;
                case 4:
                    seh.imprimirHotelesGremio(seharr);
                    break;
                
                    
            }
        } while (rta <5 && rta >0);
    }
    
}
