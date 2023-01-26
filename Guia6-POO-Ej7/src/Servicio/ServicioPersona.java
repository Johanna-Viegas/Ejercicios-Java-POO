/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioPersona {
    /*
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje.
    nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.
    */
    
    public Persona CrearPersona(){
       
        Persona p = new Persona();
       Scanner leer = new Scanner(System.in);
       System.out.println("Introducir su nombre");
       p.setNombre(leer.next());
        System.out.println("Introducir su edad");
        p.setEdad(leer.nextInt());
        System.out.println("Introducir su sexo (H-M-O)");
        checksex(p);
        System.out.println("Introducir su peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Introducir altura");
        p.setAltura(leer.nextDouble());
        return p;
    }
    
    public void checksex(Persona p){
        Scanner leer = new Scanner(System.in);
        p.setSexo(leer.next());
        while ((p.getSexo().equalsIgnoreCase("H")) && (p.getSexo().equalsIgnoreCase("M")) && (p.getSexo().equalsIgnoreCase("O"))){
            System.out.println("Sexo incorrecto, reintroducir sexo");
            p.setSexo(leer.next());
        }
    }
    
    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
    */
    
    public double calcularIMC(Persona p){
        double IMC = p.getPeso()/(Math.pow(p.getAltura(),2));
        if (IMC<20){
            return -1;
        } else if (IMC<26 && IMC>19) {
            return 0;
        } else {
            return 1;
        }
    }
    
    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
    */
    
    public boolean esMayorDeEdad(Persona p) throws Exception{
        if(p.getEdad()<=0){
             throw new Exception("Edad Erronea, numero negativo");
            }
        return p.getEdad()>17;
    }
}
