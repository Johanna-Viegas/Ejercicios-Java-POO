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
public class Estrellas5 extends Estrellas4{
    
    private Integer qSalonConf;
    private Integer qSuite;
    private Integer qLimo;

    public Estrellas5() {
    }

    public Estrellas5(Integer qSalonConf, Integer qSuite, Integer qLimo, char gim, String nombreRest, Integer capacRest, Integer qHabit, Integer nCamas, Integer qPisos, Integer precioHabit, String nombre, String direccion, String localidad, String gerente) {
        super(gim, nombreRest, capacRest, qHabit, nCamas, qPisos, precioHabit, nombre, direccion, localidad, gerente);
        this.qSalonConf = qSalonConf;
        this.qSuite = qSuite;
        this.qLimo = qLimo;
    }

    public Integer getqSalonConf() {
        return qSalonConf;
    }

    public void setqSalonConf(Integer qSalonConf) {
        this.qSalonConf = qSalonConf;
    }

    public Integer getqSuite() {
        return qSuite;
    }

    public void setqSuite(Integer qSuite) {
        this.qSuite = qSuite;
    }

    public Integer getqLimo() {
        return qLimo;
    }

    public void setqLimo(Integer qLimo) {
        this.qLimo = qLimo;
    }
    
    @Override
    public String toString() {
        return "--------NOMBRE " + nombre + " ***** -------- "
                +"Gimnasio " + gim
                +"Capacidad Restaurante " + capacRest
                +"Cantidad de Habitaciones " +qHabit
                +"Cantidad de Camas " + nCamas
                +"Cantidad de Suites " + qSuite
                +"Cantidad de Pisos " +qPisos
                +"Cantidad de Limusinas " + qLimo
                +"PRECIO HABITACION "+  precioHabit;
                 
    }
    
    public static Comparator<Estrellas5> comparadorE5 = new Comparator<Estrellas5>(){
        @Override
        public int compare(Estrellas5 e1, Estrellas5 e2){
            return e2.getPrecioHabit().compareTo(e1.getPrecioHabit());
        }
    };
}
