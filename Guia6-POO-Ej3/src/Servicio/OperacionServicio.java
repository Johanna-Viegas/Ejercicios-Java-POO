/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class OperacionServicio {
    
    public Operacion crearOperacion(){
        Operacion op = new Operacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar los numeros a operar");
        op.setNumero1(leer.nextInt());
        op.setNumero2(leer.nextInt());
        return op;
    }
    
    public int suma(Operacion op){
        int sum = op.getNumero1() + op.getNumero2();
        return sum;
    }
    
    public int resta(Operacion op){
        int res = op.getNumero1() - op.getNumero2();
        return res;
    }
    
    public int multiplicar(Operacion op){
        int mul = 0;
        if (op.getNumero2()==0 || op.getNumero1()==0 ){
            System.out.println("Uno de los numeros ingresados es 0 (Cero)");
            return mul;
        } else {
            mul= op.getNumero1()*op.getNumero2();
            return mul;
        }
    }
    
    public int dividir(Operacion op){
        int div = 0;
        if (op.getNumero2()==0 || op.getNumero1()==0 ){
            System.out.println("Uno de los numeros ingresados es 0 (Cero)");
            return div;
        } else {
            div= op.getNumero1()/op.getNumero2();
            return div;
        }
    }
            
}
