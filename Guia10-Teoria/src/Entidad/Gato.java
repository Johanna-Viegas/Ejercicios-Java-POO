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
public class Gato extends Animal{
    
    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override
    public void saludo(){
       System.out.println("Miau"); 
    }
}
