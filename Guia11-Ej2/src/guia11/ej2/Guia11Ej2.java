/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.ej2;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia11Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCase s = new ServicioCase();
        Scanner leer = new Scanner(System.in);
        
        Case c = s.crearCase();
        try{
            Integer i;
            System.out.println("Que posicion queres ver?");
            i = leer.nextInt();
            s.mostrar(c, i);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
