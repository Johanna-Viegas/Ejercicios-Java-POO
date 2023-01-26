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
public class Residencia extends ExtraHotel{
    
    private Integer qHabit;
    private boolean descGremio;
    private boolean cpoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer qHabit, boolean descGremio, boolean cpoDeportivo, boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.qHabit = qHabit;
        this.descGremio = descGremio;
        this.cpoDeportivo = cpoDeportivo;
    }

    public Integer getqHabit() {
        return qHabit;
    }

    public void setqHabit(Integer qHabit) {
        this.qHabit = qHabit;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCpoDeportivo() {
        return cpoDeportivo;
    }

    public void setCpoDeportivo(boolean cpoDeportivo) {
        this.cpoDeportivo = cpoDeportivo;
    }
    
    @Override
    public String toString() {
        return "--------NOMBRE " + nombre + " Camping -------- "
                + "Cantidad de habitaciones " + qHabit
                + "Tiene descuentos al gremio " +  descGremio
                + "Tiene campo deportivo " +  cpoDeportivo
                + "Es privado " + privado;
    }
    
}
