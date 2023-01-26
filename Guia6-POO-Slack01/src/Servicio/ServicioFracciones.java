/*
Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. 
 */
package Servicio;

import Entidad.Fracciones;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioFracciones {
    
    public Fracciones crearFraccion(){
        Scanner leer = new Scanner(System.in);
        Fracciones f = new Fracciones();
        System.out.println("Intresar primer fraccion");
        f.setNumerador1(leer.nextInt());
        f.setDenominador1(leer.nextInt());
        System.out.println("Intresar segunda fraccion");
        f.setNumerador2(leer.nextInt());
        f.setDenominador2(leer.nextInt());      
        return f;
    }
    
    /*
    Sumar fracciones
    */
    
    public void suma(Fracciones f){
        int sumaNumerador = ((f.getNumerador1()*f.getDenominador2())+( f.getNumerador2()*f.getDenominador1()));
        int sumaDenominador = f.getDenominador1() * f.getDenominador2();
        System.out.println("La suma de " + f.getNumerador1() + "/" + f.getDenominador1() + " + " + f.getNumerador2() + "/" + f.getDenominador2() + "= " + sumaNumerador + "/" + sumaDenominador);
    }
    
     /*
    Restar fracciones
    */
    public void resta(Fracciones f){
        int restaNumerador = ((f.getNumerador1()*f.getDenominador2())-( f.getNumerador2()*f.getDenominador1()));
        int restaDenominador = f.getDenominador1() * f.getDenominador2();
        System.out.println("La resta de " + f.getNumerador1() + "/" + f.getDenominador1() + " - " + f.getNumerador2() + "/" + f.getDenominador2() + "= " + restaNumerador + "/" + restaDenominador);
    }
    
     /*
    multiplicar fracciones
    */
    public void multiplicacion(Fracciones f){
        int multiplicacionNumerador = (f.getNumerador1()*f.getNumerador2());
        int multiplicacionDenominador = f.getDenominador1() * f.getDenominador2();
        System.out.println("La multiplicacion de " + f.getNumerador1() + "/" + f.getDenominador1() + " * " + f.getNumerador2() + "/" + f.getDenominador2() + "= " + multiplicacionNumerador + "/" + multiplicacionDenominador);
    }
    
      /*
    Dividir fracciones
    */
    public void division(Fracciones f){
        int divisionNumerador = (f.getNumerador1()*f.getDenominador2());
        int divisionDenominador = f.getDenominador1() * f.getNumerador2();
        System.out.println("La division de " + f.getNumerador1() + "/" + f.getDenominador1() + " : " + f.getNumerador2() + "/" + f.getDenominador2() + "= " + divisionNumerador + "/" + divisionDenominador);
    }
}
