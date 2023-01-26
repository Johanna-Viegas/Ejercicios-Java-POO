/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alojamiento;
import Entidad.Estrellas4;
import Entidad.Estrellas5;
import Entidad.Hotel;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioHoteles {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Hotel> crearHotel(){
        
        Hotel a = new Estrellas4('A', "Buen Comer", 50, 60, 100, 5, 0, "Buen Comer", "Av. los corrales", "Tigre", "Jeremias");
        Hotel a1 = new Estrellas4('B', "Capuccino", 20, 50, 80, 3, 0, "Capuccino", "Av. los horneros", "bahia blanca", "Mias");
        Hotel a2 = new Estrellas4('B', "Exquisito", 150, 100, 800, 10, 0, "Exquisito", "Av. los pajaros", "CABA", "Jerem");
        Hotel a3 = new Estrellas4('A', "Otro mundo", 200, 30, 40, 4, 0, "Otro mundo", "Av. los caminos", "CABA", "Carlos");
        
        Hotel b = new Estrellas5(2, 10, 2, 'B',"Otro mundo", 200, 30, 40, 4, 0, "Otro mundo", "Av. los caminos", "CABA", "Carlos");
        Hotel b1 = new Estrellas5(5, 20, 7, 'A', "Exquisito", 150, 100, 800, 10, 0, "Exquisito", "Av. los pajaros", "CABA", "Jerem");
        Hotel b2 = new Estrellas5(3, 30, 15, 'A', "Buen Comer", 50, 60, 100, 5, 0, "Buen Comer", "Av. los corrales", "Tigre", "Jeremias");
        Hotel b3 = new Estrellas5(7, 80, 30, 'B', "Capuccino", 20, 50, 80, 3, 0, "Capuccino", "Av. los horneros", "bahia blanca", "Mias");
        
        ArrayList<Hotel> hs = new ArrayList<>();
        
        hs.add(a);
        hs.add(a1);
        hs.add(a2);
        hs.add(a3);
        hs.add(b);
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        
        return hs;
    }
    
    public void precioHabit(ArrayList<Hotel> hs){
        for (Alojamiento h : hs) {
            int precio = 0;
            char a = 'A';
            if(h instanceof Estrellas4){
                precio = 50+ ((Estrellas4) h).getnCamas();
                if(((Estrellas4) h).getCapacRest()<30){
                    precio +=10;
                }
                if(((Estrellas4) h).getCapacRest()<=50 && ((Estrellas4) h).getCapacRest()>=30){
                    precio +=30;
                }
                if(((Estrellas4) h).getCapacRest()>50){
                    precio +=50;
                }
                if(((Estrellas4) h).getGim()=='A'){
                    precio += 50;
                }
                if(((Estrellas4) h).getGim()=='B'){
                    precio += 30;
                }
                ((Estrellas4) h).setPrecioHabit(precio);
            }
            if(h instanceof Estrellas5){
                precio = 50+ ((Estrellas5) h).getnCamas();
                if(((Estrellas5) h).getCapacRest()<30){
                    precio +=10;
                }
                if(((Estrellas5) h).getCapacRest()<=50 && ((Estrellas5) h).getCapacRest()>=30){
                    precio +=30;
                }
                if(((Estrellas5) h).getCapacRest()>50){
                    precio +=50;
                }
                if(((Estrellas5) h).getGim()=='A'){
                    precio += 50;
                }
                if(((Estrellas5) h).getGim()=='B'){
                    precio += 30;
                }
                precio += ((Estrellas5) h).getqLimo();
                ((Estrellas5) h).setPrecioHabit(precio);
            }
            
        }
    }
    
    public void imprimirHoteles(ArrayList<Hotel> hs){
        for (Alojamiento h : hs) {
            if(h instanceof Estrellas5){
                System.out.println(((Estrellas5) h).toString());
            }
            if(h instanceof Estrellas4){
                System.out.println(((Estrellas4) h).toString());
            }
        }
    }
    
    
}
