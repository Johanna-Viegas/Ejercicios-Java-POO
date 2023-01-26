/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Windows 10
 */
public class ServicioExtraHoteles {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Alojamiento> crearExtraHotel(){
        
        Alojamiento a = new Camping(10, 2, true, false, 200, "Campichuelo", "Av. los corrales", "Tigre", "Jeremias");
        Alojamiento a1 = new Camping(13, 2, false , false, 600, "Incontro", "Caminito 500", "San antonio de Areco", "Claudia");
        Alojamiento a2 = new Camping(20, 4, false , true, 1200, "La Soleadita", "Av. del pasto", "Calamuchita", "Antonio");
        Alojamiento a3 = new Camping(30, 5, true , true, 1500, "Carpa", "Manuel Belgrano 300", "Piedra Pintada", "Tania");
        
        Alojamiento b = new Residencia(5, true, false, false, 80, "Ocupados",  "Av. los corrales", "Tigre", "Jeremias");
        Alojamiento b1 = new Residencia(8, false, true, true, 100, "La cumbre", "Av. del pasto", "Calamuchita", "Antonio");
        Alojamiento b2 = new Residencia(12, false, false, true, 200, "Cantimplora", "Manuel Belgrano 300", "Piedra Pintada", "Tania");
        Alojamiento b3 = new Residencia(3, true, true, true, 500, "Las mariposas","Caminito 500", "San antonio de Areco", "Claudia");
        
        ArrayList<Alojamiento> ehs = new ArrayList<>();
        ehs.add(a);
        ehs.add(a1);
        ehs.add(a2);
        ehs.add(a3);
        ehs.add(b);
        ehs.add(b1);
        ehs.add(b2);
        ehs.add(b3);
        
        return ehs;
    }
    
    public void imprimirHoteles(ArrayList<Alojamiento> ehs){
        for (Alojamiento h : ehs) {
            if(h instanceof Camping){
                System.out.println(((Camping) h).toString());
            }
            if(h instanceof Residencia){
                System.out.println(((Residencia) h).toString());
            }
        }
    }
    
    public void imprimirHotelesRestaurant(ArrayList<Alojamiento> ehs){
        for (Alojamiento h : ehs) {
            if(h instanceof Camping){
                if(((Camping) h).isRestaurant()){
                System.out.println(((Camping) h).toString());
            }
            }
        }
    }
    
    public void imprimirHotelesGremio(ArrayList<Alojamiento> ehs){
        for (Alojamiento h : ehs) {
            if(h instanceof Residencia){
                if(((Residencia) h).isDescGremio()){
                System.out.println(((Residencia) h).toString());
            }
            }
        }
    }
}
