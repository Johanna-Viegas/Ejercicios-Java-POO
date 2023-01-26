/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.ej5;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia11Ej5 {

    Scanner leer = new Scanner(System.in); 
    
    public static void main(String[] args) {
        
        int num = (int) (Math.random()*500+1);

        for (int i = 0; i < 5; i++) {
           intentos(num); 
        }
    }
    
    public static void intentos(int num){
        int intento;
        Scanner leer = new Scanner(System.in); 
        try{
                System.out.println("Ingresar un numero");
                intento = leer.nextInt();
                
                if(intento == num){
                    System.out.println("Lo encontraste!!");
                    
                } else if (intento > num){
                    System.out.println("Te pasaste");
                } else if(intento<num){
                    System.out.println("Un poco massss");
                }
            }catch (Exception e){
                System.out.println("No es un numero valido");
            }
    }
    
}
