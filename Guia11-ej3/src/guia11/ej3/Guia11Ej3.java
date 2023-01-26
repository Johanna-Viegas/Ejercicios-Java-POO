/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia11Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        ServicioDivNum ser = new ServicioDivNum();
        DivisionNumero d = new DivisionNumero();
        
        String n1;
        String n2;
        
        System.out.println("Ingrese dos numeros a dividir");
        n1 = leer.next();
        n2 = leer.next();
        
        try{
            d = ser.crear(n1, n2);
        } catch (InputMismatchException e){
            System.out.println("InputMismatchException hay caracteres q no son numero");
        } catch (NumberFormatException b){
            System.out.println("no es un formato tipo numero");
        }
        
        try{
            ser.division(d);
        } catch (ArithmeticException a){
            System.out.println("Imposible dividir por cero");
        }
    }
    
}
