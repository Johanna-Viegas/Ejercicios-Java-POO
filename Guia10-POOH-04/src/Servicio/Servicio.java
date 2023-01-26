/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circulo;
import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Servicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearCirculo(){
        Circulo c = new Circulo();
        System.out.println("CREANDO CIRCULO...");
        System.out.print("RADIO: ");
        c.setRadio(leer.nextInt());
        System.out.print("DIAMETRO: ");
        c.setDiametro(c.getRadio()*2);
        System.out.println(c.getDiametro());
        c.area();
        c.perimetro();

    }
    
    public void crearRectangulo(){
        Rectangulo r = new Rectangulo();
        System.out.println("CREANDO RECTANGULO...");
        System.out.print("BASE: ");
        r.setBase(leer.nextDouble());
        System.out.print("ALTURA: ");
        r.setAltura(leer.nextDouble());
        r.area();
        r.perimetro();

    }
}
