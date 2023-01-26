/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author Windows 10
 */
public class Estrellas4 extends Hotel{
    
    protected char gim;
    protected String nombreRest;
    protected Integer capacRest;

    public Estrellas4() {
    }

    public Estrellas4(char gim, String nombreRest, Integer capacRest, Integer qHabit, Integer nCamas, Integer qPisos, Integer precioHabit, String nombre, String direccion, String localidad, String gerente) {
        super(qHabit, nCamas, qPisos, precioHabit, nombre, direccion, localidad, gerente);
        this.gim = gim;
        this.nombreRest = nombreRest;
        this.capacRest = capacRest;
    }

    public char getGim() {
        return gim;
    }

    public void setGim(char gim) {
        this.gim = gim;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public Integer getCapacRest() {
        return capacRest;
    }

    public void setCapacRest(Integer capacRest) {
        this.capacRest = capacRest;
    }

    @Override
    public String toString() {
        return "--------NOMBRE " + nombre + " **** -------- "
                +"Gimnasio " + gim
                +"Capacidad Restaurante " + capacRest
                +"Cantidad de Habitaciones " +qHabit
                +"Cantidad de Camas " + nCamas
                +"Cantidad de Pisos " +qPisos
                +"PRECIO HABITACION "+  precioHabit;
                 
    }
    
    public static Comparator<Estrellas4> comparadorE4 = new Comparator<Estrellas4>(){
        @Override
        public int compare(Estrellas4 e1, Estrellas4 e2){
            return e2.getPrecioHabit().compareTo(e1.getPrecioHabit());
        }
    };
    
}
