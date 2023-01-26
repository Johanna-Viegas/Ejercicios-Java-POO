/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioCafetera {
    public Cafetera newCafetera(){
        Scanner leer = new Scanner(System.in);
        Cafetera nCaf = new Cafetera();
        System.out.println("tamaño de cafetera: 8 tazas (1600 ml)");
        nCaf.setCapacidadMaxima(1600);
        System.out.println("capacidad actural: 0 ml");
        nCaf.setCantidadActual(0);
        return nCaf;
    }
    
    public void llenarCafetera(Cafetera nCaf){
        nCaf.setCantidadActual(nCaf.getCapacidadMaxima());
    }
    
    /*
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
    */
    public void agregarCafe(int llenado, Cafetera nCaf){
        if ((nCaf.getCantidadActual() + llenado)< nCaf.getCapacidadMaxima() ){
            nCaf.setCantidadActual(nCaf.getCantidadActual() + llenado);
            System.out.println("Cantidad introducida");
        } else {
            nCaf.setCantidadActual(nCaf.getCapacidadMaxima());
        }
        
    }
    
    /*
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
    */
    public void servirTaza (int tamanio, Cafetera nCaf){
        if (nCaf.getCantidadActual()<tamanio){
            System.out.println("llenando...");
            System.out.println("cafetera vacia, se cargo " + nCaf.getCantidadActual());
            nCaf.setCantidadActual(0);
        } else {
            System.out.println("llenando...");
            System.out.println("cafe listo!");
            nCaf.setCantidadActual(nCaf.getCantidadActual() - tamanio);
        }
    }
    
    /*
    Método vaciarCafetera(): pone la cantidad de café actual en cero.
    */
    public void vaciarCafetera(Cafetera nCaf){
        nCaf.setCantidadActual(0);
    }
    
}
