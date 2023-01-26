/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class CircunferenciaServicio {
    
    public Circunferencia crearCircunferencia(){
        Circunferencia c = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de su circunferencia");
        c.setRadio(leer.nextDouble());
        return c;
    }
    
    public void area(Circunferencia c){
        c.setArea(3.14 * Math.pow(c.getRadio(),2));
        System.out.println("El area de tu circunferencia es: " + c.getArea());
        
    }
    
    public void perimetro(Circunferencia c){
        c.setPerimetro(2 * 3.14 * c.getRadio());
        System.out.println("El perimetro de tu circunferencia es: " + c.getPerimetro());
    }

}
