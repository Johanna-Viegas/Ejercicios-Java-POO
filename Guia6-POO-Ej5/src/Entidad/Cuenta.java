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
public class Cuenta {
    private int numeroCuenta;
    private int DNI;
    private int saldoActual;
    private int interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getDNI() {
        return DNI;
    }

    public int getInteres() {
        return interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
     
    
}
