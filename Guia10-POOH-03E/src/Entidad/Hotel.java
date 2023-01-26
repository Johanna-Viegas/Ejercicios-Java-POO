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
public class Hotel extends Alojamiento{
    protected Integer qHabit;
    protected Integer nCamas;
    protected Integer qPisos;
    protected Integer precioHabit;

    public Hotel() {
    }

    public Hotel(Integer qHabit, Integer nCamas, Integer qPisos, Integer precioHabit, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.qHabit = qHabit;
        this.nCamas = nCamas;
        this.qPisos = qPisos;
        this.precioHabit = precioHabit;
    }

    public Integer getqHabit() {
        return qHabit;
    }

    public void setqHabit(Integer qHabit) {
        this.qHabit = qHabit;
    }

    public Integer getnCamas() {
        return nCamas;
    }

    public void setnCamas(Integer nCamas) {
        this.nCamas = nCamas;
    }

    public Integer getqPisos() {
        return qPisos;
    }

    public void setqPisos(Integer qPisos) {
        this.qPisos = qPisos;
    }

    public Integer getPrecioHabit() {
        return precioHabit;
    }

    public void setPrecioHabit(Integer precioHabit) {
        this.precioHabit = precioHabit;
    }
    
    public static Comparator<Hotel> comparadorHotel = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel e1, Hotel e2){
            return e2.getPrecioHabit().compareTo(e1.getPrecioHabit());
        }
    };
}
