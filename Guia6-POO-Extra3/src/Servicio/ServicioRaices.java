/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioRaices {
    
    public Raices crearRaices(){
        Scanner leer = new Scanner(System.in);
        Raices raices = new Raices();
        System.out.println("Ingresar A");
        raices.setA(leer.nextDouble());
        System.out.println("Ingresar B");
        raices.setB(leer.nextDouble());
        System.out.println("Ingresar C");
        raices.setC(leer.nextDouble());
        return raices;
    }
    
    /*
    Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    
    public double getDiscriminante(Raices raices){
        return (Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC());
    }
    
    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    
    public boolean tieneRaices(double discriminante){
        return discriminante >0;
    }
    
    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
    */

    public boolean tieneRaiz(double discriminante){
        return discriminante ==0;
    }   
    
    /*
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
    Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
    */
    
    public void obtenerRaices(Raices raices, double discriminante){
        if (tieneRaices(discriminante)){
            double rta1 = (-raices.getB()+ Math.sqrt((Math.pow(raices.getB(), 2) - (4* raices.getA() * raices.getC()))))/(2* raices.getA());
            double rta2 = (-raices.getB()- Math.sqrt((Math.pow(raices.getB(), 2) - (4* raices.getA() * raices.getC()))))/(2* raices.getA());
            System.out.println("Las dos posibles soluciones son: " + rta1 + " y " + rta2);
        }
    }
    
    /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
    */
     public void obtenerRaiz(Raices raices, double discriminante){
        if (tieneRaiz(discriminante)){
            double rta = (-raices.getB()/(2* raices.getA()));
            System.out.println("La solucion es: " + rta);
        }
    }
     
     /*
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
     */
     
     
}
