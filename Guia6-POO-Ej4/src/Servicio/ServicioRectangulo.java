/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioRectangulo {
    
    public Rectangulo CrearRectangulo() {
    Rectangulo r = new Rectangulo();
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresar la altura del rectangulo");
    r.setAltura(leer.nextDouble());
    System.out.println("Ingresar la base del rectangulo");
    r.setBase(leer.nextDouble());
    return r;
}
    public double Superficie(Rectangulo r){
        double sup = r.getBase()*r.getAltura();
        return sup;
    }
            
    public double Perimetro(Rectangulo r){
        double per =( r.getBase()+r.getAltura())*2;
        return per;
    }
    
    public void Dibujo(Rectangulo r){
        for (int i = 0; i < r.getBase(); i++) {
            System.out.print("* ");
        }
        System.out.println("");
        for (int i = 0; i < r.getAltura(); i++) {
            System.out.print("* ");
            for (int j = 0; j < (r.getBase()-2); j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println("");
        }
        for (int i = 0; i < r.getBase(); i++) {
            System.out.print("* ");
        }
    }
          
}
