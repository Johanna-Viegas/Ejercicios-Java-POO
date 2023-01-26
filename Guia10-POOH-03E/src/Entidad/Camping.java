/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class Camping extends ExtraHotel {
    
    private Integer qMaxCarpa;
    private Integer qBanos;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(Integer qMaxCarpa, Integer qBanos, boolean restaurant, boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.qMaxCarpa = qMaxCarpa;
        this.qBanos = qBanos;
        this.restaurant = restaurant;
    }

    public Integer getqMaxCarpa() {
        return qMaxCarpa;
    }

    public void setqMaxCarpa(Integer qMaxCarpa) {
        this.qMaxCarpa = qMaxCarpa;
    }

    public Integer getqBanos() {
        return qBanos;
    }

    public void setqBanos(Integer qBanos) {
        this.qBanos = qBanos;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "--------NOMBRE " + nombre + " Camping -------- "
                + "Carpas " + qMaxCarpa
                + "Cantidad de Baños" + qBanos
                + "Tiene restaurant " +  restaurant
                + "Es privado " + privado;
    }
    
    
}
