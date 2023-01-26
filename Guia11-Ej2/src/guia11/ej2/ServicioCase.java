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
public class ServicioCase {
    
    Scanner leer = new Scanner(System.in);
    
    public Case crearCase(){
        Case c = new Case();
        Integer[] in = new Integer[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Introducir un numero");
            in[i]= leer.nextInt();
            
        }
        c.setNumeros(in);
        return c;
    }
    
    public void mostrar(Case c, Integer i) throws Exception{
        if(i>2){
            throw new Exception("La posicion no existe");
        }
        System.out.println("En la posicion "+ i + " esta el " );
    }
}
