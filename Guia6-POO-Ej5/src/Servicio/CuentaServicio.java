package Servicio;


import Entidad.Cuenta;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class CuentaServicio {
    public Cuenta AltaCuenta(){
        Cuenta cb = new Cuenta();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar su DNI");
        cb.setDNI(leer.nextInt());
        while(cb.getDNI()>99999999){
            System.out.println("DNI incorrecto, reingrese su DNI");
            cb.setDNI(leer.nextInt());
        }
        System.out.println("Ingresar numero de cuenta");
        cb.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingresar el Saldo Actual");
        cb.setSaldoActual(leer.nextInt());
        return cb;
    }
    
    public void ingresar(Cuenta cb){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea ingresar?");
        int ingreso = leer.nextInt();
        cb.setSaldoActual((int) (cb.getSaldoActual()+ingreso));
    }
    
    public void retirar(Cuenta cb){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar?");
        int ret = leer.nextInt();
        if (ret>cb.getSaldoActual()){
            cb.setSaldoActual(0);
        } else {
            cb.setSaldoActual((int) (cb.getSaldoActual() - ret));
        }
    }
    
    public void extraccionRapida(Cuenta cb){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar? (Monto maximo a retirar de " + (cb.getSaldoActual()*0.2));
        int ret = leer.nextInt();
        if (ret>(cb.getSaldoActual()*0.2)){
            System.out.println("ERROR: Saldo a retirar excedido");
        } else {
            cb.setSaldoActual((int) (cb.getSaldoActual() - ret));
        }
    }
    
    public void consultarSaldo(Cuenta cb){
        System.out.println("Saldo actual: " + cb.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta cb){
        System.out.println("DNI: " + cb.getDNI());
        System.out.println("Numero de Cuenta: " + cb.getNumeroCuenta());
        System.out.println("Saldo actual: " + cb.getSaldoActual());
    }
}
