/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.poo.ej5;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio c = new CuentaServicio();
        Cuenta cb = c.AltaCuenta();
        int select = 0;
        do{
        System.out.println("");
        System.out.println("MENU");
        System.out.println("1- Ingresar");
        System.out.println("2- Retirar");
        System.out.println("3- Extraccion Rapida");
        System.out.println("4- Consultar Saldo");
        System.out.println("5- Consultar Datos");
        System.out.println("6- Salir");
        System.out.println("");
        select = leer.nextInt();
        switch (select){
            case 1:
                c.ingresar(cb);
                break;
            case 2:
                c.retirar(cb);
                break;
            case 3:
                c.extraccionRapida(cb);
                break;
            case 4:
                c.consultarSaldo(cb);
                break;
            case 5:
                c.consultarDatos(cb);
                break;
        }
        } while (select != 6);
        
    }
    
}
